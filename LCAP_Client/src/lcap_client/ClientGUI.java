package lcap_client;


import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Event;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;




public class ClientGUI extends JFrame {
    
    public ClientGUI(){
        JFrame frame = new JFrame("Client");
        JPanel guiPanel = new JPanel(new GridBagLayout());       
        JLabel userNameLabel = new JLabel("UserName:");
        JTextField userNameTextField = new JTextField(30);
        JLabel passwordLabel = new JLabel("Password:");
        JTextField passwordTextField = new JTextField(20);
        //JTextArea chatArea = new JTextArea(30, 30);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        frame.setLocationRelativeTo(null);
        
        GridBagConstraints labelGBC = new GridBagConstraints();
        labelGBC.insets = new Insets(3, 3, 3, 3);
       
        GridBagConstraints fieldGBC = new GridBagConstraints();
        fieldGBC.insets = new Insets(3, 3, 3, 3);
        fieldGBC.gridwidth = GridBagConstraints.REMAINDER;
        
       // GridBagConstraints chatGBC = new GridBagConstraints();
        //chatGBC.insets = new Insets(3, 3, 3, 3);
        
        guiPanel.add(userNameLabel, labelGBC);
        guiPanel.add(userNameTextField, fieldGBC);
        
        guiPanel.add(passwordLabel, labelGBC);
        guiPanel.add(passwordTextField, fieldGBC);
        
        //guiPanel.add(chatArea, chatGBC);
        
        frame.add(guiPanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }
    
    
}
