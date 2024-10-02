package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash() {

//      Frame tittle
        super("Welcome Page");
        getContentPane().setBackground(Color.lightGray);

//
//        // Load the image
//        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash/Splash.jpg"));
//        Image imageOne = imageIcon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
//        ImageIcon imageIcon1 = new ImageIcon(imageOne);
//
//        // Create a label with the image
//        JLabel imageLabel = new JLabel(imageIcon1);
//        add(imageLabel, BorderLayout.CENTER); // Add label to center of the frame

        JLabel jLabel = new JLabel("Welcome To The Application !");
        jLabel.setBounds(200,150,300,30);
        add(jLabel);

        // Frame settings
        setSize(600, 400);
        setLayout(null);
        setLocationRelativeTo(null); // Center the frame on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        setResizable(false); // Disable resizing
        setVisible(true); // Set visibility last

        try{
            Thread.sleep(2000);
            setVisible(false);

            new Login();
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
