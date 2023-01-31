package assignment1;
import java.util.logging.Logger;
class Account{
	    private String accno;
	    private String name;
	    private long bal;
	    Account(String an,String n,long b){
	        this.accno=an;
	        this.name=n;
	        this.bal=b;
	    }
	    void deposite(long d){
	        this.bal=this.bal+d;
	    }
	    void withdraw(long d){
	        this.bal=this.bal-d;
	    }
	    long display(){
	        return this.bal;
	    }
	}
	public class Bank {
	    public static void main(String[] args){
	    	Logger l = Logger.getLogger("com.api.jar");
	        Account b = new Account("2R44435" , "JANANI" ,200000);
	        b.deposite(12000);
	        b.withdraw(1000);
	        long l1 = b.display();
	        l.info("YOUR CURRENT BALANCE IS "+l1);
	    }
	    
	}

