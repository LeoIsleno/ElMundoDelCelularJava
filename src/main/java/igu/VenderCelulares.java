package igu;

import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
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
    String Alerta = "Alerta";

    Controladora control = null;
    Celulares cel;

    boolean flagIncluyeCargador = false;
    boolean flagIncluyeFunda = false;
    boolean flagIncluyeVidrio = false;

    //Usuarios user
    public VenderCelulares() {
        control = new Controladora();
        //user = new Usuarios();
        initComponents();
        setClosable(true);
        cargarTabla();

        //user.setNombreVendedor("Leo");
        //Seteamos los campos no editables
        setCamposNoEditables();
        //setChBoxAdicionales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCelDisponible = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_cantTelefonos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_precioTotal = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_costoTotal = new javax.swing.JLabel();
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
        chbox_detalles = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_detalles = new javax.swing.JTextArea();
        txt_valorDejado = new javax.swing.JTextField();
        chbox_dejaValor = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        chbox_IncCarg = new javax.swing.JCheckBox();
        chbox_IncVid = new javax.swing.JCheckBox();
        chbox_IncFunda = new javax.swing.JCheckBox();

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Cantidad Telefonos:");

        txt_cantTelefonos.setText("00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_cantTelefonos)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cantTelefonos))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Precio Total:");

        txt_precioTotal.setText("000.000.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_precioTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_precioTotal))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Costo Total:");

        txt_costoTotal.setText("0.0.000.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txt_costoTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_costoTotal))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        chbox_detalles.setText("¿Tiene Detalles?");
        chbox_detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbox_detallesActionPerformed(evt);
            }
        });

        txt_detalles.setColumns(20);
        txt_detalles.setRows(5);
        txt_detalles.setEnabled(false);
        jScrollPane2.setViewportView(txt_detalles);

        txt_valorDejado.setEnabled(false);

        chbox_dejaValor.setText("¿Se toma parte de pago un celular?");
        chbox_dejaValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbox_dejaValorActionPerformed(evt);
            }
        });

        jLabel49.setText("$");

        chbox_IncCarg.setText("¿Incluye Cargador?");
        chbox_IncCarg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbox_IncCargActionPerformed(evt);
            }
        });

        chbox_IncVid.setText("¿Incluye Vidrio templado?");
        chbox_IncVid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbox_IncVidActionPerformed(evt);
            }
        });

        chbox_IncFunda.setText("¿Incluye Funda?");
        chbox_IncFunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbox_IncFundaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_vender)
                        .addGap(40, 40, 40)
                        .addComponent(bnt_Cancelar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chbox_IncCarg)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(chbox_detalles, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_seleccionar))
                                    .addComponent(txt_NumeroTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_SeleccionCel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_formaPago, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(chbox_dejaValor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(txt_valorDejado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(chbox_IncVid)
                                .addComponent(chbox_IncFunda)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox_detalles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_valorDejado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox_dejaValor)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox_IncCarg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox_IncFunda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox_IncVid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_vender)
                    .addComponent(bnt_Cancelar))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venderActionPerformed
        registrarVenta();
        try {
            crearRemitoPDF();
        } catch (PrinterException ex) {
            Utilidades.MostrarMensaje("no se pudo realizar la impresion debido a: " + ex, "Error", "Falla al imprimir");
            Logger.getLogger(VenderCelulares.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void chbox_detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbox_detallesActionPerformed
        if (chbox_detalles.isSelected()) {
            txt_detalles.setEditable(true);
            txt_detalles.setEnabled(true);
        } else {
            txt_detalles.setEditable(false);
            txt_detalles.setEnabled(false);
        }

    }//GEN-LAST:event_chbox_detallesActionPerformed

    private void chbox_dejaValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbox_dejaValorActionPerformed
        if (chbox_dejaValor.isSelected()) {
            txt_valorDejado.setEditable(true);
            txt_valorDejado.setEnabled(true);
        } else {
            txt_valorDejado.setEditable(false);
            txt_valorDejado.setEnabled(false);
        }
    }//GEN-LAST:event_chbox_dejaValorActionPerformed

    private void chbox_IncCargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbox_IncCargActionPerformed
        if (chbox_IncCarg.isSelected()) {
            flagIncluyeCargador = true;
        } else {
            flagIncluyeCargador = false;
        }
    }//GEN-LAST:event_chbox_IncCargActionPerformed

    private void chbox_IncVidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbox_IncVidActionPerformed
        if (chbox_IncVid.isSelected()) {
            flagIncluyeVidrio = true;
        } else {
            flagIncluyeVidrio = false;
        }
    }//GEN-LAST:event_chbox_IncVidActionPerformed

    private void chbox_IncFundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbox_IncFundaActionPerformed
        if (chbox_IncFunda.isSelected()) {
            flagIncluyeFunda = true;
        } else {
            flagIncluyeFunda = false;
        }
    }//GEN-LAST:event_chbox_IncFundaActionPerformed

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

        //Actualizamos precios, costos y cantidad de celulares
        actualizarTotales(listaCelulares);

        //Asignamos a la tabla el modelo de tabla creado
        TablaCelDisponible
                .setModel(modeloTabla);
    }

    private void actualizarTotales(List<Celulares> listaCelulares) {
        int cantidad = 0;
        double costoTotal = 0;
        double precioTotal = 0;

        for (Celulares celu : listaCelulares) {
            if ("Disponible".equals(celu.getEstado())) {
                cantidad++;
                if (celu.getCosto() != null) {
                    String costoStr = celu.getCosto().replace(".", "");
                    costoTotal += Double.parseDouble(costoStr);
                }
                if (celu.getPrecio() != null) {
                    String precioStr = celu.getPrecio().replace(".", "");
                    precioTotal += Double.parseDouble(precioStr);
                }
            }
        }

        // Formateador para separar con punto cada mil y sin decimales si no hay
        NumberFormat formato = NumberFormat.getInstance(new Locale("es", "AR"));
        formato.setMaximumFractionDigits(2);
        formato.setMinimumFractionDigits(0);
        formato.setGroupingUsed(true); // para usar puntos como separador de miles

        txt_cantTelefonos.setText(String.valueOf(cantidad));
        txt_costoTotal.setText("$" + formato.format(costoTotal));
        txt_precioTotal.setText("$" + formato.format(precioTotal));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCelDisponible;
    private javax.swing.JButton bnt_Cancelar;
    private javax.swing.JButton btn_seleccionar;
    private javax.swing.JButton btn_vender;
    private javax.swing.JCheckBox chbox_IncCarg;
    private javax.swing.JCheckBox chbox_IncFunda;
    private javax.swing.JCheckBox chbox_IncVid;
    private javax.swing.JCheckBox chbox_dejaValor;
    private javax.swing.JCheckBox chbox_detalles;
    private javax.swing.JComboBox<String> cmb_formaPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_NumeroTelefono;
    private javax.swing.JTextField txt_SeleccionCel;
    private javax.swing.JLabel txt_cantTelefonos;
    private javax.swing.JLabel txt_costoTotal;
    private javax.swing.JTextArea txt_detalles;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JLabel txt_precioTotal;
    private javax.swing.JTextField txt_valorDejado;
    // End of variables declaration//GEN-END:variables

    private void registrarVenta() {
        boolean estadoSeleccionCel = seleccionarCelular();
        if (estadoSeleccionCel) {
            //Datos del formulario
            String nombreCliente = txt_nombreCliente.getText();
            String numTelefono = txt_NumeroTelefono.getText();
            String formaPago = (String) cmb_formaPago.getSelectedItem();
            Usuarios usuarioActual = UsuarioSingleton.getInstance();
            String detalles = "No se registro detalles en el equipo.";
            String valorDejado = "0";
            String incluyeFunda = "NO";
            String incluyeVidrio = "NO";
            String incluyeCargador = "NO";

            if (flagIncluyeCargador) {
                incluyeCargador = "SI";
            }

            if (flagIncluyeVidrio) {
                incluyeVidrio = "SI";
            }
            if (flagIncluyeFunda) {
                incluyeFunda = "SI";
            }

            if (chbox_detalles.isSelected()) {
                detalles = txt_detalles.getText();
            }

            if (chbox_dejaValor.isSelected()) {
                valorDejado = txt_valorDejado.getText();
            }

            if (nombreCliente.equals("") && numTelefono.equals("")) {
                //Mensje
                Utilidades.MostrarMensaje("Completa todos los campos", mensajeError, Alerta);
            } else {
                LocalDate fechaActual = LocalDate.now();

                //Enviamos al a controladora los datos a subir a la BD
                control.registrarVenta(fechaActual, nombreCliente, numTelefono, usuarioActual.getNombreVendedor(),
                        formaPago, this.cel, valorDejado, detalles, incluyeFunda, incluyeVidrio, incluyeCargador);

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

    private void crearRemitoPDF() throws PrinterException {
        // Traer todas las ventas
        List registroCelularesVendidos = control.traerRegistrosVentas();

        try {
            // Crear la carpeta de recibos si no existe
            File directorio = new File(Utilidades.CARPETA_RECIBOS);
            if (!directorio.exists()) {
                directorio.mkdirs();  // Crear el directorio si no existe
            }

            // Crear el recibo de venta
            Utilidades.crearReciboVenta(registroCelularesVendidos, this.cel, flagIncluyeCargador, flagIncluyeFunda, flagIncluyeVidrio);

            // Mensaje de éxito
            Utilidades.MostrarMensaje("Recibo de venta creado correctamente.", "Info", "Éxito");

            // Imprimir el último PDF generado de la carpeta
            Utilidades.imprimirUltimoPDFGenerado(Utilidades.CARPETA_RECIBOS);

        } catch (IOException ex) {
            Utilidades.MostrarMensaje("No se pudo crear recibo por: " + ex, "Error", "Error al imprimir");
            Logger.getLogger(VenderCelulares.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
