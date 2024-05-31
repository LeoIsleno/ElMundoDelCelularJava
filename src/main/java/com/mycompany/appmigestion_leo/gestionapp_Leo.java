package com.mycompany.appmigestion_leo;

import igu.Login;
import igu.Principal;
import logica.Usuarios;

public class gestionapp_Leo {
    
    public static void main(String[] args) {
        Login log = new Login();
        log.setVisible(true);
    }

    public static void initApp() {
        Principal prin = new Principal();
        prin.setVisible(true);
    }
}
