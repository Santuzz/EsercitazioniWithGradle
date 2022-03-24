package objectoriented.bankaccountv1;

public abstract class BankAccount {
    double balance;
    String IBAN;

    public BankAccount(String cc, double money){
        balance = money;
        IBAN = cc;
    }

    public String getIBAN(){
        return IBAN;
    }

    public void setIBAN(String cc){
        IBAN = cc;
    }

    public abstract double addAnnualInterest();

    public void deposit(double money){
        balance += money;
    }

    public double getBalance(){
        return balance;
    }

    public abstract String getCountry();


}
