package bankApp;


/**
* bankApp/BankPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* dimanche 4 décembre 2016 16 h 11 CET
*/

public abstract class BankPOA extends org.omg.PortableServer.Servant
 implements bankApp.BankOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("create", new java.lang.Integer (0));
    _methods.put ("destroy", new java.lang.Integer (1));
    _methods.put ("connect", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // bankApp/Bank/create
       {
         bankApp.Account $result = null;
         $result = this.create ();
         out = $rh.createReply();
         bankApp.AccountHelper.write (out, $result);
         break;
       }

       case 1:  // bankApp/Bank/destroy
       {
         bankApp.Account a = bankApp.AccountHelper.read (in);
         this.destroy (a);
         out = $rh.createReply();
         break;
       }

       case 2:  // bankApp/Bank/connect
       {
         this.connect ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:bankApp/Bank:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Bank _this() 
  {
    return BankHelper.narrow(
    super._this_object());
  }

  public Bank _this(org.omg.CORBA.ORB orb) 
  {
    return BankHelper.narrow(
    super._this_object(orb));
  }


} // class BankPOA
