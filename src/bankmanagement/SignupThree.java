package bankmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
       JRadioButton r1,r2,r3,r4;
       String formno;
       JCheckBox c1,c2,c3,c4,c5,c6,c7;
       JButton submit,cancel;
    SignupThree(String formno){
        setLayout(null);
        this.formno = formno;
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD,22));
        type.setBounds(100, 140, 400, 40);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBounds(100, 200, 250, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBounds(450, 200, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBounds(100, 240, 250, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBounds(450, 240, 250, 20);
        add(r4);
        
        ButtonGroup typegroup = new ButtonGroup();
        typegroup.add(r1);
        typegroup.add(r2);
        typegroup.add(r3);
        typegroup.add(r4);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD,22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD,22));
        number.setBounds(330, 300, 400, 30);
        add(number);
        
        JLabel carddetail = new JLabel("(Your 16 Digit Card Number)");
        carddetail.setFont(new Font("Raleway", Font.BOLD,12));
        carddetail.setBounds(100, 330, 400, 20);
        add(carddetail);
        
        JLabel pin = new JLabel("Pin Number:");
        pin.setFont(new Font("Raleway", Font.BOLD,22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pindetail = new JLabel("(Your 4 Digit Pin Number)");
        pindetail.setFont(new Font("Raleway", Font.BOLD,12));
        pindetail.setBounds(100, 400, 400, 20);
        add(pindetail);
        
        JLabel pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD,22));
        pinnumber.setBounds(330, 370, 400, 30);
        add(pinnumber);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD,22));
        services.setBounds(100, 450, 300, 30);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("E-mail Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Checkbook");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I herby declare that above entered details are correct to the best of my knowledge ");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(100, 680, 800, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        submit.setOpaque(true);
        submit.setBorderPainted(false);
        
        cancel = new JButton("Cancle");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setBounds(500, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        cancel.setOpaque(true);
        cancel.setBorderPainted(false);
        
        getContentPane().setBackground(Color.white);
        setSize(850, 820);
        setLocation(350,0);
        setVisible(true);
    }

   public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accounttype = null;
            if(r1.isSelected()){
                accounttype = "Saving Account";
            }
            else if(r2.isSelected()){
                accounttype = "Fix Deposite Account";
            }
            else if(r3.isSelected()){
                accounttype = "Current Account";
            }
            else if(r4.isSelected()){
                accounttype = "Recurring Account";
            }
            Random random= new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L + 5040936000000000L));
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L + 1000L));
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility + "ATM Card";
            }
            if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }
            if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }
            if(c4.isSelected()){
                facility = facility + " Email Alerts";
            }
            if(c5.isSelected()){
                facility = facility + " Checkbook";
            }
            if(c6.isSelected()){
                facility = facility + " E-statement";
            }
           try{
               if(!c7.isSelected()){
                   JOptionPane.showMessageDialog(null, "Please Check The Declaration." );
               }
               else if(accounttype.equals("")){
                   JOptionPane.showMessageDialog(null, "Account Type is Required." );
               }
               else{
                   Conn c = new Conn();
                   String q1 = "insert into signupthree values('" + formno + "','" + accounttype + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                   String q2 = "insert into login values('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                   c.s.executeUpdate(q1);
                   c.s.executeUpdate(q2);
                   
                   JOptionPane.showMessageDialog(null, "Card Number:" + cardnumber + "\n Pin:" + pinnumber);
                   
               }
           }
           catch(Exception e){
               System.out.println(e);
           }
      
        }
        else if(ae.getSource()==cancel){
            
        }
   }

public static void main(String[] args){
     new SignupThree("");
   }
}
