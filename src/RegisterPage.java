import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegisterPage extends JFrame implements ActionListener {

    private Container container = new Container();
    
    private JPanel panel = new JPanel();
    private JPanel panelButton = new JPanel();
    
    private JLabel nameLabel = new JLabel("Name:");
    private JLabel emailLabel = new JLabel("Email:");
    private JLabel passwordLabel = new JLabel("New Password:");
    private JLabel usernameLabel = new JLabel("New Username:");
    
    private JTextField nameField = new JTextField(20);
    private JTextField emailField = new JTextField(20);
    private JPasswordField passwordField = new JPasswordField(20);
    private JTextField usernameField = new JTextField(20);
    
    private JButton register = new JButton("Register");
    private JButton back = new JButton("Back");

    public static String nameInput;
    public static String emailInput;
    public static String usernameInput;
    public static String passwordInput;

    RegisterPage(){
        super("Application billing "); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setResizable(false);
        setLocationRelativeTo(null);

        container = getContentPane();

        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        panel.add(nameLabel, gbc);
        gbc.gridx = 1;

        panel.add(nameField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;

        panel.add(emailLabel, gbc);
        gbc.gridx = 1;

        panel.add(emailField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;

        panel.add(usernameLabel, gbc);
        gbc.gridx = 1;

        panel.add(usernameField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;

        panel.add( passwordField, gbc);
        gbc.gridx = 0;

        panel.add(passwordLabel , gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;

        // gbc.gridwidth = 2;
        panelButton.setLayout( new GridLayout(1,2));
        panelButton.add(back);
        panelButton.add(register);


        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);

        register.setBackground(Color.BLUE);
        register.setForeground(Color.WHITE);
        register.addActionListener(this);

        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);
        container.add(panelButton, BorderLayout.SOUTH);

        setVisible(true);

    }

        public void actionPerformed (ActionEvent e){
            Object user = e.getSource();
        
            if(user == back){
                new Start_Page();
                dispose();
    
            }

            if(user == register){

                if(nameField.getText().isEmpty() || emailField.getText().isEmpty()  || usernameField.getText().isEmpty() || String.valueOf(passwordField.getPassword()).isEmpty() ){
                    //pop up message box
                    JOptionPane.showMessageDialog(this, "DATA MASIH KOSONG INPUT DENGAN BENAR!!");
                }else{

                    //save data
                    nameInput = nameField.getText();
                    emailInput = emailField.getText();
                    usernameInput = usernameField.getText();
                    passwordInput = String.valueOf(passwordField.getPassword());
    
                    //auto delete data
                    nameField.setText("");
                    emailField.setText("");
                    usernameField.setText("");
                    passwordField.setText("");
    
                    //pop up message box
                    JOptionPane.showMessageDialog(this, "REGISTRASI BERHASIL SILAHKAN LOGIN");
    
                    //auto go to login page
                    new LoginPage();
                    dispose();
                }
                
            }
        }
}