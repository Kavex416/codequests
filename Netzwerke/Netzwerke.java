import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.GridLayout;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.lang.Override;
import java.net.InetAddress;
import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.11.2019
 * @author
 */

public class Netzwerke extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();

  private static JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JPanel jPanel1 = new JPanel(null, true);
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private static JLabel jLabel9 = new JLabel();
      static JFrame mainFrame;
    static JPanel pnlJPanel;
  // Ende Attribute
 
  public Netzwerke() {
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 541; 
    int frameHeight = 459;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("URL Reader");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
   
    jTextField1.setBounds(112, 53, 342, 28);
    cp.add(jTextField1);
    jLabel1.setBounds(24, 56, 94, 20);
    jLabel1.setText("Web-Domain:");
    cp.add(jLabel1);
    jLabel2.setBounds(88, 248, 110, 20);
    jLabel2.setText("Your IP:");
    cp.add(jLabel2);
    jLabel3.setBounds(277, 98, 110, 28);
    jLabel3.setText("Local IP");
    jLabel9.setBounds(112, 64, 190, 28);
    jLabel9.setText("Hostname");
    cp.add(jLabel3);
    jButton1.setBounds(166, 154, 203, 49);
    jButton1.setText("Dissolve Domain");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        try{
          jButton1_ActionPerformed(evt);
           }
        catch(UnknownHostException e) {
    
          }
      }
    });
    cp.add(jButton1);
    jPanel1.setBounds(107, 230, 316, 100);
    jPanel1.setOpaque(false);
    cp.add(jPanel1);
    jLabel4.setBounds(10, 9, 78, 20);
    jLabel4.setText("IP of the Webside:");
    jPanel1.add(jLabel4);
    jLabel5.setBounds(8, 40, 102, 20);
    jLabel5.setText("Complete URL:");
    jPanel1.add(jLabel5);
    jLabel6.setBounds(6, 70, 118, 20);
    jLabel6.setText("Your Hostname:");
    jPanel1.add(jLabel6);
    jLabel7.setBounds(112, 5, 190, 28);
    jLabel7.setText("IP");
    jPanel1.add(jLabel7);
    jLabel8.setBounds(112, 40, 190, 20);
    jLabel8.setText("URL");
    jPanel1.add(jLabel8);
    jPanel1.add(jLabel9);
    jLabel2.setText("text");
    cp.add(jLabel2);
    // Ende Komponenten
   
   
    setVisible(true);
  } // end of public Netzwerke
 
  // Anfang Methoden
 
  public static void main(String[] args) {
    new Netzwerke();
    try{
      InetAddress inetAddress = InetAddress.getLocalHost();
      jLabel3.setText(inetAddress.getHostAddress());
      }catch (Exception e) {
      System.out.println("Couldn´t find local IP.");
       }
        try{
      jLabel9.setText(InetAddress.getLocalHost().getHostName());
      }catch (Exception e) {
      System.out.println("Couldn´t find Hostname.");
       }
  } // end of main
 
  public void jButton1_ActionPerformed(ActionEvent evt) 
         throws UnknownHostException
  {
    // TODO hier Quelltext einfügen
    String url = jTextField1.getText();
      try {
            // Fetch IP address by getByName()
            InetAddress ip = InetAddress.getByName(new URL(url).getHost());
            // Print the IP address
            jLabel7.setText("" + ip);
             
      }
      catch (UnknownHostException e) {
       System.out.println("Unknown Exception");
      }
    catch(MalformedURLException u) {
       // It means the URL is invalid
       System.out.println("Invalid URL");
      }                                 
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class Netzwerke

