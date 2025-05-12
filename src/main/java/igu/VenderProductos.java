/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package igu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Celulares;
import logica.Controladora;
import logica.Productos;
import logica.UsuarioSingleton;
import logica.Usuarios;

public class VenderProductos extends javax.swing.JInternalFrame {
    //Textos

    String mensajeInfo = "Info";
    String mensajeError = "Error";
    String vacio = "No hay nada en su tabla";
    String campoVacio = "No se ha insertado ningun codigo";
    String itemNoSeleccionado = "No seleccionó ningún ítem";
    String mensajeEliminacion = "Se eliminó el celular";
    String mensajeEditado = "Se Edito el Producto";
    String tituloEliminar = "Eliminar";
    String Alerta = "Alerta";

    //Variables 
    Controladora control = null;
    Productos prod;

    boolean flagDni = false;

    // Validar que se haya seleccionado una forma de pago
    String formaDePago = null;

    private List<Productos> productosSeleccionados = new ArrayList<>();
    ButtonGroup grupoPago = new ButtonGroup();

    public VenderProductos() {
        initComponents();
        control = new Controladora();

        //Seteamos los titulos de la tabla
        initTitulosTabla();

        //Inicializamos los grupos de pago con sus Listeners
        initGruposPagos();
        
        
        //Cerrar el JFrame
        setClosable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ventaProductos = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btn_eliminarproducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_regVenta = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        label_articulos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        select_efectivo = new javax.swing.JRadioButton();
        select_transferencia = new javax.swing.JRadioButton();
        select_tarjeta = new javax.swing.JRadioButton();
        panel_dni = new javax.swing.JPanel();
        txt_dni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFocusCycleRoot(true);

        jLabel1.setText("Buscar:");

        table_ventaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_ventaProductos);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Funciones"));

