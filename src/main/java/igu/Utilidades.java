package igu;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import logica.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class Utilidades {

    // ✅ Carpeta de recibos con ruta absoluta en el home del usuario
    public static final String CARPETA_RECIBOS = System.getProperty("user.home") + File.separator + "Recibos Venta Celulares";

    public static void MostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);

        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(null, titulo);
        dialog.setVisible(true);
        dialog.setAlwaysOnTop(true);
    }

    public static void crearReciboVenta(List<VentasCelulares> listaVentas, Celulares cel,
                                        boolean flagIncluyeCargador, boolean flagIncluyeFunda,
                                        boolean flagIncluyeVidrio) throws IOException {

        LocalDate currentDate = getCurrentDate();
        VentasCelulares ventaNueva = traerUltimaVenta(listaVentas);
        String numRemito = String.valueOf(ventaNueva.getId());

        // ✅ Asegurar carpeta de destino
        File dir = new File(CARPETA_RECIBOS);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // ✅ Ruta del archivo de salida
        String dest = CARPETA_RECIBOS + File.separator + "Venta_N_" + numRemito + ".pdf";

        try {
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            try (Document document = new Document(pdf)) {

                // Encabezado
                float[] columnWidths = {2, 2};
                Table table = new Table(UnitValue.createPercentArray(columnWidths));
                table.setWidth(UnitValue.createPercentValue(100));

                Cell cellImage = new Cell();
                cellImage.add(new Paragraph("El Mundo del Celular").setFontSize(16).setBold());
                cellImage.add(new Paragraph("Reparación - Liberación").setFontSize(10));
                cellImage.add(new Paragraph("Accesorios - Venta de").setFontSize(10));
                cellImage.add(new Paragraph("Equipos Nuevos y Usados").setFontSize(10));
                cellImage.add(new Paragraph("Duarte Quirós 1563").setFontSize(12).setBold());
                cellImage.setTextAlignment(TextAlignment.LEFT);
                cellImage.setBorder(null);
                table.addCell(cellImage);

                Cell cellDetails = new Cell();
                cellDetails.add(new Paragraph("Fecha: " + currentDate).setFontSize(10).setTextAlignment(TextAlignment.RIGHT));
                cellDetails.add(new Paragraph("N° Remito: " + numRemito).setFontSize(10).setTextAlignment(TextAlignment.RIGHT));
                cellDetails.add(new Paragraph(" ").setFontSize(10)); // Espacio en blanco
                cellDetails.add(new Paragraph("Tel Fijo: 8985926").setFontSize(10).setTextAlignment(TextAlignment.RIGHT));
                cellDetails.add(new Paragraph("Num Celular: 351-6263575").setFontSize(10).setTextAlignment(TextAlignment.RIGHT));
                cellDetails.add(new Paragraph("Instagram: @ElMundodelcelularcba").setFontSize(10).setTextAlignment(TextAlignment.RIGHT));
                cellDetails.setBorder(null);
                table.addCell(cellDetails);

                // Tabla de datos del celular
                Table tableVentaCel = new Table(5);
                tableVentaCel.addCell(new Cell().add("Dispositivo").setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add("Marca").setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add("Almacenamiento").setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add("Ram").setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add("IMEI").setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add(cel.getNombreDisp()).setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add(cel.getMarca()).setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add(cel.getAlmacenamiento()).setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add(cel.getRam()).setFontSize(10).setTextAlignment(TextAlignment.CENTER));
                tableVentaCel.addCell(new Cell().add(cel.getImei()).setFontSize(10).setTextAlignment(TextAlignment.CENTER));

                // Añadir al documento
                document.add(table);
                document.add(new Paragraph("Nombre del comprador: " + ventaNueva.getNombreCliente()).setFontSize(10).setBold());
                document.add(new Paragraph("Numero de telefono del comprador: " + ventaNueva.getNumeroCliente()).setFontSize(10).setBold());
                document.add(new Paragraph("Nombre del Vendedor Responsable: " + ventaNueva.getResponsable()).setFontSize(10).setBold());

                document.add(new Paragraph("Detalles de compra:").setFontSize(10));
                document.add(tableVentaCel);
                document.add(new Paragraph("Detalles: " + ventaNueva.getDetalles()).setFontSize(8));
                document.add(new Paragraph("Se toma por parte de pago la cantidad de $: " + ventaNueva.getValorDejado()).setFontSize(8));

                if (flagIncluyeCargador || flagIncluyeVidrio || flagIncluyeFunda) {
                    document.add(new Paragraph("Con la compra se incluye lo/s accesorio/s:").setFontSize(8));
                    if (flagIncluyeCargador) document.add(new Paragraph("    Cargador acorde a stock").setFontSize(8));
                    if (flagIncluyeVidrio) document.add(new Paragraph("    Vidrio templado acorde al modelo del celular").setFontSize(8));
                    if (flagIncluyeFunda) document.add(new Paragraph("    Funda acorde al modelo del celular").setFontSize(8));
                }

                document.add(new Paragraph("El equipo cuenta con 30 días de garantía a partir de la fecha de entrega, cubriendo únicamente fallas de funcionamiento. Quedan excluidos daños ocasionados por golpes, humedad o mal uso.").setFontSize(10).setBold());
                document.add(new Paragraph("TOTAL A COBRAR: $" + cel.getPrecio()).setFontSize(15).setBold().setTextAlignment(TextAlignment.RIGHT));
            }

            System.out.println("✅ PDF creado exitosamente en: " + dest);

        } catch (FileNotFoundException e) {
            System.out.println("❌ Problemas al crear el PDF: " + e.getMessage());
        }
    }

    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    private static VentasCelulares traerUltimaVenta(List<VentasCelulares> listaVentas) {
        VentasCelulares ventaMaxId = new VentasCelulares();
        ventaMaxId.setId(0);
        if (listaVentas != null) {
            for (VentasCelulares venta : listaVentas) {
                if (venta.getId() > ventaMaxId.getId()) {
                    ventaMaxId = venta;
                }
            }
        }
        return ventaMaxId;
    }

    public static File obtenerUltimoPDFGenerado(String directorio) {
        File carpeta = new File(directorio);
        File[] archivos = carpeta.listFiles((dir, nombre) -> nombre.toLowerCase().endsWith(".pdf"));

        if (archivos == null || archivos.length == 0) {
            return null;
        }

        Arrays.sort(archivos, Comparator.comparingLong(File::lastModified).reversed());
        return archivos[0];
    }

    public static void imprimirUltimoPDFGenerado(String directorio) throws PrinterException, IOException {
        File ultimoPDF = obtenerUltimoPDFGenerado(directorio);

        if (ultimoPDF != null) {
            System.out.println("🖨️ Archivo a imprimir: " + ultimoPDF.getAbsolutePath());
            PDDocument document = PDDocument.load(ultimoPDF);
            PrinterJob job = PrinterJob.getPrinterJob();
            if (job.printDialog()) {
                job.setPageable(new PDFPageable(document));
                job.print();
            }
        } else {
            System.out.println("⚠️ No se encontraron archivos PDF en el directorio especificado.");
        }
    }
}
