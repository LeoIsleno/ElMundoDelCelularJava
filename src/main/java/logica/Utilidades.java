import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class Utilidades {
    
    //Funcion general para mostrar un mensaje por pantalla
    public static void MostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        // Utiliza las constantes de JOptionPane para identificar el tipo de mensaje
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(null, titulo);
        dialog.setVisible(true);
        dialog.setAlwaysOnTop(true);
    }
}