        btn_eliminarproducto.setText("Eliminar Producto");
        btn_eliminarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarproductoActionPerformed(evt);
            }
        });

        jLabel2.setText("TOTAL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_eliminarproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminarproducto)
                .addGap(264, 264, 264)
                .addComponent(jLabel2))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_regVenta.setText("Registrar Venta");
        btn_regVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regVentaActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar Venta");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        label_articulos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_articulos.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("ARTICULOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(label_articulos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(label_articulos))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("TOTAL");

        label_total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_total.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label_total)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(label_total))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_regVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_regVenta)
                .addGap(18, 18, 18)
                .addComponent(btn_Cancelar)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pago"));

        select_efectivo.setText("Efectivo");
        select_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_efectivoActionPerformed(evt);
            }
        });

        select_transferencia.setText("Transferencia");
        select_transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_transferenciaActionPerformed(evt);
            }
        });

        select_tarjeta.setText("Tarjeta");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select_tarjeta)
                    .addComponent(select_transferencia)
                    .addComponent(select_efectivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_efectivo)
                .addGap(18, 18, 18)
                .addComponent(select_transferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(select_tarjeta))
        );

        panel_dni.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente"));

        jLabel4.setText("DNI:");

        javax.swing.GroupLayout panel_dniLayout = new javax.swing.GroupLayout(panel_dni);
        panel_dni.setLayout(panel_dniLayout);
        panel_dniLayout.setHorizontalGroup(
            panel_dniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_dni)
                    .addGroup(panel_dniLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_dniLayout.setVerticalGroup(
            panel_dniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscarProductoCB();
        actualizarLabelsDesdeArray(productosSeleccionados, label_articulos, label_total);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarproductoActionPerformed
        eliminarProducto();
        actualizarLabelsDesdeArray(productosSeleccionados, label_articulos, label_total);
    }//GEN-LAST:event_btn_eliminarproductoActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        cancelarVenta();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_regVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regVentaActionPerformed
        registrarVentaProductos();
    }//GEN-LAST:event_btn_regVentaActionPerformed

    private void select_transferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_transferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_transferenciaActionPerformed

    private void select_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_efectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_efectivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminarproducto;
    private javax.swing.JButton btn_regVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_articulos;
    private javax.swing.JLabel label_total;
    private javax.swing.JPanel panel_dni;
    private javax.swing.JRadioButton select_efectivo;
    private javax.swing.JRadioButton select_tarjeta;
    private javax.swing.JRadioButton select_transferencia;
    private javax.swing.JTable table_ventaProductos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_dni;
    // End of variables declaration//GEN-END:variables

    private void initTitulosTabla() {
        // Inicializar modelo de la tabla con columnas
        String[] nombresColumnas = {"Código", "Nombre", "Categoría", "Precio Unitario"};
        DefaultTableModel modeloTabla = new DefaultTableModel(nombresColumnas, 0);
        table_ventaProductos.setModel(modeloTabla);
    }

    private void buscarProductoCB() {
        // Definir modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) table_ventaProductos.getModel();

        // Obtener el código buscado
        String codigo = txt_buscar.getText().trim(); // Elimina espacios innecesarios

        // Verificar si el campo está vacío
        if (codigo.isEmpty()) {
            Utilidades.MostrarMensaje("El campo de búsqueda está vacío", "Información", "Alerta");
            return;
        }

        // Obtener productos desde el controlador
        Productos prod = control.buscarProductoCodigo(codigo);

        if (prod == null) {
            Utilidades.MostrarMensaje("No se encontro producto con ese codigo", "Información", "Alerta");
        } else {

            Object[] objProductos = {
                prod.getCodigo(),
                prod.getNombre(),
                prod.getCategoria(),
                prod.getPrecioUnitario()
            };
            modeloTabla.addRow(objProductos);

            //Añadimos el producto al array
            productosSeleccionados.add(prod);

            // Actualizar la tabla
            table_ventaProductos.setModel(modeloTabla);
            txt_buscar.setText("");
        }
    }

    private void eliminarProducto() {
        // Verificar si la tabla no está vacía
        if (table_ventaProductos.getRowCount() > 0) {
            // Verificar si se ha seleccionado una fila
            if (table_ventaProductos.getSelectedRow() != -1) {
                // Obtenemos el código del producto seleccionado
                String codigo = String.valueOf(table_ventaProductos.getValueAt(table_ventaProductos.getSelectedRow(), 0));

                // Buscar y eliminar el producto con el código del array productosSeleccionados
                for (int i = 0; i < productosSeleccionados.size(); i++) {
                    if (productosSeleccionados.get(i).getCodigo().equals(codigo)) {
                        // Eliminar el producto del array
                        productosSeleccionados.remove(i);
                        break; // Romper el bucle una vez encontrado y eliminado
                    }
                }

                // Actualizamos la tabla después de eliminar el producto
                cargarTabla();

            } else {
                // Mensaje de alerta: no se seleccionó ninguna fila
                Utilidades.MostrarMensaje("No se ha seleccionado ningún producto", "Información", "Alerta");
            }
        } else {
            // Mensaje de alerta: tabla vacía
            Utilidades.MostrarMensaje("La tabla está vacía", "Información", "Alerta");
        }
    }

    private void cargarTabla() {
        // Limpiar la tabla antes de cargarla de nuevo
        DefaultTableModel model = (DefaultTableModel) table_ventaProductos.getModel();
        model.setRowCount(0); // Esto elimina todas las filas existentes de la tabla

        // Iterar sobre los productos seleccionados y agregar cada uno a la tabla
        for (Productos producto : productosSeleccionados) {
            // Suponiendo que el Producto tiene un método que devuelve los valores para cada columna
            Object[] row = new Object[]{
                producto.getCodigo(),
                producto.getNombre(),
                producto.getCategoria(),
                producto.getPrecioUnitario()
            };
            model.addRow(row); // Agrega la fila con los valores del producto
        }
    }

    private void cancelarVenta() {
        // Limpiar la lista de productos seleccionados
        productosSeleccionados.clear();

        // Llamar al método para actualizar la tabla (vaciarla)
        cargarTabla();
    }

    private void registrarVentaProductos() {
        // Validar que haya productos
        if (productosSeleccionados == null || productosSeleccionados.isEmpty()) {
            Utilidades.MostrarMensaje("No hay productos en la tabla.", "Información", "Alerta");
            return;
        }

        if (formaDePago == null) {
            Utilidades.MostrarMensaje("Debe seleccionar una forma de pago.", "Información", "Alerta");
            return;
        }

        // Registrar la venta
        Usuarios usuarioActual = UsuarioSingleton.getInstance();
        LocalDate fechaActual = LocalDate.now();
        String dniCliente = "null"; // Inicializamos como null por defecto

        if (flagDni) {
            String dni = txt_dni.getText().trim();
            if (dni.isEmpty()) {
                Utilidades.MostrarMensaje("Debe ingresar DNI del Cliente.", "Información", "Alerta");
                return;
            }
            if (dni.length() >= 7 && dni.matches("\\d+")) {
                dniCliente = dni; // Guardamos un DNI válido
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un DNI válido");
                return;
            }
        } else {
            dniCliente = "null"; // Para pagos en efectivo u otros que no requieran DNI
        }

        control.registrarVentaProductos(usuarioActual.getId(), productosSeleccionados, fechaActual, formaDePago, dniCliente);
        Utilidades.MostrarMensaje("Productos Vendidos registrados exitosamente.", "Información", "Exito");
        cancelarVenta();
        grupoPago.clearSelection(); // Asegurate de tener este grupo declarado en tu clase
    }

    public void actualizarLabelsDesdeArray(List<Productos> productosSeleccionados, JLabel label_articulos, JLabel label_total) {
        int cantidad = productosSeleccionados.size();
        double total = 0;

        for (Productos prod : productosSeleccionados) {
            total += prod.getPrecioUnitario();
        }

        label_articulos.setText(String.valueOf(cantidad));
        label_total.setText("$" + String.valueOf(total));
    }

    private void initGruposPagos() {
        grupoPago.add(select_efectivo);
        grupoPago.add(select_tarjeta);
        grupoPago.add(select_transferencia);

        select_efectivo.addActionListener(e -> reqDNI());
        select_tarjeta.addActionListener(e -> reqDNI());
        select_transferencia.addActionListener(e -> reqDNI());

    }

    private void reqDNI() {

        if (select_efectivo.isSelected()) {
            formaDePago = "Efectivo";
            panel_dni.setEnabled(false); // Se desactiva visualmente
            txt_dni.setEditable(false);
            txt_dni.setText("");
            flagDni = false;
        } else {
            panel_dni.setEnabled(true); // Se desactiva visualmente
            txt_dni.setEditable(true);

            if (select_transferencia.isSelected()) {
                formaDePago = "Transferencia";
                flagDni = true;
            }

            if (select_tarjeta.isSelected()) {
                formaDePago = "Tarjeta";
                flagDni = true;
            }
        }
    }

}
