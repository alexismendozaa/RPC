import java.rmi.Remote;
import java.rmi.RemoteException;

// Interfaz remota
public interface HelloService extends Remote {
    String sayHello(String name) throws RemoteException;
}
