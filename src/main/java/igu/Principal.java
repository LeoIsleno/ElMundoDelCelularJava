package igu;

import javax.swing.JInternalFrame;
import logica.UsuarioSingleton;
import logica.Usuarios;

public class Principal extends javax.swing.JFrame {

    private JInternalFrame internalFrame; // Mantener una referencia al InternalFrame

    //private LoginFormFrame loginForm;
    public Principal() {
        this.setUndecorated(true); // Esto elimina toda la barra de título y bordes

        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setPermision();

        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_salir = new javax.swing.JMenuItem();
        btn_registrar_equipo = new javax.swing.JMenu();
        btn_Registrar_Celular = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnMenu_Estadisticas = new javax.swing.JMenu();
        btn_estadisticasGeneral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        VentanaPrincipal.setForeground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 926, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jMenu1.add(btn_salir);

        jMenuBar1.add(jMenu1);

        btn_registrar_equipo.setText("Registrar Productos");

        btn_Registrar_Celular.setText("Registrar Celular");
        btn_Registrar_Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Registrar_CelularActionPerformed(evt);
            }
        });
        btn_registrar_equipo.add(btn_Registrar_Celular);

        jMenuBar1.add(btn_registrar_equipo);

        jMenu2.setText("Vender Productos");

        jMenuItem1.setText("Celulares");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        btnMenu_Estadisticas.setText("Estadisticas");

        btn_estadisticasGeneral.setText("Estadisticas General");
        btn_estadisticasGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadisticasGeneralActionPerformed(evt);
            }
        });
        btnMenu_Estadisticas.add(btn_estadisticasGeneral);

        jMenuBar1.add(btnMenu_Estadisticas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Registrar_CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Registrar_CelularActionPerformed

        if (internalFrame == null || internalFrame.isClosed()) {
            // Si no hay una instancia abierta o está cerrada, crea una nueva instancia
            internalFrame = new RegistrarCelularForm();
            VentanaPrincipal.add(internalFrame);
        }
        // Trae el InternalFrame existente al frente
        internalFrame.setVisible(true);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            // Manejar excepciones si es necesario
        }
    }//GEN-LAST:event_btn_Registrar_CelularActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (internalFrame == null || internalFrame.isClosed()) {
            // Si no hay una instancia abierta o está cerrada, crea una nueva instancia
            internalFrame = new VenderCelulares();
            VentanaPrincipal.add(internalFrame);
        }
        // Trae el InternalFrame existente al frente
        internalFrame.setVisible(true);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            // Manejar excepciones si es necesario
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_estadisticasGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadisticasGeneralActionPerformed
        if (internalFrame == null || internalFrame.isClosed()) {
            // Si no hay una instancia abierta o está cerrada, crea una nueva instancia
            internalFrame = new Estadisticas();
            VentanaPrincipal.add(internalFrame);
        }
        // Trae el InternalFrame existente al frente
        internalFrame.setVisible(true);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            // Manejar excepciones si es necesario
        }
    }//GEN-LAST:event_btn_estadisticasGeneralActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu btnMenu_Estadisticas;
    private javax.swing.JMenuItem btn_Registrar_Celular;
    private javax.swing.JMenuItem btn_estadisticasGeneral;
    private javax.swing.JMenu btn_registrar_equipo;
    private javax.swing.JMenuItem btn_salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

    private void setPermision() {
        Usuarios usuarioActual = UsuarioSingleton.getInstance();
        System.out.println("user:" + usuarioActual.getNombreVendedor());
        System.out.println("pass:" + usuarioActual.getPass());
        System.out.println("nombre:" + usuarioActual.getNombreVendedor());

        if (!"Fabian-Jefe".equals(usuarioActual.getNombreVendedor())) {
            btnMenu_Estadisticas.setEnabled(false);
            btnMenu_Estadisticas.setVisible(false);

        } else {
            btnMenu_Estadisticas.setEnabled(true);
            btnMenu_Estadisticas.setVisible(true);
        }
    }
}
