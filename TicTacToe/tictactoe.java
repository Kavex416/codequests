import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 19.01.2020
 * @author 
 */

public class tixtactoe extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JButton jButton9 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  public String bt1 = "";
  public String bt2 = "";
  public String bt3 = "";
  public String bt4 = "";
  public String bt5 = "";
  public String bt6 = "";
  public String bt7 = "";
  public String bt8 = "";
  public String bt9 = "";
  private JButton jButton10 = new JButton();
  // Ende Attribute
  
  public tixtactoe() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 443; 
    int frameHeight = 587;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("tixtactoe");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(32, 104, 105, 97);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(160, 104, 105, 97);
    jButton2.setText("");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(288, 104, 105, 97);
    jButton3.setText("");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(32, 224, 105, 97);
    jButton4.setText("");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(32, 344, 105, 97);
    jButton5.setText("");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(160, 344, 105, 97);
    jButton6.setText("");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(288, 344, 105, 97);
    jButton7.setText("");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(288, 224, 105, 97);
    jButton8.setText("");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jButton9.setBounds(160, 224, 105, 97);
    jButton9.setText("");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    cp.add(jButton9);
    jLabel1.setBounds(8, 40, 94, 28);
    jLabel1.setText("Turn of Player:");
    cp.add(jLabel1);
    jLabel2.setBounds(104, 40, 110, 28);
    jLabel2.setText("X");
    cp.add(jLabel2);
    jButton10.setBounds(152, 480, 107, 41);
    jButton10.setText("Reset");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    cp.add(jButton10);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public tixtactoe
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new tixtactoe();
  } // end of main
  boolean turn = true;
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if (turn == true){
      jLabel2.setText("O");
      jButton1.setText("X");
      bt1 = "X";
      turn = false;
      if (bt2 == "X" && bt3 == "X" || bt4 == "X" && bt5 == "X" || bt9 == "X" && bt7 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton1.setText("O");
      bt1 = "O";
      turn = true;
            if (bt2 == "O" && bt3 == "O" || bt4 == "O" && bt5 == "O" || bt9 == "O" && bt7 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton1.setEnabled(false);
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        if (turn == true){
      jLabel2.setText("O");
      jButton2.setText("X");
      bt2 = "X";
      turn = false;
      if (bt9 == "X" && bt6 == "X" || bt1 == "X" && bt3 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton2.setText("O");
      bt2 = "O";
      turn = true;
            if (bt9 == "O" && bt6 == "O" || bt1 == "O" && bt3 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton2.setEnabled(false);
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        if (turn == true){
      jLabel2.setText("O");
      jButton3.setText("X");
      bt3 = "X";
      turn = false;
      if (bt1 == "X" && bt2 == "X" || bt8 == "X" && bt7 == "X" || bt9 == "X" && bt5 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton3.setText("O");
      bt3 = "O";
      turn = true;
            if (bt1 == "O" && bt2 == "O" || bt8 == "O" && bt7 == "O" || bt9 == "O" && bt5 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton3.setEnabled(false);
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        if (turn == true){
      jLabel2.setText("O");
      jButton4.setText("X");
      bt4 = "X";
      turn = false;
      if (bt1 == "X" && bt5 == "X" || bt9 == "X" && bt8 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton4.setText("O");
      bt4 = "O";
      turn = true;
       if (bt1 == "O" && bt5 == "O" || bt9 == "O" && bt8 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton4.setEnabled(false);
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        if (turn == true){
      jLabel2.setText("O");
      jButton5.setText("X");
      bt5 = "X";
      turn = false;
      if (bt4 == "X" && bt1 == "X" || bt6 == "X" && bt7 == "X" || bt9 == "X" && bt3 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton5.setText("O");
      bt5 = "O";
      turn = true;
       if (bt4 == "O" && bt1 == "O" || bt6 == "O" && bt7 == "O" || bt9 == "O" && bt3 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton5.setEnabled(false);
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        if (turn == true){
      jLabel2.setText("O");
      jButton6.setText("X");
      bt6 = "X";
      turn = false;
      if (bt5 == "X" && bt7 == "X" || bt9 == "X" && bt2 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton6.setText("O");
      bt6 = "O";
      turn = true;
      if (bt5 == "O" && bt7 == "O" || bt9 == "O" && bt2 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton6.setEnabled(false);
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        if (turn == true){
      jLabel2.setText("O");
      jButton7.setText("X");
      bt7 = "X";
      turn = false;
      if (bt8 == "X" && bt3 == "X" || bt6 == "X" && bt5 == "X" || bt9 == "X" && bt1 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton7.setText("O");
      bt7 = "O";
      turn = true;
      if (bt8 == "O" && bt3 == "O" || bt6 == "O" && bt5 == "O" || bt9 == "O" && bt1 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton7.setEnabled(false);
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        if (turn == true){
      jLabel2.setText("O");
      jButton8.setText("X");
      bt8 = "X";
      turn = false;
      if (bt7 == "X" && bt3 == "X" || bt4 == "X" && bt9 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton8.setText("O");
      bt8 = "O";
      turn = true;
      if (bt7 == "O" && bt3 == "O" || bt4 == "O" && bt9 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton8.setEnabled(false);
  } // end of jButton8_ActionPerformed

  public void jButton9_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        if (turn == true){
      jLabel2.setText("O");
      jButton9.setText("X");
      bt9 = "X";
      turn = false;
      if (bt1 == "X" && bt7 == "X" || bt3 == "X" && bt5 == "X" || bt4 == "X" && bt8 == "X" || bt2 == "X" && bt6 == "X"){
        jLabel1.setText("Player X wins!");
        jLabel2.setText("");
        lockdown();
        }
      }
    else {
      jLabel2.setText("X");
      jButton9.setText("O");
      bt9 = "O";
      turn = true;
      if (bt1 == "O" && bt7 == "O" || bt3 == "O" && bt5 == "O" || bt4 == "O" && bt8 == "O" || bt2 == "O" && bt6 == "O"){
        jLabel1.setText("Player O wins!");
        jLabel2.setText("");
        lockdown();
        }
    } // end of if-else
    jButton9.setEnabled(false);
  } // end of jButton9_ActionPerformed

  public void jButton10_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        jButton1.setEnabled(true);
        jButton1.setText("");
        bt1 = "";
        jButton2.setEnabled(true);
        jButton2.setText("");
        bt2 = "";
        jButton3.setEnabled(true);
        jButton3.setText("");
        bt3 = "";
        jButton4.setEnabled(true);
        jButton4.setText("");
        bt4 = "";
        jButton5.setEnabled(true);
        jButton5.setText("");
        bt5 = "";
        jButton6.setEnabled(true);
        jButton6.setText("");
        bt6 = "";
        jButton7.setEnabled(true);
        jButton7.setText("");
        bt7 = "";
        jButton8.setEnabled(true);
        jButton8.setText("");
        bt8 = "";
        jButton9.setEnabled(true);
        jButton9.setText("");
        bt9 = "";
        turn = true;
        jLabel1.setText("Turn of Player:");
        jLabel2.setText("X");
  } // end of jButton10_ActionPerformed
  
    
  public void lockdown(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }
  

  // Ende Methoden
} // end of class tixtactoe

