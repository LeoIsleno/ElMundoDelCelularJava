package igu;

import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    private JInternalFrame internalFrame; // Mantener una referencia al InternalFrame

    //private LoginFormFrame loginForm;
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_registrar_equipo = new javax.swing.JMenu();
        btn_Registrar_Celular = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrincipal.setBackground(new java.awt.Color(204, 255, 204));
        VentanaPrincipal.setForeground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenuItem btn_Registrar_Celular;
    private javax.swing.JMenu btn_registrar_equipo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
