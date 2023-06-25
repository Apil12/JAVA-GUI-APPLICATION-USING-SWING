
public class Debitcard extends Bankcard//using inheritance to inherit parent and child class
{
    //assigning variables with respective data types.
     private int pin_number;
     private int withdrawal_amount;
     private String dateofwithdrawal;
     private boolean haswithdrawn;
     
    
     public Debitcard(int balance_amount,int card_id,String bank_account,
     String issuer_bank,String client_name,int pin_number)
       {
           // creating constructor and passing parameter into it.
         
            super(balance_amount,card_id,bank_account,issuer_bank);//use super keyword to call constructor from parent class.
            this.pin_number=pin_number;//using this keyword to update pin number
            this.haswithdrawn=false;//using this keyword to set haswithdrawn to false.
            setclient_name(client_name);
           
            
       }
     
     public int getpin_number()
     {
         return this.pin_number;
     }
     
     
     public int getwithdrawal_amount()
     {
         return this.withdrawal_amount;
     }
     
     public String getdateofwithdrawal()
     {
         return this.dateofwithdrawal;
     }
     
     public  boolean gethaswithdrawn()
     {
         return this.haswithdrawn;
     }
     
     public void setwithdrawal_amount(int withdrawal_amount)
     {
         this.withdrawal_amount=withdrawal_amount;
     }
     
    
    public void withdraw(int withdrawal_amount,String dateofwithdrawal,int pin_number )
      {
     //creating method and passing parameter with data types
        if(pin_number==this.pin_number)
        {
            if(getbalance_amount()- withdrawal_amount>=0)
               {
                  setbalance_amount(getbalance_amount()- withdrawal_amount);
                  this.withdrawal_amount=withdrawal_amount;
                  this.dateofwithdrawal=dateofwithdrawal;
                  this.haswithdrawn=haswithdrawn;
                  System.out.println("The balance_amount is:  "+getbalance_amount());
                  this.haswithdrawn=true;
                  
                }
                
                else
                {
                    System.out.println("insufficent balance.");
                }
        }
        
        else
        {
            System.out.print("please enter valid information:invalid pin");
        }
        
        
          
    }
      @Override
     public void display()
     {
         /*method display in which super keyword used to display output from same method of parent class
     and condition haswithdrawn is set if right then pin no,withdrawl amount,date will print if not then balanceamount printed*/
     
        super.display();
        if(haswithdrawn == true)
        {
            System.out.print("pin number is:"+pin_number+"\n");
            System.out.print("withdrawl_amount is:"+withdrawal_amount+"\n");
            System.out.print("date of withdrawal is:"+dateofwithdrawal+"\n");
               
            
        }
        
        else
         {
           
             System.out.print("Transaction not been carried out.");
         }
            
     }
}
