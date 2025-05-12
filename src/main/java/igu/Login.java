package igu;

import com.mycompany.appmigestion_leo.gestionapp_Leo;
import java.awt.Color;
import java.util.List;
import logica.Controladora;
import logica.UsuarioSingleton;
import logica.Usuarios;

public class Login extends javax.swing.JFrame {

    Controladora control = null;
    private List<Usuarios> listUser = null;

    public Login() {
        this.setUndecorated(true); // Esto elimina toda la barra de título y bordes
        initComponents();
        control = new Controladora();
        /*
        //Borrar
        txt_user.setText("Jefe"); 
        txt_pass.setText("Belgrano4274");
        */
        
        this.setBackground(new Color(23, 33, 43));
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_ingresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_pass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseClicked(evt);
            }
        });
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btn_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addComponent(txt_pass)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(jButton2))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
      
        initLogin();
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    public void initLogin() {

//        Usuarios us = new Usuarios();
//        us.setNombreVendedor("Leo");
//        us.setPass("Leo");
//        us.setPass("123");
//
//        control.guardarUsuario(us);
        String user = txt_user.getText();
        String pass = txt_pass.getText();
        boolean flagUserEncontrar = false;

        listUser = control.getUsers();
        if (!"".equals(user) && !"".equals(pass)) {
            for (Usuarios usuario : listUser) {
                if (usuario.getUser().equals(user) && usuario.getPass().equals(pass)) {
                    UsuarioSingleton.setInstance(usuario); // Guardar el usuario en el singleton
                    flagUserEncontrar = true;
                    gestionapp_Leo.initApp();
                    this.dispose();
                    break; // Salir del bucle una vez que se encuentra el usuario
                }
            }
        }
        if (!flagUserEncontrar) {
            Utilidades.MostrarMensaje("Usuario o Contraseña Invalida", "Error", "Inicio Sesion");
        }
    }
}
