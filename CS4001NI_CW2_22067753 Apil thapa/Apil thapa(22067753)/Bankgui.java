import javax.swing.*;//import all swing classes with *
import java.awt.Font;//importing font
import java.awt.Color;//importing color
import java.awt.event.ActionListener;//importing actionlistener class
import java.awt.event.ActionEvent;
import java.util.ArrayList;//importing arraylist

public class Bankgui implements ActionListener//class which implements actionlistener
{
    private JFrame frame,frame2; //creating frame and frame2
    private JPanel panel1,panel2;//creating panel and panel2
    private JLabel j1,j2,nu,j3,j4,j5,a,b,d,f,h,j,a1,b1,f1,n1,x1,l1,d1,h1,x,l,n,app,app1,ap1,setcredit,grace; //adding frame
    private JTextField i1,k1,c,e,g,i,c1,e1,g1,m1,m,k,kk,kk1,setcredit1,period;//adding textfield added into panel
    private JButton o,og,og1,p1,tsg,tsg1,q1,p,q,bb,bb1,qfx,tsgx,tsge; /*adding button,combobox,label into panel which is added into frame*/
    private JComboBox<String> oa,oaa,oo,o4,o2,o3;
    private ArrayList<Bankcard> card=new ArrayList<Bankcard>();//creating arraylist of bankcard class
    private Integer xbn,ynv,xbm1,y1,x5,x6,y7,gracy,withdrawalamount;//getted variables from action performed method
    private String x3,x2,hh,y5,y6,llll,x7,yj1,setcreditl,date1,date;
    private Debitcard obj;//debitcard obj
    private Creditcard obj1;//creditcard obj

