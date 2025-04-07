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
import logica.VentasCelulares;

public class Estadisticas extends javax.swing.JInternalFrame {

    //Variables 
    private List<VentasCelulares> listaRegistrosVentas;
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
        txt_TarjDiaAcc = new javax.swing.JLabel();
        txt_EfecDiaAcc = new javax.swing.JLabel();
        txt_TraDiaAcc = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null));
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null));
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

        jLabel10.setText("Transferencias");

        jLabel11.setText("Efectivo");

        jLabel12.setText("Tarjeta");

        txt_TarjDiaAcc.setText("######");

        txt_EfecDiaAcc.setText("######");

        txt_TraDiaAcc.setText("######");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_TraDiaAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_TarjDiaAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_EfecDiaAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_TraDiaAcc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_EfecDiaAcc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TarjDiaAcc)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_EfecDia;
    private javax.swing.JLabel txt_EfecDia1;
    private javax.swing.JLabel txt_EfecDia2;
    private javax.swing.JLabel txt_EfecDiaAcc;
    private javax.swing.JLabel txt_TarjDia;
    private javax.swing.JLabel txt_TarjDia1;
    private javax.swing.JLabel txt_TarjDia2;
    private javax.swing.JLabel txt_TarjDiaAcc;
    private javax.swing.JLabel txt_TraDia;
    private javax.swing.JLabel txt_TraDia1;
    private javax.swing.JLabel txt_TraDia2;
    private javax.swing.JLabel txt_TraDiaAcc;
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
        Map<String, Double> ventasPorMes = new HashMap<>();

        // Establecer el formato para el nombre del mes en español
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", new Locale("es"));

         for (VentasCelulares venta : ventas) {
            // Convertir la fecha de venta de Date a LocalDate
            LocalDate fecha = venta.getFechaVenta().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String nombreMes = fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es"));

            // Convertir el precio y el costo de String a double
            double precio = Double.parseDouble(venta.getCelular().getPrecio());
            double costo = Double.parseDouble(venta.getCelular().getCosto());
            double ganancia = precio - costo;

            // Sumar la ganancia al mes correspondiente
            ventasPorMes.put(nombreMes, ventasPorMes.getOrDefault(nombreMes, 0.0) + ganancia);
        }


        // Crear una cadena con la información de las ventas por mes
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<String, Double> entry : ventasPorMes.entrySet()) {
            resultado.append("Dinero en ").append(entry.getKey()).append(": $").append(entry.getValue()).append("\n");
            
        }
        return resultado.toString();
    }

    private void cargEstVentAccCelular() {
        
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

}
