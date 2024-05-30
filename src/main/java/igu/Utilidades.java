package igu;

import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.color.WebColors;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.ILineDrawer;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import logica.*;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class Utilidades {

    //Funcion general para mostrar un mensaje por pantalla
    public static void MostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);

        // Utiliza las constantes de JOptionPane para identificar el tipo de mensaje
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(null, titulo);
        dialog.setVisible(true);
        dialog.setAlwaysOnTop(true);
    }

    static void crearReciboVenta(List<VentasCelulares> listaVentas, Celulares cel) throws IOException {

        LocalDate currentDate = getCurrentDate();

        //Buscamos la ultima venta realizada registrada en la BD para imprimir
        VentasCelulares ventaNueva = traerUltimaVenta(listaVentas);
        //Seteamos el numero de remito con la ID asociada
        String numRemito = String.valueOf(ventaNueva.getId());

        String dest = "Venta N° " + numRemito + ".pdf";

        try {
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            // Crear la tabla para el encabezado
            try (Document document = new Document(pdf)) {
                // Crear la tabla para el encabezado
                float[] columnWidths = {1, 3};
                Table table = new Table(UnitValue.createPercentArray(columnWidths));
                table.setWidth(UnitValue.createPercentValue(100));

                // Celda de la imagen (izquierda)
                Cell cellImage = new Cell();
                cellImage.add(new Paragraph("El Mundo del Celular")
                        .setFontSize(16)
                        .setBold());
                cellImage.add(new Paragraph("Reparación - Liberación")
                        .setFontSize(10));
                cellImage.add(new Paragraph("Accesorios - Venta de")
                        .setFontSize(10));
                cellImage.add(new Paragraph("Equipos Nuevos y Usados")
                        .setFontSize(10));
                cellImage.add(new Paragraph("Duarte Quirós 1563")
                        .setFontSize(12)
                        .setBold());
                cellImage.setTextAlignment(TextAlignment.LEFT);
                cellImage.setBorder(null);
                table.addCell(cellImage);

                // Celda de los detalles (derecha)
                Cell cellDetails = new Cell();
                cellDetails.add(new Paragraph("Fecha: " + currentDate)
                        .setFontSize(10)
                        .setTextAlignment(TextAlignment.RIGHT));
                cellDetails.add(new Paragraph("N° Remito: " + numRemito)
                        .setFontSize(10)
                        .setTextAlignment(TextAlignment.RIGHT));
                cellDetails.add(new Paragraph(" ")
                        .setFontSize(10)); // Espacio en blanco
                cellDetails.add(new Paragraph("Tel Fijo: 8985926")
                        .setFontSize(10)
                        .setTextAlignment(TextAlignment.RIGHT));
                cellDetails.add(new Paragraph("Num Celular: 351-6263575")
                        .setFontSize(10)
                        .setTextAlignment(TextAlignment.RIGHT));
                cellDetails.add(new Paragraph("Instagram: @ElMundodelcelularcba")
                        .setFontSize(10)
                        .setTextAlignment(TextAlignment.RIGHT));
                cellDetails.setBorder(null);

                table.addCell(cellDetails);

                Table tableVentaCel = new Table(5); // Crear una tabla con 2 columnas

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

                // Añadir la tabla al documento
                document.add(table);
                //Separador
                document.add(new Paragraph("Nombre del comprador: " + ventaNueva.getNombreCliente()).setFontSize(10).setBold());
                document.add(new Paragraph("Numero de telefono del comprador: " + ventaNueva.getNumeroCliente()).setFontSize(10).setBold());

                document.add(new Paragraph("Detalles de compra:").setFontSize(10));
                //tabla de informacion
                document.add(tableVentaCel);
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("TOTAL: $" + cel.getPrecio()).setFontSize(15).setBold().setTextAlignment(TextAlignment.RIGHT));
            }
            System.out.println("PDF creado exitosamente en " + dest);
        } catch (FileNotFoundException e) {
            System.out.println("Problemas al imprimir");
        }
    }

    private static void addHeaderCell(Table table, String text, PdfFont font) {
        Cell cell = new Cell().add(text);
        cell.setFont(font);
        cell.setFontSize(12);
        cell.setBold();
        cell.setTextAlignment(TextAlignment.CENTER);
        table.addCell(cell);
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

}
