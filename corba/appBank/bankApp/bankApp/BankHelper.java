package bankApp;


/**
* bankApp/BankHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../Bank.idl
* dimanche 4 décembre 2016 15 h 44 CET
*/

abstract public class BankHelper
{
  private static String  _id = "IDL:bankApp/Bank:1.0";

  public static void insert (org.omg.CORBA.Any a, bankApp.Bank that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static bankApp.Bank extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (bankApp.BankHelper.id (), "Bank");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static bankApp.Bank read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BankStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, bankApp.Bank value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static bankApp.Bank narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof bankApp.Bank)
      return (bankApp.Bank)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      bankApp._BankStub stub = new bankApp._BankStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static bankApp.Bank unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof bankApp.Bank)
      return (bankApp.Bank)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      bankApp._BankStub stub = new bankApp._BankStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
