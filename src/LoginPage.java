import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginPage extends JFrame implements ActionListener {
    private Container container = new Container();
    private JTextField username = new JTextField();
    private JPasswordField password = new JPasswordField();

    //panel
    private JPanel panelAtas = new JPanel();
    private JPanel panelTengah = new JPanel();
    private JPanel panelBawah = new JPanel();

    //button
    private JButton login = new JButton("Login");
    private JButton register = new JButton("Register");

    //label
    private JLabel tittle = new JLabel("Billing Warnet");
    private JLabel usernameLabel = new JLabel("Username");
    private JLabel passwordLabel = new JLabel("Password");

    //frame
    private String usernameInput = RegisterPage.usernameInput;
    private String passwordInput = RegisterPage.passwordInput;


    LoginPage(){
        super("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 150);
        setResizable(false);
        container = getContentPane();

        
        panelAtas.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelAtas.add(tittle);
        
        panelTengah.setLayout(new GridLayout(2, 2));
        panelTengah.add(usernameLabel);
        panelTengah.add(username);
        panelTengah.add(passwordLabel);
        panelTengah.add(password);
        
        panelBawah.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBawah.add(register);
        panelBawah.add(login);

        login.addActionListener(this);
        register.addActionListener(this);

        //set container layout
        container.setLayout(new BorderLayout());
        container.add(panelAtas, BorderLayout.NORTH);
        container.add(panelTengah, BorderLayout.CENTER);
        container.add(panelBawah, BorderLayout.SOUTH);
        
        // setVisible(true);
        show();
    }
    
    public void actionPerformed(ActionEvent e) {
        Object user = e.getSource();
        
        if(user == login){
            String userData = username.getText();
            String passwordData = new String(password.getPassword());

            if(userData.equals(usernameInput) && passwordData.equals(passwordInput) ){
                JOptionPane.showMessageDialog(this, "Login Berhasil!", "Information", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Page1();
            }else if(userData.equals("user") &&  passwordData.equals("user")){
                JOptionPane.showMessageDialog(this, "Login Berhasil!", "Information", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Page1();
            }else{
                JOptionPane.showMessageDialog(this, "Password atau Username salah!! atau Anda Belum Registrasi ", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if(user == register){
            dispose();
            new RegisterPage();
        }
    }
}