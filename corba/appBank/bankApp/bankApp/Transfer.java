package bankApp;


/**
* bankApp/Transfer.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../Bank.idl
* dimanche 4 décembre 2016 15 h 44 CET
*/

public final class Transfer implements org.omg.CORBA.portable.IDLEntity
{
  public bankApp.Account to = null;
  public bankApp.Account from = null;
  public int sum = (int)0;

  public Transfer ()
  {
  } // ctor

  public Transfer (bankApp.Account _to, bankApp.Account _from, int _sum)
  {
    to = _to;
    from = _from;
    sum = _sum;
  } // ctor

} // class Transfer
