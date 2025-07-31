package igu;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import logica.Controladora;
import logica.Productos;
import logica.VentasCelulares;

public class Estadisticas extends javax.swing.JInternalFrame {

    //Variables 
    public List<VentasCelulares> listaRegistrosVentas;

    public List<Productos> listaRegistrosProductos;

    Controladora control = null;

    public Estadisticas() {
        initComponents();

        control = new Controladora();
        setClosable(true);
        cargarEstadisticas();

        cargEstVentAccCelular();

        String ventasPorMesTexto = obtenerVentasPorMes(control.traerRegistrosVentas());
        txt_infoMensual.setText(ventasPorMesTexto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_TraDia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_EfecDia = new javax.swing.JLabel();
        txt_TarjDia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_infoMensual = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_CargAcc = new javax.swing.JLabel();
        txt_VidriosAcc = new javax.swing.JLabel();
        txt_FundasAcc = new javax.swing.JLabel();
        txt_FundasPrecio = new javax.swing.JLabel();
        txt_VidriosPrecio = new javax.swing.JLabel();
        txt_CargPrecio = new javax.swing.JLabel();
        txt_FundasPrecioTot = new javax.swing.JLabel();
        txt_VidriosPrecioTot = new javax.swing.JLabel();
        txt_CargPrecioTot = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas Celular Diaria"));
        jPanel2.setToolTipText("");

        jLabel1.setText("Transferencias");

        txt_TraDia.setText("######");

        jLabel3.setText("Efectivo");

        jLabel4.setText("Tarjeta");

        txt_EfecDia.setText("######");

        txt_TarjDia.setText("######");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_TraDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_TarjDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_EfecDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_TraDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_EfecDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TarjDia)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas Celular Mensual"));
        jPanel3.setToolTipText("");

        txt_infoMensual.setColumns(20);
        txt_infoMensual.setRows(5);
        jScrollPane1.setViewportView(txt_infoMensual);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas Celular  + Accesorios"));

        jLabel10.setText("Fundas");

        jLabel11.setText("Vidrios");

        jLabel12.setText("Cargadores");

        txt_CargAcc.setText("######");

        txt_VidriosAcc.setText("######");

        txt_FundasAcc.setText("######");

        txt_FundasPrecio.setText("######");

        txt_VidriosPrecio.setText("######");

        txt_CargPrecio.setText("######");

        txt_FundasPrecioTot.setText("######");

        txt_VidriosPrecioTot.setText("######");

        txt_CargPrecioTot.setText("######");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_CargAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_FundasAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_VidriosAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CargPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FundasPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_VidriosPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CargPrecioTot, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_FundasPrecioTot, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_VidriosPrecioTot, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txt_FundasPrecioTot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_VidriosPrecioTot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_CargPrecioTot))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txt_FundasPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_VidriosPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_CargPrecio))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_FundasAcc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_VidriosAcc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_CargAcc))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_CargAcc;
    private javax.swing.JLabel txt_CargPrecio;
    private javax.swing.JLabel txt_CargPrecioTot;
    private javax.swing.JLabel txt_EfecDia;
    private javax.swing.JLabel txt_FundasAcc;
    private javax.swing.JLabel txt_FundasPrecio;
    private javax.swing.JLabel txt_FundasPrecioTot;
    private javax.swing.JLabel txt_TarjDia;
    private javax.swing.JLabel txt_TraDia;
    private javax.swing.JLabel txt_VidriosAcc;
    private javax.swing.JLabel txt_VidriosPrecio;
    private javax.swing.JLabel txt_VidriosPrecioTot;
    private javax.swing.JTextArea txt_infoMensual;
    // End of variables declaration//GEN-END:variables

    private void cargarEstadisticas() {
        // Obtener la lista de registros de ventas
        listaRegistrosVentas = control.traerRegistrosVentas();

        // Obtener la fecha actual
        Date fechaActual = getCurrentDateWithoutTime();

        // Variables para contar las ventas y el método de pago
        int totalVentas = 0;
        int ventasTransferencia = 0;
        int montoVentasTransferencia = 0;
        int ventasEfectivo = 0;
        int montoVentasEfectivo = 0;
        int ventasTarjeta = 0;
        int montoVentasTarjeta = 0;

        // Iterar sobre la lista de registros de ventas
        for (VentasCelulares venta : listaRegistrosVentas) {
            // Verificar si la venta se realizó en el día actual
            Date fechaVenta = removeTime(venta.getFechaVenta());
            if (fechaVenta.equals(fechaActual)) {
                totalVentas++;

                // Categorizar por método de pago
                String metodoPago = venta.getFormaPago();
                switch (metodoPago) {
                    case "Transferencia" -> {
                        ventasTransferencia++;
                        montoVentasTransferencia += Integer.parseInt(venta.getCelular().getPrecio());
                    }
                    case "Efectivo" -> {
                        ventasEfectivo++;
                        montoVentasEfectivo += Integer.parseInt(venta.getCelular().getPrecio());
                    }
                    case "Tarjeta" -> {
                        ventasTarjeta++;
                        montoVentasTarjeta += Integer.parseInt(venta.getCelular().getPrecio());
                    }
                    default -> {
                        // Otra categoría o manejo de error si es necesario
                    }
                }
            }

        }

        txt_TraDia.setText("$ " + montoVentasTransferencia);
        txt_TarjDia.setText("$ " + montoVentasTarjeta);
        txt_EfecDia.setText("$ " + montoVentasEfectivo);
    }

    private Date getCurrentDateWithoutTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    private Date removeTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static String obtenerVentasPorMes(List<VentasCelulares> ventas) {
        Map<Month, Double> ventasPorMes = new HashMap<>();

        for (VentasCelulares venta : ventas) {
            if (venta.getCelular() == null) {
                continue;
            }

            // Convertir la fecha de venta de Date a LocalDate
            LocalDate fecha = venta.getFechaVenta().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Month mes = fecha.getMonth();

            // Convertir el precio y el costo de String a double
            double precio = parsearNumero(venta.getCelular().getPrecio());
            double costo = parsearNumero(venta.getCelular().getCosto());
            double ganancia = precio - costo;

            // Sumar la ganancia al mes correspondiente
            ventasPorMes.put(mes, ventasPorMes.getOrDefault(mes, 0.0) + ganancia);
        }

        // Ordenar por mes y construir el string de resultado
        StringBuilder resultado = new StringBuilder();
        ventasPorMes.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    String nombreMes = entry.getKey().getDisplayName(TextStyle.FULL, new Locale("es"));
                    double ganancia = entry.getValue();
                    resultado.append("Dinero en ").append(capitalizar(nombreMes)).append(": $").append(String.format("%,.2f", ganancia)).append("\n");
                });

        return resultado.toString();
    }

    private static String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }

    private static double parsearNumero(String valor) {
        if (valor == null || valor.isEmpty()) {
            return 0.0;
        }
        valor = valor.replace(".", "").replace(",", ".");
        try {
            return Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir número: " + valor);
            return 0.0;
        }
    }

    private boolean esDelMesActual(Date fechaVenta) {
        Calendar calVenta = Calendar.getInstance();
        calVenta.setTime(fechaVenta);

        Calendar calActual = Calendar.getInstance();

        int mesVenta = calVenta.get(Calendar.MONTH);
        int anioVenta = calVenta.get(Calendar.YEAR);

        int mesActual = calActual.get(Calendar.MONTH);
        int anioActual = calActual.get(Calendar.YEAR);

        return mesVenta == mesActual && anioVenta == anioActual;
    }

    private void cargEstVentAccCelular() {

        // Obtener la lista de registros de ventas
        listaRegistrosVentas = control.traerRegistrosVentas();

        // Obtener la lista de registros de productos
        Productos prodFunda = control.traerProductosBuscado(16);
        Productos prodVidrio = control.traerProductosBuscado(19);
        Productos prodCargador = control.traerProductosBuscado(21);

        int recaudadoFunda = 0;
        int recaudadoVidrio = 0;
        int recaudadoCargador = 0;

        int totalFunda = 0;
        int totalVidrio = 0;
        int totalCargador = 0;

        for (VentasCelulares venta : listaRegistrosVentas) {
            if (esDelMesActual(venta.getFechaVenta())) {
                // Hacer algo si es del mes actual
                if (venta.getCargador().equals("SI")) {
                    recaudadoCargador += 1;
                }
                if (venta.getFunda().equals("SI")) {
                    recaudadoFunda += 1;
                }
                if (venta.getVidrio().equals("SI")) {
                    recaudadoVidrio += 1;
                }
            }
        }

        totalFunda = recaudadoFunda * prodFunda.getPrecioUnitario();
        totalVidrio = recaudadoVidrio * prodVidrio.getPrecioUnitario();
        totalCargador = recaudadoCargador * prodCargador.getPrecioUnitario();

        txt_FundasPrecio.setText(String.valueOf(prodFunda.getPrecioUnitario()));
        txt_VidriosPrecio.setText(String.valueOf(prodVidrio.getPrecioUnitario()));
        txt_CargPrecio.setText(String.valueOf(prodCargador.getPrecioUnitario()));

        txt_FundasAcc.setText(String.valueOf(recaudadoFunda));
        txt_VidriosAcc.setText(String.valueOf(recaudadoVidrio));
        txt_CargAcc.setText(String.valueOf(recaudadoCargador));

        txt_FundasPrecioTot.setText(String.valueOf(totalFunda));
        txt_VidriosPrecioTot.setText(String.valueOf(totalVidrio));
        txt_CargPrecioTot.setText(String.valueOf(totalCargador));
    }
}
