package lcap_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;


public class ServerGUI extends JFrame{
    JFrame frame = new JFrame("Server");
    JButton startServer = new JButton("Start Server");
    JPanel buttonPane = new JPanel();
    JTextArea textArea = new JTextArea(30, 50);
    
    private static final int PORT = 9001;
    private static LinkedList<String> userNames = new LinkedList<String>();
    private static LinkedList<PrintWriter> writers = new LinkedList<PrintWriter>();
    
    public ServerGUI(){
        textArea.setEditable(false);
        buttonPane.add(startServer);
       
        startServer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textArea.setText("Starting Server");
                   
            }           
        });
       
       
        frame.getContentPane().add(buttonPane, "North");
        frame.getContentPane().add(new JScrollPane(textArea), "Center");
        frame.pack();
              
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  
    }
}
