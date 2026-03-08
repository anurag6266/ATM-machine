
package bankmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, clear;
    JTextField cardTextFeild;
    JPasswordField pinTextFeild ;
    
    
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(Login.class.getResource("/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200, 40, 500, 40);
        add(text);
        
         JLabel cardno = new JLabel("Card No.");
        cardno.setFont(new Font("Saleway", Font.BOLD,28));
        cardno.setBounds(120, 150, 500, 30);
        add(cardno);
        
        cardTextFeild = new JTextField();
        cardTextFeild.setBounds(300, 150, 230, 30);
        cardTextFeild.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextFeild);
        
         JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Saleway", Font.BOLD,28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        pinTextFeild = new JPasswordField();
        pinTextFeild.setBounds(300, 220, 230, 30);
        add(pinTextFeild);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.black);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.black);
        clear.addActionListener(this);
        add(clear);
        
         signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.black);
        signup.addActionListener(this);
        add(signup);
        
        
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == clear) {
           cardTextFeild.setText("");
           pinTextFeild.setText("");
       }
       else if(ae.getSource() == login){
           Conn c = new Conn();
           String cardnumber = cardTextFeild.getText();
           String pinnumber = pinTextFeild.getText();
           String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
           try{
              ResultSet rs = c.s.executeQuery(query);
              if(rs.next()){
                  setVisible(false);
                  new Transactions().setVisible(true);
              }
              else{
                  JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
              }
           }
           catch(Exception e){
             
               System.out.println(query);
           
           }}
       else if(ae.getSource() == signup){
               setVisible(false);
                new SignupOne().setVisible(true);
       }
    }
    
    public static void main(String[] args) {
        new Login();
        
    }
    
}
