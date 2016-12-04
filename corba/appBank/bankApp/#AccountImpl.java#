import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

class AccountImpl extends AccountPOA
{
    private int Credit;
    public void AccountImpl (){
	Credit=0;
    }
    public void deposit (int amount){
	Credit+=amount;
    }
    
    public void withdraw (int amount){
	Credit-=amount;
    }
    int balance (){
	return Credit;
    }
}
