package bankApp;

/**
* bankApp/InterbankHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../Bank.idl
* dimanche 4 décembre 2016 15 h 44 CET
*/

public final class InterbankHolder implements org.omg.CORBA.portable.Streamable
{
  public bankApp.Interbank value = null;

  public InterbankHolder ()
  {
  }

  public InterbankHolder (bankApp.Interbank initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = bankApp.InterbankHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    bankApp.InterbankHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return bankApp.InterbankHelper.type ();
  }

}
