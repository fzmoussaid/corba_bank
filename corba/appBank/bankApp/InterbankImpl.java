import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;
import org.omg.CosNaming.*;
import java.util.*;

class InterbankImpl extends InterbankPOA
{  

    
    ArrayList<Transfer> transfers;
    POA rootpoa;

    public InterbankImpl(){
	transfers = new ArrayList<Transfer>();
    }
    
    public InterbankImpl(POA p)
    {
	transfers = new ArrayList<Transfer>();
	rootpoa = p;
    }


    private void transfer (Transfer transfer){
	try{
	    transfer.to.deposit(transfer.sum);
	    transfer.from.withdraw(transfer.sum);
	}
	catch(Exception e){
	    System.out.println("Transfer exception: " + e.getMessage());  
	    e.printStackTrace();
	}
	
    }
    
    public void put(Transfer transfer){
	transfers.add(transfer);
    }

    public Transfer get(int ref){
	return transfers.get(ref);
    }

}
