import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.Timer;
import java.util.TimerTask;

class Page2 extends JFrame implements ActionListener{
    private Container container = new Container();

    //label for
    private JLabel displayTimer = new JLabel();

    //panel
    private JPanel panelTimer = new JPanel();
    private JPanel panelStart = new JPanel();

    //button
    private JButton startButton = new JButton("Start");

    Page2(){
        super("Application billing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 100);
        setResizable(false);
        container = getContentPane();
        container.setBackground(Color.BLACK);

        panelTimer.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelTimer.add(displayTimer);
        

        panelStart.setLayout(new GridLayout(1, 1));
        panelStart.add(startButton);
        startButton.addActionListener(this);

        container.setLayout(new GridLayout(2,1));
        container.add(panelTimer);
        container.add(panelStart);

        //display awal timer

        int countdownSeconds = Page1.hours * 3600;
        int hours = countdownSeconds / 3600;
        int minutes = (countdownSeconds % 3600) / 60;
        int seconds = countdownSeconds % 60;

        String strHours = Integer.toString(hours);
        String strMinutes = Integer.toString(minutes);
        String strSeconds = Integer.toString(seconds);

        displayTimer.setText( strHours + " : " + strMinutes + " : " + strSeconds);
                


        // setVisible(true);
        // setVisible(false);
        show();

    }

    public void actionPerformed(ActionEvent e){
        Object user = e.getSource();

        // Change this to the desired countdown time in seconds
        
        int countdownSeconds = Page1.hours * 3600; 
        // int countdownSeconds = 5;

        
        if(user == startButton){
        // startButton.setVisible(false);
        startButton.setEnabled(false);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int totalSeconds = countdownSeconds;

            public void run() {
                int hours = totalSeconds / 3600;
                int minutes = (totalSeconds % 3600) / 60;
                int seconds = totalSeconds % 60;

                String strHours = Integer.toString(hours);
                String strMinutes = Integer.toString(minutes);
                String strSeconds = Integer.toString(seconds);
                
                if (totalSeconds > 0) {
                    // System.out.format();
                    System.out.println("Test complete");
                    displayTimer.setText( strHours + " : " + strMinutes + " : " + strSeconds);
                    totalSeconds--;
                } else {
                    System.out.println("Time's up!");//on console

                        int choice = JOptionPane.showOptionDialog(
                        null,
                        "CLICK YES END BILLING NO BACK TO MENU",
                        "Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        null,
                        null
                        
                        );

                        if (choice == JOptionPane.YES_OPTION){
                        System.out.println("User clicked Yes");
                            System.exit(0);
                            
                        } else if (choice == JOptionPane.NO_OPTION) {
                            System.out.println("User clicked No");
                            new Page1();
                            dispose();
                        } else {
                            System.out.println("User closed the dialog");
                        }

                        displayTimer.setText("Time's Up");//on display
                        timer.cancel();//timer stop
                }
            }
        };
        
        timer.scheduleAtFixedRate(task, 0, 1000); // Schedule the task to run every second
    }    

    }
    
}