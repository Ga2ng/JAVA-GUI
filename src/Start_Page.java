import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start_Page extends JFrame implements ActionListener {

    //container
    private Container container = new Container();
    
    //button 
    private JButton member = new JButton("MEMBER");
    private JButton next = new JButton("NEXT");
    private JButton register = new JButton("REGISTER");

    //label
    private JLabel tittle = new JLabel("WELCOME TO DEV.NET");
    private JLabel desc = new JLabel("PRESS NEXT IF U DONT HAVE MEMBER");

    //panel
    private JPanel textPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JPanel regisPanel = new JPanel();

    Start_Page(){
        super("Application Billing");
        setLocationRelativeTo(null);
        setSize(350, 160);
        setResizable(false);
        container = getContentPane();
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        textPanel.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER; 
        gbc.anchor = GridBagConstraints.CENTER;
        textPanel.add(tittle, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        textPanel.add(desc, gbc);

        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(member);
        buttonPanel.add(next);

        regisPanel.setLayout(new GridLayout(1,1));
        regisPanel.add(register);


        container.setLayout(new GridLayout(3,1));
        container.add(textPanel);
        container.add(buttonPanel);
        container.add(regisPanel);
        
        //action listener active
        member.addActionListener(this);
        next.addActionListener(this);
        register.addActionListener(this);
        
        show();
    }
    
    public void actionPerformed(ActionEvent e){
        Object user = e.getSource();

        if(user == next){
            new Page1();
            dispose();
        }

        if(user == member){
            new LoginPage();
            dispose();
        }

        if(user == register){
            new RegisterPage();
            dispose();
        }
    }
}