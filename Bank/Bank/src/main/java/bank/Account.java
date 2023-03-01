package bank;

public class Account {
	private long accno;
    private String name;
    private double bal;
    Account(long an,String n,double b){
        this.accno=an;
        this.name=n;
        this.bal=b;
    }
    void deposite(double d){
        this.bal=this.bal+d;
    }
    void withdraw(double d){
        this.bal=this.bal-d;
    }
    double display(){
        return this.bal;
    }
}
