package client;

<<<<<<< HEAD
=======
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
>>>>>>> c3f29bf7d38765418781f138fb2c8b53770fdd4a
import servers.CenterServer;

public class ManagerClient {
	public static void main(String[] args) throws Exception {
		Manager manager1 = new Manager();
		manager1.managerID = "MTL1111";
		
		Registry registry = LocateRegistry.getRegistry(3000);
		CenterServer centerServer = (CenterServer) registry.lookup("MTLCenter");
		centerServer.createSRecord("Grey", "Lee", "Math", "active", "2017/06/01");
		System.out.println("Create Student Record");
		
		
	}

}
