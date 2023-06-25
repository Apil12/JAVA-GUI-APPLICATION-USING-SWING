
public class Bankcard//class name
{
    /*
    assigning all instance variables with their data types(string,int,double)
     */
    private int card_id;
    private String client_name;
    private String issuer_bank;
    private String bank_account;
    private int balance_amount;

    //CREATING CONSTRUCTOR AND PASSING PARAMETERS TO IT

    public Bankcard(int balance_amount,int card_id,String bank_account,
    String issuer_bank)
    {
        //USING THIS KEYWORD TO UPDATE INSTANCE VARIABLES
        this.balance_amount=balance_amount;
        this.card_id=card_id;
        this.bank_account=bank_account;
        this.issuer_bank=issuer_bank;
        this.client_name="";//ASSIGNING CLIENT NAME WITH EMPTY STRING VALUE
    }

    //accessor method;
    public int getcard_id()
    {
        return this.card_id;
    }

    public String getclient_name()
    {
        return this.client_name;
    }

    public String getissuer_bank()
    {
        return this.issuer_bank;
    }

    public String getbank_account()
    {
        return this.bank_account;
    }

    public int getbalance_amount()
    {
        return this.balance_amount;
    }

    //mutator method..
    public void setclient_name(String client_name)
    {
        this.client_name=client_name;      
    }

    public void setbalance_amount(int balance_amount)
    {
        this.balance_amount=balance_amount;      
    }

    /*CREATING INSTANCES METHOD NAMED DISPLAY IN WHICH
    WE ARE DISPLAYING OUTPUT AND USING IF else CONDITION FOR CLIENT NAME
     */

    public void display()
    { 
        if(client_name.equals(""))
        {
            System.out.print("Please set client name");
        }
        else
        {
            //DISPLAYING OUTPUTS
            System.out.println("The card id is:"+card_id);
            System.out.println("The client name is:"+client_name);
            System.out.println("The issuer bank is:"+issuer_bank);
            System.out.println("The bank account is:"+bank_account);
            System.out.println("The balance amount is:"+balance_amount);
        }

    }
    
}
