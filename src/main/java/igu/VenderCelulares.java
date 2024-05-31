
package igu;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import logica.Celulares;
import logica.Controladora;
import logica.UsuarioSingleton;
import logica.Usuarios;
import logica.VentasCelulares;


public class VenderCelulares extends javax.swing.JInternalFrame {
    //Textos

    String mensajeInfo = "Info";
    String mensajeError = "Error";
    String vacio = "No hay nada en su tabla";
    String itemNoSeleccionado = "No seleccionó ningún ítem";
    String mensajeEliminacion = "Se eliminó el celular";
    String mensajeEditado = "Se Edito el celular";
    String tituloEliminar = "Eliminar";
    String Alerta = "Alerta";
    
    Controladora control = null;
    Celulares cel;
    //Usuarios user;

    public VenderCelulares() {
        control = new Controladora();
        //user = new Usuarios();
        initComponents();
        setClosable(true);
        cargarTabla();

        //user.setNombreVendedor("Leo");

        //Seteamos los campos no editables
        setCamposNoEditables();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCelDisponible = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        txt_nombreCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_NumeroTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_vender = new javax.swing.JButton();
        bnt_Cancelar = new javax.swing.JButton();
        txt_SeleccionCel = new javax.swing.JTextField();
        btn_seleccionar = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        cmb_formaPago = new javax.swing.JComboBox<>();
        txt_precio = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TablaCelDisponible.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaCelDisponible.setName(""); // NOI18N
        jScrollPane1.setViewportView(TablaCelDisponible);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nombre del Cliente");

        jLabel2.setText("Numero de telefono");

        jLabel3.setText("Seleccion el tipo de telefono");

        btn_vender.setText("Registrar Venta");
        btn_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venderActionPerformed(evt);
            }
        });

        bnt_Cancelar.setText("Cancelar Venta");
        bnt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_CancelarActionPerformed(evt);
            }
        });

        btn_seleccionar.setText("Seleccionar");
        btn_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarActionPerformed(evt);
            }
        });

        jLabel46.setText("TOTAL");

        jLabel47.setText("Forma de Pago");

        cmb_formaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Efectivo", "Transferencia", "Tarjeta" }));

        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });

        jLabel48.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel47)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_seleccionar))
                    .addComponent(txt_NumeroTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombreCliente)
                    .addComponent(txt_SeleccionCel)
                    .addComponent(cmb_formaPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_vender)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bnt_Cancelar))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_NumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_seleccionar)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_SeleccionCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_formaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bnt_Cancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_vender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venderActionPerformed
        registrarVenta();
        crearRemitoPDF();
    }//GEN-LAST:event_btn_venderActionPerformed

    private void btn_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarActionPerformed
        seleccionarCelular();
    }//GEN-LAST:event_btn_seleccionarActionPerformed

    private void bnt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_CancelarActionPerformed
        cancelarVenta();
    }//GEN-LAST:event_bnt_CancelarActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    //Inicializamos la tabla con sus datos
    private void cargarTabla() {
        //Definir Modelo de tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //Seteamos filas y columnsa no es editable 
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //Creamos el objeto de la tabla con sus titulos
        String titulos[] = {"ID", "Dispositivo", "Marca", "Almacenamiento", "IMEI", "Ram", "Precio"};

        //Seteamos la tabla con los titulos
        modeloTabla.setColumnIdentifiers(titulos);

        // Traer los datos de todos los celulares
        List<Celulares> listaCelulares = control.traerCelulares();

        //Recorremos la lista y mostrar cada uno de los elementos en la tabla
        if (listaCelulares != null) {
            for (Celulares cel : listaCelulares) {
                if (cel.getEstado().equals("Disponible")) {
                    Object[] objCelulares = {
                        cel.getId(),
                        cel.getNombreDisp(),
                        cel.getMarca(),
                        cel.getAlmacenamiento(),
                        cel.getImei(),
                        cel.getRam(),
                        cel.getPrecio(),};
                    //Las añadimos a la tabla
                    modeloTabla.addRow(objCelulares);
                }
            }
        }

        //Asignamos a la tabla el modelo de tabla creado
        TablaCelDisponible.setModel(modeloTabla);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCelDisponible;
    private javax.swing.JButton bnt_Cancelar;
    private javax.swing.JButton btn_seleccionar;
    private javax.swing.JButton btn_vender;
    private javax.swing.JComboBox<String> cmb_formaPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_NumeroTelefono;
    private javax.swing.JTextField txt_SeleccionCel;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    private void registrarVenta() {
        boolean estadoSeleccionCel = seleccionarCelular();
        if (estadoSeleccionCel) {
            //Datos del formulario
            String nombreCliente = txt_nombreCliente.getText();
            String numTelefono = txt_NumeroTelefono.getText();
            String formaPago = (String) cmb_formaPago.getSelectedItem();
            Usuarios usuarioActual = UsuarioSingleton.getInstance();

            if (nombreCliente.equals("") && numTelefono.equals("")) {
                //Mensje
                Utilidades.MostrarMensaje("Completa todos los campos", mensajeError, Alerta);
            } else {
                LocalDate fechaActual = LocalDate.now();

                //Enviamos al a controladora los datos a subir a la BD
                control.registrarVenta(fechaActual, nombreCliente, numTelefono, usuarioActual.getNombreVendedor(), formaPago, this.cel);

                // Eliminan todo los campos
                limpiarCampos();

                //Volvemos a llamar a la tabla
                cargarTabla();

                //Mensje
                Utilidades.MostrarMensaje("Celular Vendido", mensajeInfo, "Venta");
            }

        } else {
            Utilidades.MostrarMensaje(itemNoSeleccionado, mensajeInfo, Alerta);
        }
    }

    private boolean seleccionarCelular() {
        // Verificar si la tabla no está vacía
        if (TablaCelDisponible.getRowCount() > 0) {
            // Verificar si se ha seleccionado una fila
            if (TablaCelDisponible.getSelectedRow() != -1) {

                //Nos devuelve todos los atributos del celular solicitado
                int id_Cel = Integer.parseInt(String.valueOf(TablaCelDisponible.getValueAt(TablaCelDisponible.getSelectedRow(), 0)));
                //Nos devuelve todos los atributos del celular solicitado
                this.cel = control.traerCelularBuscado(id_Cel);

                //Seteamos las variables para visibilizar
                txt_SeleccionCel.setText(this.cel.getNombreDisp() + " | " + this.cel.getMarca() + " | "
                        + this.cel.getAlmacenamiento() + " | " + this.cel.getRam() + "|" + this.cel.getImei());
                txt_precio.setText(this.cel.getPrecio());

                return !txt_SeleccionCel.equals("") && !txt_precio.equals("");
            } else {
                // Mensaje de alerta: no se seleccionó ninguna fila
                Utilidades.MostrarMensaje(itemNoSeleccionado, mensajeInfo, Alerta);
                return false;
            }
        } else {
            // Mensaje de alerta: tabla vacía
            Utilidades.MostrarMensaje(vacio, mensajeInfo, Alerta);
            return false;
        }
    }

    private void cancelarVenta() {
        limpiarCampos();
    }

    private void limpiarCampos() {
        txt_nombreCliente.setText("");
        txt_NumeroTelefono.setText("");
        txt_SeleccionCel.setText("");
        cmb_formaPago.setSelectedIndex(0);
        txt_precio.setText("");
        TablaCelDisponible.clearSelection();
    }

    private void setCamposNoEditables() {
        //No se puede editar el seleccion de equipo
        txt_SeleccionCel.setEditable(false);
        txt_precio.setEditable(false);
    }

    private void crearRemitoPDF() {
        //Traer todas las ventas
        List registroCelularesVendidos = control.traerRegistrosVentas();
        
        try {
            Utilidades.crearReciboVenta(registroCelularesVendidos, this.cel);
        } catch (IOException ex) {
            Logger.getLogger(VenderCelulares.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
