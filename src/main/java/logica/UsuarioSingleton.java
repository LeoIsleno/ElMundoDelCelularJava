package logica;

public class UsuarioSingleton {

    private static Usuarios instance;

    // Constructor privado para evitar instanciación
    private UsuarioSingleton() {
    }

    // Método para obtener la única instancia de Usuarios
    public static Usuarios getInstance() {
        if (instance == null) {
            instance = new Usuarios();
        }
        return instance;
    }

    // Método para establecer la instancia de Usuarios
    public static void setInstance(Usuarios user) {
        instance = user;
    }
}