    public Bankgui()//creating constructor of class
    {

        frame=new JFrame("Debit card");//creating frame of debicard
        frame.setBounds(400,50,890,750);

        panel1=new JPanel();//creating panel for debitcard
        panel1.setBounds(40,30,900,650);

        frame2=new JFrame("Credit card");//creating frame2 of creditcard
        frame2.setBounds(350,17,950,800);

        panel2=new JPanel();//creating panel2 for creditcard
        panel2.setBounds(20,30,900,700);

        //jlabel debit gui code
        a=new JLabel("DEBIT GUI");//main label 
        a.setBounds(350,-140,250,300);
        a.setFont(new Font("sans seriff", Font.PLAIN, 30));
        Color mycolor=new Color(102, 232, 189 );//crating color object

        b=new JLabel("Card ID:");//creating label of card id
        b.setBounds(540,40,500,80);
        b.setFont(new Font("sans seriff", Font.PLAIN, 25));
        c=new JTextField();
        c.setBounds(6,220,270,45);  //pin no//textfield for pin number

        d=new JLabel("Balance amount:");//label of balance
        d.setBounds(8,40,270,90);
        d.setFont(new Font("sans seriff", Font.PLAIN, 25));
        e=new JTextField();//textfield for balance amount
        e.setBounds(6,110,270,45);

        f=new JLabel("Client name:");//textfield for client name
        f.setBounds(540,260,150,90);
        f.setFont(new Font("sans seriff", Font.PLAIN, 25));
        g=new JTextField();
        g.setBounds(535,220,270,45);//issuer bank

        h=new JLabel("Issuer bank:");//label for issuer bank
        h.setBounds(540,150,150,90);
        h.setFont(new Font("sans seriff", Font.PLAIN, 25));
        i=new JTextField();
        i.setBounds(535,330,270,45);//client name

        x=new JLabel("Bank account:");//label for bank account
        x.setBounds(8,260,190,90);
        x.setFont(new Font("sans seriff", Font.PLAIN, 25));
        k=new JTextField();
        k.setBounds(6,330,270,45);//bank account

        app=new JLabel("Withdrawal amount:");//label for withdrawal amount
        app.setBounds(8,360,290,90);
        app.setFont(new Font("sans seriff", Font.PLAIN, 25));
        kk=new JTextField();//textfield for withdrawal amount
        kk.setBounds(6,430,270,45);

        l=new JLabel("pin number:");//textfield for pin number
        l.setBounds(8,150,290,90);
        l.setFont(new Font("sans seriff", Font.PLAIN, 25));
        m=new JTextField();
        m.setBounds(535,110,270,45);// textfield for card id

        n=new JLabel("Date of withdrawal:");//label for date 
        n.setBounds(300,400,588,190);
        n.setFont(new Font("sans seriff", Font.PLAIN, 20));////////////////////////////////

        String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"};
        o2=new JComboBox<String>(day);//creating combobox with array for day
        o2.setBounds(480,475,70,40);

        String day1[]={"january","februrary","march","april","may","jun","july","august","september","october","november","december"};
        o3=new JComboBox<String>(day1);//creating combobox with array for month
        o3.setBounds(560,475,100,40);

        String day2[]={"2018","2019","2020","2021","2022","2023","2024","2025"};
        o4=new JComboBox<String>(day2);//creating commbobox with array for year
        o4.setBounds(670,475,90,40);

        p=new JButton("Add debit card");//add debit card button 
        p.setBounds(560,415,170,35);
        p.setFont(new Font("sans seriff", Font.PLAIN, 20));

        q=new JButton(" Go to Credit card");//add credit button
        q.setBounds(250,600,260,35);
        q.setFont(new Font("sans seriff", Font.PLAIN, 20));

        qfx=new JButton(" Withdraw");//withdraw button
        qfx.setBounds(520,545,220,35);
        qfx.setFont(new Font("sans seriff", Font.PLAIN, 20));

        //for debit card clear button
        bb=new JButton("clear");//cleaar button for debitcard
        bb.setBounds(290,545,170,35);
        bb.setFont(new Font("sans seriff", Font.PLAIN, 20));

        bb1=new JButton("Display");//display button for debitcard
        bb1.setBounds(30,545,170,35);
        bb1.setFont(new Font("sans seriff", Font.PLAIN, 20));

        p.setBackground(Color.red);//setting color for button background
        q.setBackground(Color.red);//setting color for button background
        bb.setBackground(Color.green);//setting color for button background
        bb1.setBackground(Color.green);//setting color for button background

        p.setForeground(Color.white);//setting color for button label
        q.setForeground(Color.white);//setting color for button label
        bb.setForeground(Color.black);//setting color for button label

        //jlabel credit  gui 
        a1=new JLabel("CREDITGUI");//creditgui main label
        a1.setBounds(350,-140,250,300);
        a1.setFont(new Font("sans seriff", Font.PLAIN, 30));

        b1=new JLabel("Interest rate:");//label interest rate
        b1.setBounds(610,65,500,90);
        b1.setFont(new Font("sans seriff", Font.PLAIN, 25));
        c1=new JTextField();
        c1.setBounds(19,234,270,45);// textield Balance amount

        d1=new JLabel("cvc number:");//label cvc
        d1.setBounds(24,60,200,90);
        d1.setFont(new Font("sans seriff", Font.PLAIN, 25));
        e1=new JTextField();
        e1.setBounds(19,129,270,45);  // textfield for cvc number

        f1=new JLabel("Card Id:");//label for card id
        f1.setBounds(24,424,300,20);
        f1.setFont(new Font("sans seriff", Font.PLAIN, 25));
        g1=new JTextField();
        g1.setBounds(605,244,270,45);// textfield for client name

        h1=new JLabel("Client name:");
        h1.setBounds(610,172,250,90);
        h1.setFont(new Font("sans seriff", Font.PLAIN, 25));
        i1=new JTextField();
        i1.setBounds(15,453,270,45);//card id

        x1=new JLabel("Issuer bank:");//label for issuer bank
        x1.setBounds(610,425,300,38);
        x1.setFont(new Font("sans seriff", Font.PLAIN, 25));
        k1=new JTextField();//textield for issuer bank
        k1.setBounds(605,463,270,45);

        app1=new JLabel("Bank account:");//label for bank account
        app1.setBounds(19,312,300,20);
        app1.setFont(new Font("sans seriff", Font.PLAIN, 25));
        kk1=new JTextField();//textfield for bank account
        kk1.setBounds(15,342,270,45);

        setcredit=new JLabel("Setcreditlimit:");//label for setcreditlimit
        setcredit.setBounds(610,322,200,40);
        setcredit.setFont(new Font("sans seriff", Font.PLAIN, 25));
        setcredit1=new JTextField();
        setcredit1.setBounds(605,359,270,45);

        grace=new JLabel("Grace period:");//label for grace period
        grace.setBounds(294,573,200,90);
        grace.setFont(new Font("sans seriff", Font.PLAIN, 25));
        period=new JTextField();//textfield for grace period
        period.setBounds(289,641,270,45);

        m1=new JTextField();
        m1.setBounds(605,129,270,45);//  textfield upper interest rate

        l1=new JLabel("Balance amount:");//label for balance amoiunt
        l1.setBounds(19,207,201,20);
        l1.setFont(new Font("sans seriff", Font.PLAIN, 25));

        n1=new JLabel("Expiration Date:");//label for date
        n1.setBounds(377,415,210,20);
        n1.setFont(new Font("sans seriff", Font.PLAIN, 20));

        String days1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        oo=new JComboBox<String>(days1);//combobox for day with array
        oo.setBounds(323,453,83,42);

        String days2[]={"january","februrary","march","april","may","jun","july","august","september","october","november","december"};
        oa=new JComboBox<String>(days2);//comboboix of month with array
        oa.setBounds(416,453,87,42);

        String days3[]={"2018","2019","2020","2021","2022","2023","2024","2025"};
        oaa=new JComboBox<String>(days3);//combobox for year with an array
        oaa.setBounds(513,453,71,42);

        p1=new JButton("Add credit Card");//button for add credit card
        p1.setBounds(331,358,190,35);
        p1.setFont(new Font("sans seriff", Font.PLAIN, 20));

        q1=new JButton(" Go to Debit Card");//button  for add debitcard
        q1.setBounds(619,620,220,35);
        q1.setFont(new Font("sans seriff", Font.PLAIN, 20));

        //for credit card clear button628 542
        tsg=new JButton("clear");
        tsg.setBounds(45,624,170,35);
        tsg.setFont(new Font("sans seriff", Font.PLAIN, 20));

        tsgx=new JButton("Set Creditlimit");//button for set credit
        tsgx.setBounds(630,542,210,35);
        tsgx.setFont(new Font("sans seriff", Font.PLAIN, 20));

        tsge=new JButton("Cancel creditCard");//button for cancel credit limit
        tsge.setBounds(325,540,230,35);
        tsge.setFont(new Font("sans seriff", Font.PLAIN, 20));

        tsg1=new JButton("Display");//display button for credit
        tsg1.setBounds(42,540,190,35);
        tsg1.setFont(new Font("sans seriff", Font.PLAIN, 20));

        Color my=new Color(215, 91, 227 );//creating object of color
        tsg1.setBackground(my);

        p1.setBackground(Color.red);
        q1.setBackground(Color.red);//setting color for button background

        tsg.setBackground(Color.green);//setting color for button background
        tsg1.setBackground(Color.green);//setting color for button background
        tsge.setBackground(Color.green);//setting color for button background
        tsgx.setBackground(Color.green);//setting color for button background
        qfx.setBackground(Color.green);//setting color for button background
        p1.setForeground(Color.white);//setting color for button label
        q1.setForeground(Color.white);//setting color for button label

        bb.addActionListener(this);
        tsg.addActionListener(this);
        p1.addActionListener(this);
        p.addActionListener(this);
        qfx.addActionListener(this);/*registering all button to 'this' to trigerred actionevent*/
        tsgx.addActionListener(this);
        tsge.addActionListener(this);
        tsg1.addActionListener(this);
        bb1.addActionListener(this);
        q.addActionListener(this);
        q1.addActionListener(this);

        //adding j components into jpanel credit gui
        panel2.add(a1);//adding components to  credit card panel
        panel2.add(b1);//adding components to  credit card panel
        panel2.add(c1);//adding components to  credit card panel
        panel2.add(d1);//adding components to  credit card panel
        panel2.add(e1);//adding components to  credit card panel
        panel2.add(f1);//adding components to  credit card panel
        panel2.add(g1);//adding components to  credit card panel
        panel2.add(h1);//adding components to  credit card panel
        panel2.add(i1);//adding components to  credit card panel
        panel2.add(x1);//adding components to  credit card panel
        panel2.add(k1);//adding components to  credit card panel
        panel2.add(l1);//adding components to  credit card panel
        panel2.add(m1);//adding components to  credit card panel
        panel2.add(n1);//adding components to  credit card panel
        panel2.add(oa);//adding components to  credit card panel
        panel2.add(oo);//adding components to  credit card panel
        panel2.add(oaa);//adding components to  credit card panel
        panel2.add(app1);//adding components to  credit card panel
        panel2.add(kk1);//adding components to  credit card panel
        panel2.add(p1);//adding components to  credit card panel
        panel2.add(q1);//adding components to  credit card panel
        panel2.add(setcredit);//adding components to  credit card panel
        panel2.add(setcredit1);//adding components to  credit card panel
        panel2.add(tsgx);//adding components to  credit card panel
        panel2.add(tsge);//adding components to  credit card panel
        panel2.add(tsg);//adding components to  credit card panel
        panel2.add(tsg1);//adding components to  credit card panel
        frame2.add(panel2);//adding panel to creditcard frame
        panel2.add(grace);//adding components to  credit card panel
        panel2.add(period);//adding components to  credit card panel

        //adding j components into jpanel

        //debitgui add
        panel1.add(a);//adding componenets to panel1 debitcard panel
        panel1.add(b);//adding componenets to panel1 debitcard panel
        panel1.add(c);//adding componenets to panel1 debitcard panel
        panel1.add(d);//adding componenets to panel1 debitcard panel
        panel1.add(e);//adding componenets to panel1 debitcard panel
        panel1.add(f);//adding componenets to panel1 debitcard panel
        panel1.add(g);//adding componenets to panel1 debitcard panel
        panel1.add(h);//adding componenets to panel1 debitcard panel
        panel1.add(i);//adding componenets to panel1 debitcard panel
        panel1.add(bb);//adding componenets to panel1 debitcard panel
        panel1.add(k);//adding componenets to panel1 debitcard panel
        panel1.add(bb1);//adding componenets to panel1 debitcard panel
        panel1.add(p);//adding componenets to panel1 debitcard panel
        panel1.add(kk);//adding componenets to panel1 debitcard panel
        panel1.add(app);//adding componenets to panel1 debitcard panel
        panel1.add(q);//adding componenets to panel1 debitcard panel
        panel1.add(qfx);//adding componenets to panel1 debitcard panel
        panel1.add(x);//adding componenets to panel1 debitcard panel
        panel1.add(l);//adding componenets to panel1 debitcard panel
        panel1.add(m);//adding componenets to panel1 debitcard panel
        panel1.add(o2);//adding componenets to panel1 debitcard panel
        panel1.add(o3);//adding componenets to panel1 debitcard panel
        panel1.add(o4);//adding componenets to panel1 debitcard panel
        panel1.add(n);//adding componenets to panel1 debitcard panel
        frame.add(panel1);//adding panel to jframe of debitframe 
        panel1.setLayout(null);//panel1 set layout to null
        panel2.setLayout(null);//panel2 set layout to null
        frame.setLayout(null);//frame debitframe set layout to null
        frame2.setLayout(null);//frame 2 credit frame set layout to null
        frame.setVisible(true);//debitframe is set to visible

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame set to exiton close while closing
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame set to exiton close while closing
        frame.setResizable(false);
        frame2.setResizable(false);
        tsg.setFocusable(false);
        bb.setFocusable(false);
        q.setFocusable(false);
        q1.setFocusable(false);
        p1.setFocusable(false);/*set focusable is set to false to avoid rectangular shapes while clicking button*/
        p.setFocusable(false);
        tsgx.setFocusable(false);
        tsge.setFocusable(false);
        tsg1.setFocusable(false);
        bb1.setFocusable(false);

    }

