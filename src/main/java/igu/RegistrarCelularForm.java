package igu;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import logica.Celulares;
import logica.Controladora;
import logica.UsuarioSingleton;
import logica.Usuarios;

public class RegistrarCelularForm extends JInternalFrame {

    //Textos
    String mensajeInfo = "Info";
    String mensajeError = "Error";
    String vacio = "No hay nada en su tabla";
    String itemNoSeleccionado = "No seleccionó ningún ítem";
    String mensajeEliminacion = "Se eliminó el celular";
    String mensajeEditado = "Se Edito el celular";
    String tituloEliminar = "Eliminar";
    String Alerta = "Alerta";

    //Variables 
    Controladora control = null;
    Celulares cel;

    public RegistrarCelularForm() {
        initComponents();

        control = new Controladora();
        CargarTabla();
        SetBotones();
        setClosable(true);

        initPermision();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comb_marca = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comb_almacenamiento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comb_ram = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        txt_imei = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cel = new javax.swing.JTable();

        setName("Registrar Celular"); // NOI18N

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nombre del dispositivo");

        jLabel2.setText("Marca");

        comb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Samsung", "Motorola", "Iphone" }));

        jLabel3.setText("Almacenamiento (GB)");

        comb_almacenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "8 GB", "16 GB", "32 GB", "64 GB", "128 GB" }));

        jLabel4.setText("Ram (GB)");

        comb_ram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2 GB", "3 GB", "4 GB", "6 GB", "8 GB" }));

        jLabel6.setText("Costo de Celular ($)");

        txt_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_costoActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio de venta ($)");

        jLabel7.setText("IMEI ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_precio, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(txt_costo)
            .addComponent(txt_nombre)
            .addComponent(comb_marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comb_almacenamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comb_ram, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(0, 92, Short.MAX_VALUE))
            .addComponent(txt_imei)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(comb_almacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comb_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_imei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_guardar)
                .addGap(32, 32, 32)
                .addComponent(btn_limpiar)
                .addGap(30, 30, 30)
                .addComponent(btn_editar)
                .addGap(30, 30, 30)
                .addComponent(btn_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btn_eliminar)
                .addGap(31, 31, 31)
                .addComponent(btn_cancelar)
                .addGap(41, 41, 41))
        );

        tabla_cel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tabla_cel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_cel.getTableHeader().setResizingAllowed(false);
        tabla_cel.getTableHeader().setReorderingAllowed(false);
        tabla_cel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_celMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_cel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_celMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_celMouseClicked

    }//GEN-LAST:event_tabla_celMouseClicked

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        LimpiarCajaTexto();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        EliminarCelular();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String nombre = txt_nombre.getText();
        String costo = txt_costo.getText();
        String precio = txt_precio.getText();
        String almacenamientoIndex = (String) comb_almacenamiento.getSelectedItem();
        String marcaIndex = (String) comb_marca.getSelectedItem();
        String ramIndex = (String) comb_ram.getSelectedItem();
        String estado = "Disponible";
        String imei = txt_imei.getText();

        if (nombre.equals("") || costo.equals("")
                != precio.equals("") || almacenamientoIndex.equals("-")
                || marcaIndex.equals("-") || ramIndex.equals("-") || imei.equals("")) {

            Utilidades.MostrarMensaje("No se pueden cargar celdas vacias", "Error", Alerta);

        } else {
            control.registrarCelular(nombre, marcaIndex, almacenamientoIndex, ramIndex, costo, precio, estado, imei);
            Utilidades.MostrarMensaje("Se guardo exitosamente", "Info", "Guardado");

            //Limpiamos las cajas de texto
            LimpiarCajaTexto();

            //Volvemos a inicializar la tabla para que muestre nuevamente los datos
            CargarTabla();
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_costoActionPerformed

    }//GEN-LAST:event_txt_costoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        EditarCelulares();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        ActualizarItem();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        CancelarEdicion();
    }//GEN-LAST:event_btn_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> comb_almacenamiento;
    private javax.swing.JComboBox<String> comb_marca;
    private javax.swing.JComboBox<String> comb_ram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_cel;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_imei;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    //Inicializamos la tabla con sus datos
    private void CargarTabla() {
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
        tabla_cel.setModel(modeloTabla);
    }

    private void EliminarCelular() {
        // Verificar si la tabla no está vacía
        if (tabla_cel.getRowCount() > 0) {
            // Verificar si se ha seleccionado una fila
            if (tabla_cel.getSelectedRow() != -1) {
                int id_Cel = Integer.parseInt(String.valueOf(tabla_cel.getValueAt(tabla_cel.getSelectedRow(), 0)));
                //Lamamos a la controladora para eliminar el cel
                control.EliminarCel(id_Cel);

                // Mensaje de aviso de eliminación
                Utilidades.MostrarMensaje(mensajeEliminacion, mensajeInfo, tituloEliminar);
            } else {
                // Mensaje de alerta: no se seleccionó ninguna fila
                Utilidades.MostrarMensaje(itemNoSeleccionado, mensajeInfo, Alerta);
            }
        } else {
            // Mensaje de alerta: tabla vacía
            Utilidades.MostrarMensaje(vacio, mensajeInfo, Alerta);
        }

        // Volver a inicializar la tabla para mostrar nuevamente los datos
        CargarTabla();
    }

    private void LimpiarCajaTexto() {
        txt_nombre.setText("");
        txt_costo.setText("");
        txt_precio.setText("");
        txt_imei.setText("");
        comb_almacenamiento.setSelectedIndex(0);
        comb_marca.setSelectedIndex(0);
        comb_ram.setSelectedIndex(0);
    }

    private void EditarCelulares() {
        // Verificar si la tabla no está vacía
        if (tabla_cel.getRowCount() > 0) {
            // Verificar si se ha seleccionado una fila
            if (tabla_cel.getSelectedRow() != -1) {

                btn_guardar.setEnabled(false);
                btn_eliminar.setEnabled(false);
                btn_Actualizar.setEnabled(true);
                btn_editar.setEnabled(false);
                btn_cancelar.setEnabled(true);

                //Obtenes el ID del celular seleccionado
                int id_Cel = Integer.parseInt(String.valueOf(tabla_cel.getValueAt(tabla_cel.getSelectedRow(), 0)));

                //Nos devuelve todos los atributos del celular solicitado
                this.cel = control.traerCelularBuscado(id_Cel);

                //Seteamos los valores en la IGU
                txt_nombre.setText(cel.getNombreDisp());
                txt_costo.setText(cel.getCosto());
                txt_precio.setText(cel.getPrecio());
                comb_almacenamiento.setSelectedIndex(SeterAlmacenamiento(cel.getAlmacenamiento()));
                comb_marca.setSelectedIndex(SeterMarca(cel.getMarca()));
                comb_ram.setSelectedIndex(SeterRam(cel.getRam()));
                txt_imei.setText(cel.getImei());

            } else {
                // Mensaje de alerta: no se seleccionó ninguna fila
                Utilidades.MostrarMensaje(itemNoSeleccionado, mensajeInfo, Alerta);
            }
        } else {
            // Mensaje de alerta: tabla vacía
            Utilidades.MostrarMensaje(vacio, mensajeInfo, Alerta);
        }

        // Volver a inicializar la tabla para mostrar nuevamente los datos
        CargarTabla();
    }

    private void SetBotones() {
        btn_guardar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_Actualizar.setEnabled(false);
        btn_editar.setEnabled(true);
        btn_cancelar.setEnabled(false);
    }

    private int SeterAlmacenamiento(String almacenamiento) {
        switch (almacenamiento) {
            case "8 GB" -> {
                return 1;
            }
            case "16 GB" -> {
                return 2;
            }
            case "32 GB" -> {
                return 3;
            }
            case "64 GB" -> {
                return 4;
            }
            case "128 GB" -> {
                return 5;
            }
            default ->
                throw new AssertionError();
        }
    }

    private int SeterMarca(String marca) {
        switch (marca) {
            case "Samsung" -> {
                return 1;
            }
            case "Motorola" -> {
                return 2;
            }
            case "Iphone" -> {
                return 3;
            }
            default ->
                throw new AssertionError();
        }
    }

    private int SeterRam(String ram) {
        switch (ram) {
            case "2 GB" -> {
                return 1;
            }
            case "3 GB" -> {
                return 2;
            }
            case "4 GB" -> {
                return 3;
            }
            case "6 GB" -> {
                return 4;
            }
            case "8 GB" -> {
                return 5;
            }
            default ->
                throw new AssertionError();
        }
    }

    private void CancelarEdicion() {
        LimpiarCajaTexto();
        SetBotones();
    }

    private void ActualizarItem() {
        String nombre = txt_nombre.getText();
        String costo = txt_costo.getText();
        String precio = txt_precio.getText();
        String almacenamientoIndex = (String) comb_almacenamiento.getSelectedItem();
        String marcaIndex = (String) comb_marca.getSelectedItem();
        String ramIndex = (String) comb_ram.getSelectedItem();
        String imeiCel = txt_imei.getText();

        control.actualizarCelular(cel, nombre, marcaIndex, almacenamientoIndex, ramIndex, costo, precio, imeiCel);
        Utilidades.MostrarMensaje("Se modifico exitosamente", "Info", "Actualizado");

        //Seteamos los botones
        SetBotones();

        //Limpiamos las cajas de texto
        LimpiarCajaTexto();

        //Volvemos a inicializar la tabla para que muestre nuevamente los datos
        CargarTabla();
    }

    private void initPermision() {
        Usuarios usuarioActual = UsuarioSingleton.getInstance();

        if (!"Fabian-Jefe".equals(usuarioActual.getNombreVendedor())) {
            btn_eliminar.setEnabled(false);
            btn_editar.setEnabled(false);
        } else {
            btn_eliminar.setEnabled(true);
            btn_editar.setEnabled(true);
        }
    }
}
