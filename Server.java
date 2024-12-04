import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Crear una instancia del servicio
            HelloService service = new HelloServiceImpl();

            // Iniciar el registro RMI en el puerto 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Registrar el servicio con un nombre
            registry.rebind("HelloService", service);

            System.out.println("Servidor RMI está listo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