    public static void main(String[]args)
    {

        new Bankgui();//calling constructor from main method

    }
    
    /*This is a actionperformed method inside which all event handeling code is written */
    public void actionPerformed(ActionEvent z)
    {

        if (z.getSource() == tsg)//triggering this action event when cear button is pressed which set text to empty string for creditcard
        {
            e1.setText("");//set text for e1 to empty string
            c1.setText("");//set text for c1 to empty string
            i1.setText("");//set text for i1 to empty string
            k1.setText("");//set text for k1 to empty string
            g1.setText("");//set text for g1 to empty string
            m1.setText("");//set text for m1 to empty string
            kk1.setText("");//set text for kk1 to empty string
            setcredit1.setText("");//set text for setcredit1 to empty string
            period.setText("");//set text for period to empty string

        }

        else if (z.getSource() == bb)//triggered this action event when clear button from debit card is pressed
        {
            c.setText("");//set text for c to empty string
            e.setText("");//set text for e to empty string
            g.setText("");//set text for g to empty string
            i.setText("");//set text for i to empty string
            k.setText("");//set text for k to empty string
            m.setText("");//set text for m to empty string
            kk.setText("");//set text for kk to empty string

        }
        else if(z.getSource() == q)/*this button when change creditgui appears*/
        {
            frame2.setVisible(true);
            frame.setVisible(false);
        }
        else if(z.getSource() == q1)/*This frame when pressed debitgui appears*/
        {
            frame2.setVisible(false);
            frame.setVisible(true);
        }
        
        /*This button is used to add creditcard object to an arraylist when pressed by getting all textfield value from users/gui*/
        else if (z.getSource() == p1) 

        {

            if(c1.getText().isEmpty() || e1.getText().isEmpty() || i1.getText().isEmpty() || m1.getText().isEmpty() || l1.getText().isEmpty())//checks for all empty textfield

            {
                JOptionPane.showMessageDialog(frame2,"please enter some input in textfield","Creditcard",JOptionPane.WARNING_MESSAGE); //display message dialog box   

            }

            else
            {
                if (card.isEmpty())//checks for empty arraylist

                {
                    try//try blocks checks for exceptios

                    {

                        xbn=Integer.parseInt(c1.getText());
                        ynv=Integer.parseInt(e1.getText());
                        xbm1=Integer.parseInt(i1.getText());
                        y1=Integer.parseInt(m1.getText());
                        gracy=Integer.parseInt(period.getText());/*This is how we get text from the textfield value also including combobox*/
                        yj1=l1.getText();
                        x3=k1.getText();
                        x2=g1.getText();
                        hh=kk1.getText();
                        setcreditl=setcredit1.getText();
                        String sun=(String)oo.getSelectedItem();
                        String jan=(String)oa.getSelectedItem();
                        String first=(String)oaa.getSelectedItem();
                        String date=sun+jan+first;
                        obj1=new Creditcard(xbm1,"x2","x3","hh",xbn,ynv,y1,date);//add creditcard object
                        card.add(obj1);//add objext to an arraylist
                        JOptionPane.showMessageDialog(frame," Details successfully added to credit card","creditcard",JOptionPane.INFORMATION_MESSAGE);
                        e1.setText("");
                        c1.setText("");
                        i1.setText("");
                        k1.setText("");
                        g1.setText("");/*setted textfield to an empty string*/
                        m1.setText("");
                        kk1.setText("");
                        setcredit1.setText("");
                        period.setText("");

                    }//try ended
                    catch (NumberFormatException e) //catch block for any exceptions
                    {
                        JOptionPane.showMessageDialog(frame2, "Exception found while adding to creditcard.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

                else //for not empty arraylist

                {
                    boolean duplicate =false;//initializing flag variable here
                    for (Bankcard hp: card)
                    {

                        if(hp instanceof Creditcard)
                        {
                            Creditcard credit=(Creditcard)hp;//downcast
                            if(obj1.getcard_id() == xbm1)
                            {
                                duplicate =true;
                                break;

                            }

                        }
                    } 
                    if (duplicate)//checks if duplicate found
                    {
                        JOptionPane.showMessageDialog(frame,"Duplicate card id found","debitcard",JOptionPane.WARNING_MESSAGE);

                    }

                    else

                    {

                        obj1=new Creditcard(xbm1,"x2","x3","hh",xbn,ynv,y1,date);//creating object
                        card.add(obj1);//adding object to an arraylist when arraylist is not empty
                        JOptionPane.showMessageDialog(frame," non-empty Details successfully added to Credit card","creditcard",JOptionPane.INFORMATION_MESSAGE);
                        e1.setText("");
                        c1.setText("");
                        i1.setText("");/*setted textfield to an empty string*/
                        k1.setText("");
                        g1.setText("");
                        m1.setText("");
                        kk1.setText("");
                        setcredit1.setText("");
                        period.setText("");

                    } 

                }
            }
        }

          /*This button is used to add Debitcard object to an arraylist when pressed by getting all textfield value from users/gui*/

        else if (z.getSource() == p)

        {

            if(c.getText().isEmpty() || g.getText().isEmpty() || e.getText().isEmpty() || i.getText().isEmpty() || k.getText().isEmpty() ||
            m.getText().isEmpty())//checks from the textfield for an empty value
            {

                JOptionPane.showMessageDialog(frame,"Please fill up details in textfield","debitcard",JOptionPane.WARNING_MESSAGE);//display message

            }

            else
            {
                if(card.isEmpty())//checks for an emptt arraylist

                {
                    try//try blocks looks for an exception

                    {

                        x5=Integer.parseInt(c.getText());
                        y5=g.getText();
                        x6=Integer.parseInt(e.getText());
                        y6=i.getText();
                        x7=k.getText();
                        y7=Integer.parseInt(m.getText());
                        withdrawalamount=Integer.parseInt(kk.getText());/*This is how we get text from the textfield value also including combobox*/
                        String mon=(String)o2.getSelectedItem();
                        String feb=(String)o3.getSelectedItem();
                        String second=(String)o4.getSelectedItem();
                        String date1 = mon+feb+second;

                        obj=new Debitcard(x6,y7,"x7","y5","y6",x5);//add debitcard object
                        card.add(obj);//add object of debitcard to an arraylist
                        JOptionPane.showMessageDialog(frame," Details successfully added to debit card" +JOptionPane.INFORMATION_MESSAGE);//display sicces message

                        c.setText("");
                        e.setText("");
                        g.setText("");/*setted textfield to an empty string*/
                        i.setText("");
                        k.setText("");
                        m.setText("");
                        kk.setText("");
                    }
                    catch (NumberFormatException e)//exception occurs catch block execute

                    {
                        JOptionPane.showMessageDialog(frame, "Exception occurs while adding to Debitcard .", "Error", JOptionPane.ERROR_MESSAGE); //display message

                    }

                }

                else//for non empty arraylist

                {

                    for (Bankcard mac : card)
                    {
                        if (mac instanceof Debitcard)//checks if parent class object instance of child class

                        {
                            Debitcard debit=(Debitcard)mac;//downcast

                            if (obj.getcard_id() == y7)//checks for duplicate id
                            {
                                JOptionPane.showMessageDialog(frame,"Duplicate card id found","debitcard",JOptionPane.WARNING_MESSAGE);//display warning message

                            }

                            else
                            {

                                obj=new Debitcard(x6,y7,"x7","y5","y6",x5);//create object of debitcard for non empty arraylist
                                card.add(obj);//add debitcard to an arraylist
                                JOptionPane.showMessageDialog(frame," cardid is non empty,Details successfully added to debit card","debitcard", JOptionPane.INFORMATION_MESSAGE);
                                c.setText("");
                                e.setText("");
                                g.setText("");
                                i.setText("");/*setted textfield to an empty string*/
                                k.setText("");
                                m.setText("");
                                kk.setText("");
                            }
                        }

                    }
                }

            }

        }
        
        /*This is a button for withdraw method of debitcard class which is used to withdraw the money from debitcard by fullfilling its requirement */
        else if(z.getSource() == qfx)
        {

            if(c.getText().isEmpty() || m.getText().isEmpty() || kk.getText().isEmpty())//checks for empty textfield

            {
                JOptionPane.showMessageDialog(frame, "Empty textfield ,please enter some value .", "Error", JOptionPane.ERROR_MESSAGE);//display error message
            }

            else
            {
                if (card.isEmpty())//checks for card wheather debitcard is added to arraylist or not
                {

                    JOptionPane.showMessageDialog(frame, "Empty card id, debit card is not added.", "Error", JOptionPane.ERROR_MESSAGE);//display error message

                }
                else
                {
                    try//for try block if exception occurs
                    {

                        String mon=(String)o2.getSelectedItem();
                        String feb=(String)o3.getSelectedItem();
                        String second=(String)o4.getSelectedItem();/*This is how we get text from the require textfield value also including combobox*/
                        String date1 = mon+feb+second;
                        Integer pinnumber=Integer.parseInt(c.getText());
                        Integer cardid=Integer.parseInt(m.getText());
                        Integer withdrawalamount=Integer.parseInt(kk.getText());

                        for (Bankcard withdraw : card)

                        {
                            if (withdraw instanceof Debitcard)//checks if withdraw parent class object instance of child class

                            {

                                if(obj.getcard_id() == cardid)//checks for duplicate card for each iteartion it checks

                                {

                                    Debitcard debit=(Debitcard)withdraw;//downcast
                                    debit.withdraw(withdrawalamount,date1,pinnumber);//call the withdraw method with required parameter
                                    JOptionPane.showMessageDialog(frame, "withdrawal successfull", "sucess", JOptionPane.INFORMATION_MESSAGE);//display success message 

                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(frame, "incorrect card id found", "Error", JOptionPane.ERROR_MESSAGE);//if card not found it shows  
                                }
                            }
                        }

                    }
                    catch(NumberFormatException e)//if exception occurs it displays messages

                    {
                        JOptionPane.showMessageDialog(frame, "Exception occurs while withdrawing", "Error", JOptionPane.ERROR_MESSAGE); //display messages
                    }

                }

            }

        }
        
        /*This is for setcredtlimit method from creditcard class which is used to set the creditlimit when this requirement is fulfilled*/
        else if(z.getSource() == tsgx)

        {

            if(period.getText().isEmpty() || i1.getText().isEmpty() || setcredit1.getText().isEmpty())//checks for an empty textfield

            {
                JOptionPane.showMessageDialog(frame2, "please enter some data.", "Error", JOptionPane.ERROR_MESSAGE);//displays an error message 
            }

            else
            {
                if (card.isEmpty())//checks for arraylist either creditcard is added or not
                {
                    JOptionPane.showMessageDialog(frame2, "Empty card id credit card is not added.", "Error", JOptionPane.ERROR_MESSAGE);//displays messages

                }

                else
                {
                    try//try blocks for looking exceptions occurs

                    {
                        Integer graceperiod = Integer.parseInt(period.getText());
                        Integer cardd=Integer.parseInt(i1.getText());/*This is how we get text from the textfield value*/
                        Integer setlimit=Integer.parseInt(setcredit1.getText());

                        for (Bankcard setlimited : card)

                        {

                            if (setlimited instanceof Creditcard)//checks if withdraw parent class object instance of child class

                            {

                                if(obj1.getcard_id() == cardd)//checks for duplicate id

                                {
                                    Creditcard credit=(Creditcard)setlimited;//downcast
                                    credit.setcreditlimit(setlimit,graceperiod);//call the setcreditcard method with required parameters   
                                    // Display success message
                                    JOptionPane.showMessageDialog(frame2, "Credit limit set succesfully","sucess",JOptionPane.INFORMATION_MESSAGE );

                                }
                            }
                        }
                    }

                    catch(NumberFormatException e)//catch block execute if exception occurs

                    {
                        JOptionPane.showMessageDialog(frame2, "Exception occurs while setting credit limit.", "Error", JOptionPane.ERROR_MESSAGE);//displays an error message 

                    }

                }
            }

        }
        
        /*This is a cancelcredit card button when clicked it is used to cancel the credit card if requirement is fullfilled */
        else if(z.getSource() == tsge)
        {
            if(i1.getText().isEmpty())//checks for empty textfield

            {
                JOptionPane.showMessageDialog(frame2, "please enter some values  or data.", "Error", JOptionPane.ERROR_MESSAGE); //displays error message
            }
            else
            {
                if (card.isEmpty())//checks for empty arraylist if creditcard is added or not
                {
                    JOptionPane.showMessageDialog(frame2, "Empty card id credit card is not added.", "Error", JOptionPane.ERROR_MESSAGE);//if yes displays error messages

                }
                
                else
                
                {
                    try//try block for looking exceptions
                    {
                        Integer cardes=Integer.parseInt(i1.getText());//getting textvalue of card id from gui
                        
                        for (Bankcard id : card)
                        {
                            if(id instanceof Creditcard)//checks if withdraw parent class object instance of child class
                            {
                                Creditcard cancel = (Creditcard)id;//downcast as creditcard class
                                cancel.cancelcreditcard();  //call the cancelcreditmethod with  their instance
                                JOptionPane.showMessageDialog(frame2, "Credit card cancelled out succesfully","sucess",JOptionPane.INFORMATION_MESSAGE );//display mesages 

                            }   
                        }

                    }
                    catch(NumberFormatException e)//catch block execute if exceptions occurs
                    {
                        JOptionPane.showMessageDialog(frame2, "Exception occurs while cancelling credit card", "Error", JOptionPane.ERROR_MESSAGE); ///displays error message

                    }
                }
            }

        }
        
        /*This is a display method from creditcard when clicked displays an imformation of creditcard by calling its own method */
        else if(z.getSource() == tsg1) //for creditcard
        {
            for(Bankcard know : card)
            {
                if(know instanceof Creditcard)//checks if withdraw parent class object instance of child class
                {
                    Creditcard display1=(Creditcard)know;//downcast
                    display1.display();//call the display method from creditcard class
                    JOptionPane.showMessageDialog(frame, "Details of creditcard displays Successfully", "success", JOptionPane.INFORMATION_MESSAGE);//display success messages 

                }
            }

        }
        
        /*This is a display method from Debitcard when clicked displays an imformation of Debitcard by calling its own method */
        else  
        {
            for(Bankcard us : card)
            {
                if(us instanceof Debitcard)
                {
                    Debitcard display2=(Debitcard)us;//downcast
                    display2.display();//call the display method from debitcard class
                    JOptionPane.showMessageDialog(frame, "Details of debitcard displays Successfully", "sucess", JOptionPane.INFORMATION_MESSAGE);//displays an succes messages../ 
                }
            }

        }

    }

}

