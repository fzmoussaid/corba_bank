package bankApp;


/**
* bankApp/BankOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* dimanche 4 décembre 2016 16 h 11 CET
*/

public interface BankOperations 
{
  bankApp.Account create ();
  void destroy (bankApp.Account a);
  void connect ();
} // interface BankOperations