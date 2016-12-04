import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;


public class BankClient{

    public static void main(String args[]){
	try{
	    org.omg.CORBA.Object objRef;
	    org.omg.CORBA.Object accountManager, account;
	    
	    ORB orb = ORB.init(args , null);
	    //Creating the account
	    org.omg.CORBA.Request request = manager._request("create");
	    
	    request.set_return_type(orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_objref));

	    request.send_deferred();
	    while (!request.pool_response()){
	    }
	    request.get_response();

	    account = request.result().value.extract_Object();

	    //get the amount in the account
	    request = manager._request("balance");
	    
	    request.set_return_type(orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float));

	    request.invoke();
	    
	    float balance =request.return_value().extract_float();
	    
	    System.out.println("Le credit au compte est "+balance);

	    
	    //objRef = orb.resolve_initial_references("NameService");
	    //NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
	    
	    //objRef = ncRef.resolve_str("bank.bank");
	    
	    //Bank bankRef = BankHelper.narrow(objRef);
	    
	    //String response = bankRef.bankString("coucou");
	    
	    //System.out.println(response);
	}catch(Exception e){
	    //System.out.println("EchoClient Exception: ", +e.getMessage());
	    e.printStackTrace();
	}
    }    
}
