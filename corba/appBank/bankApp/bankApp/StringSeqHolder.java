package bankApp;


/**
* bankApp/StringSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../Bank.idl
* dimanche 4 décembre 2016 15 h 44 CET
*/

public final class StringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public StringSeqHolder ()
  {
  }

  public StringSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = bankApp.StringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    bankApp.StringSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return bankApp.StringSeqHelper.type ();
  }

}
