package Laundry;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Login extends JFrame{
    private Image image;
    JLabel ljudul,lusername,lpassword;
    JTextField txusername;
    JPasswordField txpassword;
    JButton login;
    
    public Login(){
        image = new ImageIcon(getClass().getResource("sd.jpg")).getImage();
         this.setContentPane(new JPanel() {
         @Override
            public void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.drawImage(image, 0, 0, null);
            }
         });  
         
        setTitle("LOGIN");
        
        ljudul = new JLabel("LOGIN ADMIN");
        lusername = new JLabel("Username");  
        lpassword = new JLabel("Password");
        
        txusername = new JTextField("");
        txpassword = new JPasswordField("");
        
        login = new JButton("LOGIN");
        
        setLayout(null);
        add(ljudul);
        add(lusername);
        add(lpassword);
        add(txusername);
        add(txpassword);
        add(login);
        
        ljudul.setBounds(100, 20, 80, 23);
        
        lusername.setBounds(25, 60, 80, 23);
        txusername.setBounds(130, 60, 120, 23);
        
        lpassword.setBounds(25, 100, 80, 23);
        txpassword.setBounds(130, 100, 120, 23);
        
        login.setBounds(100, 150, 70, 23);
        
        setSize(300,250); 
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        login.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txusername.getText().equals("admin") && txpassword.getText().equals("admin")){
                    LaundryMVC mvc = new LaundryMVC();
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Username dan password salah!");
                }
            }
        });
    }
}
