package bankApp;

/**
* bankApp/AccountHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* dimanche 4 décembre 2016 16 h 11 CET
*/

public final class AccountHolder implements org.omg.CORBA.portable.Streamable
{
  public bankApp.Account value = null;

  public AccountHolder ()
  {
  }

  public AccountHolder (bankApp.Account initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = bankApp.AccountHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    bankApp.AccountHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return bankApp.AccountHelper.type ();
  }

}
