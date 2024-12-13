import java.util.*; 

public class Main
{
	public static void main(String[] args) {
		bank user1=new bank("ahmed",500);
		user1.deposite(200);
		user1.withdraw(300);
		user1.print_data();
	}
}

class bank{
    
    private String user_name;
    private int balance;
    
    bank(String user_name,int balance){
        this.balance=balance;
        this.user_name=user_name;
    }
     public void deposite(int mon){
         this.balance+=mon;
         System.out.println("Done");
     }
     
    public void withdraw(int mon){
        if(mon>this.balance){
            System.out.println("you don;t have money");
        }else{
         this.balance-=mon;
         System.out.println("Done");}
     }
     
     public void print_data(){
         System.out.println(user_name + " "+balance);
     }
}