package bankApp;

/**
* bankApp/insufficientFundsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../Bank.idl
* dimanche 4 décembre 2016 15 h 44 CET
*/

public final class insufficientFundsHolder implements org.omg.CORBA.portable.Streamable
{
  public bankApp.insufficientFunds value = null;

  public insufficientFundsHolder ()
  {
  }

  public insufficientFundsHolder (bankApp.insufficientFunds initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = bankApp.insufficientFundsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    bankApp.insufficientFundsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return bankApp.insufficientFundsHelper.type ();
  }

}
