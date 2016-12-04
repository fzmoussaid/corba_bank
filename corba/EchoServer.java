import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;

public class EchoServer
{
    public static void main(String args[])
    {
	try{
	    ORB orb = ORB.init(args, null);  
	    // create and initialize the ORB
	    // get reference to rootpoa & activate the POAManager
	    org.omg.CORBA.Object objRef = orb.resolve_initial_references("RootPOA");
	    POA rootpoa = POAHelper.narrow(objRef);
	    rootpoa.the_POAManager().activate();
	    // get the naming service
	    objRef = orb.resolve_initial_references("NameService");
	    NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
	    // instanciate the servant
	    EchoImpl echoImpl = new EchoImpl();
	    // get object reference from servant
	    objRef = rootpoa.servant_to_reference(echoImpl);
	    // convert the generic CORBA object reference into typed Echo reference
	    Echo echoRef = EchoHelper.narrow(objRef);
	    // bind the object reference in the naming service
	    NameComponent path[ ] = ncRef.to_name("echo.echo"); 
	    // id.kind
	    ncRef.rebind(path, echoRef);
	    orb.run(); 
	    // start server...
	}catch(Exception e){
	
	}
    }
}
