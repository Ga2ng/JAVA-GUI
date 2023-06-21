import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class Page1 extends JFrame implements ActionListener{

    private Container container = new Container();

    //Panel
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();
    private JPanel panel6 = new JPanel();
    private JPanel panel7 = new JPanel();
    
    //Label
    private JLabel tittle = new JLabel("PILIH PAKET BILLING ANDA");
    private JLabel regular = new JLabel();
    
    //radio  buttons
    JRadioButton paketHemat = new JRadioButton("Paket Malam");
    JRadioButton paketMalam = new JRadioButton("Paket Hemat");
    JRadioButton paketReguler = new JRadioButton("Paket Reguler");

    //button
    private JButton button1 = new JButton("PAKET 1");
    private JButton button2 = new JButton("PAKET 2");
    private JButton button3 = new JButton("PAKET 3");
    private JButton button4 = new JButton("PAKET 4");

    private JButton button5 = new JButton("PAKET 1");
    private JButton button6 = new JButton("PAKET 2");
    private JButton button7 = new JButton("PAKET 3");
    private JButton button8 = new JButton("PAKET 4");

    private JButton button9 = new JButton("<");
    private JButton button12 = new JButton(">");

    //text area
    private JTextArea textArea = new JTextArea();

    //submit button
    private JButton submit = new JButton("Submit");

    //main panel
    private JPanel left = new JPanel();
    private JPanel right = new JPanel();


    private boolean visibility = false;
    int price;
    public static int hours;
    Page1(){
        super("Application Billing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(700,450 );
        container = getContentPane();

        // container.setBackground(Color.BLUE);
        
        //tittle panel1 
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.add(tittle);
        
        //panel2
        panel2.setLayout(new GridLayout(1 , 3));
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(paketHemat);
        buttonGroup.add(paketMalam);
        buttonGroup.add(paketReguler);
        //action listeners
        paketHemat.addActionListener(this);
        paketMalam.addActionListener(this);
        paketReguler.addActionListener(this);
        //add to panel
        panel2.add(paketHemat );
        panel2.add(paketMalam );
        panel2.add(paketReguler );
        
        
        // container.add(panel3);
        panel3.setLayout(new GridLayout(1, 4));
        panel3.add(button1);
        panel3.add(button2);
        panel3.add(button3);
        panel3.add(button4);
        panel3.setVisible(visibility);
        //action listeners
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        
        // container.add(panel4);
        panel4.setLayout(new GridLayout(1, 4));
        panel4.add(button5);
        panel4.add(button6);
        panel4.add(button7);
        panel4.add(button8);
        panel4.setVisible(visibility);
        // action listeners
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        
        // container.add(panel5);
        panel5.setLayout(new GridLayout(1,3));
        panel5.add(button9);

        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel5.add(regular);
        
        panel5.add(button12);
        panel5.setVisible(visibility);
        // action listeners
        button9.addActionListener(this);
        button12.addActionListener(this);
        
        
        panel6.setLayout(new GridLayout(1,1));
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries
        textArea.setEnabled(false); // Disable input
        textArea.setBackground(Color.BLACK); //
        panel6.add(textArea);

        panel7.setLayout(new GridLayout(1, 1));
        panel7.add(submit);

        submit.addActionListener(this);

        left.setLayout(new GridLayout(6,1));
        right.setLayout(new GridLayout(1,1));
        left.add(panel1);
        left.add(panel2);
        left.add(panel3);
        left.add(panel4);
        left.add(panel5);
        right.add(panel6);
        left.add(panel7);
        
        container.setLayout(new GridLayout(1,2));
        container.add(left);
        container.add(right);
        
        // setVisible(false);
        // setVisible(true);
        show();
        
    }
    
    public  void actionPerformed(ActionEvent e) {
        
        Object user = e.getSource();
        
        if(paketHemat.isSelected()) {
            panel3.setVisible(true);
            panel4.setVisible(false);
            panel5.setVisible(false);
        }

        if(paketMalam.isSelected()) {
            panel3.setVisible(false);
            panel4.setVisible(true);
            panel5.setVisible(false);
        }
        
        if(user == paketReguler) {
            hours = 0;
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(true);
        }

        //panel3(paket malam)
        if(user == button1){

            if(RegisterPage.nameInput == null){
                textArea.setText(
                "ANDA BELUM MEMBER \n\n"+
                "Name User: " + "None" + "\n"+
                "Email User: " + "None" + "\n"+
                "Paket Malam - 1\n"+
                "Jam 18.00 - 21.00\n"+
                "Harga IDR 14K\n" 
                );
            }else{

                textArea.setText(
                "ANDA TELAH MENJADI MEMBER \n\n"+
                "Name User: " + RegisterPage.nameInput + "\n"+
                "Email User: " + RegisterPage.emailInput + "\n"+
                "Paket Malam - 1\n"+
                "Jam 18.00 - 21.00\n"+
                "Harga IDR 14K\n" 
                );
            }
            price = 14000;
            hours = 3;

        }

        if(user == button2){
            if(RegisterPage.nameInput == null){

                textArea.setText(
                "ANDA BELUM MEMBER \n\n"+
                "Name User: " + "None" + "\n"+
                "Email User: " + "None" + "\n"+
                "Paket Malam - 2\n"+
                "Jam 21.00 - 00.00\n"+
                "Harga IDR 13K\n" 
                );
                

            }else{

                textArea.setText(
                "ANDA TELAH MENJADI MEMBER \n\n"+
                "Name User: " + RegisterPage.nameInput + "\n"+
                "Email User: " + RegisterPage.emailInput + "\n"+
                "Paket Malam - 2\n"+
                "Jam 21.00 - 00.00\n"+
                "Harga IDR 13K\n" 
                );
            }
            price = 13000;
            hours = 3;

        }

        if(user == button3){
            if(RegisterPage.nameInput == null){
                textArea.setText(
                "ANDA BELUM MEMBER \n\n"+
                "Name User: " + "None" + "\n"+
                "Email User: " + "None" + "\n"+
                "Paket Malam - 3\n"+
                "Jam 00.00 - 03.00\n"+
                "Harga IDR 12K\n" 
                );

            }else{

                textArea.setText(
                "ANDA TELAH MENJADI MEMBER \n\n"+
                "Name User: " + RegisterPage.nameInput + "\n"+
                "Email User: " + RegisterPage.emailInput + "\n"+
                "Paket Malam - 3\n"+
                "Jam 00.00 - 03.00\n"+
                "Harga IDR 12K\n" 
                );

            }
            price = 12000;
            hours = 3;
        }

        if(user == button4){
            if(RegisterPage.nameInput == null){
                textArea.setText(
                "ANDA BELUM MEMBER \n\n"+
                "Name User: " + "None" + "\n"+
                "Email User: " + "None" + "\n"+
                "Paket Malam - 4\n"+
                "Jam 03.00 - 06.00\n"+
                "Harga IDR 11K\n" 
                );

            }else{
                textArea.setText(
                "ANDA TELAH MENJADI MEMBER \n\n"+
                "Name User: " + RegisterPage.nameInput + "\n"+
                "Email User: " + RegisterPage.emailInput + "\n"+
                "Paket Malam - 4\n"+
                "Jam 03.00 - 06.00\n"+
                "Harga IDR 11K\n" 
                );
            }
            price = 11000;
            hours = 3;
        } 

        //panel4(paket hemat)
        if(user == button5){
            if(RegisterPage.nameInput == null){
                textArea.setText(
                "ANDA BELUM MEMBER \n\n"+
                "Name User: " + "None" + "\n"+
                "Email User: " + "None" + "\n"+
                "Paket Hemat - 1\n"+
                "6 JAM\n"+
                "Harga IDR 10K\n" 
                );
            }else{
                textArea.setText(
                "ANDA TELAH MENJADI MEMBER \n\n"+
                "Name User: " + RegisterPage.nameInput + "\n"+
                "Email User: " + RegisterPage.emailInput + "\n"+
                "Paket Hemat - 1\n"+
                "6 JAM\n"+
                "Harga IDR 10K\n" 
                );
            }
            price = 25000;
            hours = 6;
        }
        
        if(user == button6){
            if(RegisterPage.nameInput == null){
                textArea.setText(
                "ANDA BELUM MEMBER \n\n"+
                "Name User: " + "None" + "\n"+
                "Email User: " + "None" + "\n"+
                "Paket Hemat - 2\n"+
                "12 JAM\n"+
                "Harga IDR 50K\n" 
                );
            }else{
                textArea.setText(
                "ANDA TELAH MENJADI MEMBER \n\n"+
                "Name User: " + RegisterPage.nameInput + "\n"+
                "Email User: " + RegisterPage.emailInput + "\n"+
                "Paket Hemat - 2\n"+
                "12 JAM\n"+
                "Harga IDR 50K\n" 
                );
            }
            price = 50000;
            hours = 12;
        }

        if(user == button7){
            if(RegisterPage.usernameInput == null){
                textArea.setText(
                "ANDA BELUM MEMBER \n\n"+
                "Name User: " + "None" + "\n"+
                "Email User: " + "None" + "\n"+
                "Paket Hemat - 3\n"+
                "18 JAM\n"+
                "Harga IDR 75K\n" 
                );
            }else{
                textArea.setText(
                "ANDA TELAH MENJADI MEMBER \n\n"+
                "Name User: " + RegisterPage.nameInput + "\n"+
                "Email User: " + RegisterPage.emailInput + "\n"+
                "Paket Hemat - 3\n"+
                "18 JAM\n"+
                "Harga IDR 75K\n" 
                );

            }
            price = 75000;
            hours = 18;
        }

        if(user == button8){
            if(RegisterPage.nameInput == null){
                textArea.setText(
                "ANDA BELUM MEMBER \n\n"+
                "Name User: " + "None" + "\n"+
                "Email User: " + "None" + "\n"+
                "Paket Hemat - 4\n"+
                "24 JAM\n"+
                "Harga IDR 100K\n" 
                );

            }else{
                textArea.setText(
                "ANDA TELAH MENJADI MEMBER \n\n"+
                "Name User: " + RegisterPage.nameInput + "\n"+
                "Email User: " + RegisterPage.emailInput + "\n"+
                "Paket Hemat - 4\n"+
                "24 JAM\n"+
                "Harga IDR 100K\n" 
                );
            }
            price = 100000;
            hours = 24;
        }


        //panel5
        if(user == button9){
            hours--;
            if( hours <= 0){
            hours = 0;
            }
            price = 5000*hours;
            String strHours = Integer.toString(hours);
            regular.setText(strHours + " JAM");

            if(RegisterPage.nameInput == null){
                textArea.setText(
                    "ANDA BELUM MEMBER \n\n"+
                    "Name User: " + "None" + "\n"+
                    "Email User: " + "None" + "\n"+
                    "PAKET REGULER IDR 5K/JAM\n"+
                    "PAKET " + strHours + " JAM\n"+
                    "TOTAL PEMBAYARAN : " + "IDR " + hours*5000 
                    );
            }else{
                textArea.setText(
                    "ANDA TELAH MENJADI MEMBER \n\n"+
                    "Name User: " + RegisterPage.nameInput + "\n"+
                    "Email User: " + RegisterPage.emailInput + "\n"+
                    "PAKET REGULER IDR 5K/JAM\n"+
                    "PAKET " + strHours + " JAM\n"+
                    "TOTAL PEMBAYARAN : " + "IDR " + hours*5000 
                    );
            }

                
            }
        
        if(user == button12){
            hours++;
            price = 5000*hours;
            String strHours = Integer.toString(hours);
            regular.setText(strHours + " JAM");

            if(RegisterPage.usernameInput == null){
                textArea.setText(
                    "ANDA BELUM MEMBER \n\n"+
                    "Name User: " + "None" + "\n"+
                    "Email User: " + "None" + "\n"+
                    "PAKET REGULER IDR 5K/JAM\n"+
                    "PAKET " + strHours + " JAM\n"+
                    "TOTAL PEMBAYARAN : " + "IDR " + hours*5000 
                    );
                
            }else{    
                textArea.setText(
                    "ANDA TELAH MENJADI MEMBER \n\n"+
                    "Name User: " + RegisterPage.nameInput + "\n"+
                    "Email User: " + RegisterPage.emailInput + "\n"+
                    "PAKET REGULER IDR 5K/JAM\n"+
                    "PAKET " + strHours + " JAM\n"+
                    "TOTAL PEMBAYARAN : " + "IDR " + hours*5000 
                    );
                }
            }
            

        //panel submit
        if(user == submit){

            String total = Integer.toString(price);
             // Create a JOptionPane with Yes/No options
                int choice = JOptionPane.showOptionDialog(
                null,
                "TOTAL PEMBAYARAN : " + total + "\n"+
                "",
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null
                );

                // Check the user's choice
                if (choice == JOptionPane.YES_OPTION) {
                    System.out.println("User clicked Yes");
                    dispose();
                    new Page2();
                    
                } else if (choice == JOptionPane.NO_OPTION) {
                    System.out.println("User clicked No");
                } else {
                    System.out.println("User closed the dialog");
                }                
            }
    }   
}