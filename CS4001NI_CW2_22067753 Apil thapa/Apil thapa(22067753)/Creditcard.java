
public class Creditcard extends Bankcard //using inheritance to inherit parent and child class
{
    //assigning variables with respective data types.
     private int cvc_number;
     private double credit_limit;
     private double interest_rate;
     private String expiration_date;
     private int grace_period;
     private boolean isgranted;
     
     public Creditcard(int card_id,String client_name,String issuer_bank,String bank_account,int balance_amount,
     int cvc_number,double interest_rate,String expiration_date)
     {// creating constructor and passing parameter into it.
         super(balance_amount,card_id,bank_account,issuer_bank);//using super keyword and passing formal parameter.
         this.cvc_number=cvc_number;//using this keyword to update cvc number.
         this.setclient_name(client_name);
         this.interest_rate=interest_rate;//using this keyword to update interest rate.
         this.expiration_date=expiration_date;//using this keyword to update expiration rate.
         this.isgranted=false;//using this keyword to set isgranted to false.
         
     }
     
     //using accessor method for all attributes
     public int getcvc_number()
     {
         return this. cvc_number;
     }
     
     public double getcredit_limit()
     {
         return this.credit_limit;
     }
     
     public double getinterest_rate()
     {
         return this.interest_rate;
     }
     
     public String getexpiration_date()
     {
         return this.expiration_date;
     }
     
     public int getgrace_period()
     {
         return this.grace_period;
     }
     
     public  boolean getisgranted()
     {
         return this.isgranted;
     }
     
     public void setcreditlimit(int credit_limit,int grace_period)
     {//create method and passed all parameters with date type
         
         if(credit_limit<=(2.5*getbalance_amount()))
         {//using if condition here..
             
             System.out.print("credit granted");
             this.isgranted=true;
             this.credit_limit=credit_limit;
             this.grace_period=grace_period;
             
             
         }
         else
         {
             
             System.out.print(" your credit can't be granted/issued");
             
         }
         
         
     }
     
     public void cancelcreditcard()
     {//method cancelcreditcard to cancel it.
         cvc_number=0;
         grace_period=0;
         credit_limit=0;
         isgranted=false;
 
         
     }
        
     public void display()
     {//method display to check if card is granted or not using if else.
         super.display();
         if(isgranted==true) 
         {
            System.out.println("CVC: " + cvc_number+"\n");
            System.out.println("Credit Limit: " + credit_limit+"\n");
            System.out.println("Grace Period: " + grace_period+"\n");
         }
        else 
        {
            System.out.println("Credit Card is not granted.");
             System.out.println("cvc number is "+cvc_number);
              System.out.println("grace_period is :."+grace_period);
              System.out.println("credit limit is is :."+credit_limit);
            
        }
     }
     }
     
         
     

