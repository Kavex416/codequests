import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.01.2020
 * @author 
 */

public class abiturgui extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel7 = new JLabel();
  private JButton jButton1 = new JButton();
  private JLabel jLabel8 = new JLabel();
  private JLabel jLabel9 = new JLabel();
  private JLabel jLabel10 = new JLabel();
  private JLabel jLabel11 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  private JTextField jTextField5 = new JTextField();
  private JTextField jTextField6 = new JTextField();
  private JTextField jTextField7 = new JTextField();
  private JTextField jTextField8 = new JTextField();
  private JTextField jTextField9 = new JTextField();
  private JTextField jTextField10 = new JTextField();
  private JTextField jTextField11 = new JTextField();
  private JTextField jTextField12 = new JTextField();
  private JTextField jTextField13 = new JTextField();
  private JTextField jTextField14 = new JTextField();
  private JTextField jTextField15 = new JTextField();
  private JTextField jTextField16 = new JTextField();
  private JTextField jTextField17 = new JTextField();
  private JTextField jTextField18 = new JTextField();
  private JTextField jTextField19 = new JTextField();
  private JTextField jTextField20 = new JTextField();
  private JTextField jTextField21 = new JTextField();
  private JTextField jTextField22 = new JTextField();
  private JTextField jTextField23 = new JTextField();
  private JTextField jTextField24 = new JTextField();
  private JTextField jTextField25 = new JTextField();
  private JTextField jTextField26 = new JTextField();
  private JTextField jTextField27 = new JTextField();
  private JTextField jTextField28 = new JTextField();
  private JTextField jTextField29 = new JTextField();
  private JTextField jTextField30 = new JTextField();
  private JTextField jTextField31 = new JTextField();
  private JTextField jTextField32 = new JTextField();
  private JTextField jTextField33 = new JTextField();
  private JTextField jTextField34 = new JTextField();
  private JTextField jTextField35 = new JTextField();
  private JTextField jTextField36 = new JTextField();
  private JTextField jTextField37 = new JTextField();
  // Ende Attribute
  
  public abiturgui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 424; 
    int frameHeight = 616;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Abitur Rechner");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(16, 8, 390, 20);
    jLabel1.setText("Noten von Q1-Q4, der beiden LKs:");
    cp.add(jLabel1);
    jLabel2.setBounds(8, 120, 382, 20);
    jLabel2.setText("Noten aus 24 GKs (nach Halbjahr)");
    cp.add(jLabel2);
    jLabel3.setBounds(8, 136, 379, 17);
    jLabel3.setText("[davon mindestens 2 aus Geschichte, Kunst, Musik,");
    cp.add(jLabel3);
    jLabel4.setBounds(8, 152, 382, 20);
    jLabel4.setText("Darstellendes Spiel und mindestens 2 aus den");
    cp.add(jLabel4);
    jLabel5.setBounds(8, 168, 382, 20);
    jLabel5.setText( "Gesellschaftswissenschaften und mindestens 2 aus den");
    cp.add(jLabel5);
    jLabel6.setBounds(8, 184, 382, 12);
    jLabel6.setText("naturwissenschaften, einer Fremdsprache, oder Informatik:");
    cp.add(jLabel6);
    jLabel7.setBounds(0, 320, 390, 20);
    jLabel7.setText("Die Noten der 5 Abiturprüfungen:");
    cp.add(jLabel7);
    jButton1.setBounds(88, 384, 235, 49);
    jButton1.setText("Note Berechnen!");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jLabel8.setBounds(8, 448, 110, 20);
    jLabel8.setText("Erzielte Punkte:");
    cp.add(jLabel8);
    jLabel9.setBounds(128, 448, 110, 20);
    jLabel9.setText("text");
    cp.add(jLabel9);
    jLabel10.setBounds(8, 480, 110, 20);
    jLabel10.setText("Berechnete Note:");
    cp.add(jLabel10);
    jLabel11.setBounds(128, 480, 110, 20);
    jLabel11.setText("text");
    cp.add(jLabel11);
    jTextField1.setBounds(8, 32, 86, 20);
    cp.add(jTextField1);
    jTextField2.setBounds(112, 32, 86, 20);
    cp.add(jTextField2);
    jTextField3.setBounds(216, 32, 86, 20);
    cp.add(jTextField3);
    jTextField4.setBounds(320, 32, 86, 20);
    cp.add(jTextField4);
    jTextField5.setBounds(8, 56, 86, 20);
    cp.add(jTextField5);
    jTextField6.setBounds(112, 56, 86, 20);
    cp.add(jTextField6);
    jTextField7.setBounds(216, 56, 86, 20);
    cp.add(jTextField7);
    jTextField8.setBounds(320, 56, 86, 20);
    cp.add(jTextField8);
    jTextField9.setBounds(8, 200, 54, 20);
    cp.add(jTextField9);
    jTextField10.setBounds(64, 200, 54, 20);
    cp.add(jTextField10);
    jTextField11.setBounds(120, 200, 54, 20);
    cp.add(jTextField11);
    jTextField12.setBounds(176, 200, 54, 20);
    cp.add(jTextField12);
    jTextField13.setBounds(232, 200, 54, 20);
    cp.add(jTextField13);
    jTextField14.setBounds(288, 200, 54, 20);
    cp.add(jTextField14);
    jTextField15.setBounds(344, 200, 54, 20);
    cp.add(jTextField15);
    jTextField16.setBounds(8, 224, 54, 20);
    cp.add(jTextField16);
    jTextField17.setBounds(64, 224, 54, 20);
    cp.add(jTextField17);
    jTextField18.setBounds(120, 224, 54, 20);
    cp.add(jTextField18);
    jTextField19.setBounds(176, 224, 54, 20);
    cp.add(jTextField19);
    jTextField20.setBounds(232, 224, 54, 20);
    cp.add(jTextField20);
    jTextField21.setBounds(232, 272, 54, 20);
    jTextField22.setBounds(176, 272, 54, 20);
    jTextField23.setBounds(120, 272, 54, 20);
    jTextField24.setBounds(344, 224, 54, 20);
    jTextField25.setBounds(288, 224, 54, 20);
    jTextField26.setBounds(8, 248, 54, 20);
    jTextField27.setBounds(64, 248, 54, 20);
    jTextField28.setBounds(120, 248, 54, 20);
    jTextField29.setBounds(176, 248, 54, 20);
    jTextField30.setBounds(232, 248, 54, 20);
    jTextField31.setBounds(288, 248, 54, 20);
    jTextField32.setBounds(344, 248, 54, 20);
    cp.add(jTextField21);
    cp.add(jTextField22);
    cp.add(jTextField23);
    cp.add(jTextField24);
    cp.add(jTextField25);
    cp.add(jTextField26);
    cp.add(jTextField27);
    cp.add(jTextField28);
    cp.add(jTextField29);
    cp.add(jTextField30);
    cp.add(jTextField31);
    cp.add(jTextField32);
    jTextField33.setBounds(8, 344, 62, 20);
    cp.add(jTextField33);
    jTextField34.setBounds(88, 344, 62, 20);
    cp.add(jTextField34);
    jTextField35.setBounds(168, 344, 62, 20);
    cp.add(jTextField35);
    jTextField36.setBounds(248, 344, 62, 20);
    cp.add(jTextField36);
    jTextField37.setBounds(328, 344, 62, 20);
    cp.add(jTextField37);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public abiturgui
  
  // Anfang Methoden
   
  public static void main(String[] args) {
    new abiturgui();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    //Textfelder auslesen und zu Integer konvertieren
    double d1 = Double.parseDouble(jTextField1.getText());
    int LK1 = (int)d1;
    double d2 = Double.parseDouble(jTextField2.getText());
    int LK2 = (int)d2;
    double d3 = Double.parseDouble(jTextField3.getText());
    int LK3 = (int)d3;
    double d4 = Double.parseDouble(jTextField4.getText());
    int LK4 = (int)d4;
    double d5 = Double.parseDouble(jTextField5.getText());
    int LK5 = (int)d5;
    double d6 = Double.parseDouble(jTextField6.getText());
    int LK6 = (int)d6;
    double d7 = Double.parseDouble(jTextField7.getText());
    int LK7 = (int)d7;
    double d8 = Double.parseDouble(jTextField8.getText());
    int LK8 = (int)d8;
    
    double d9 = Double.parseDouble(jTextField9.getText());
    int GK1 = (int)d9;
    double d10 = Double.parseDouble(jTextField10.getText());
    int GK2 = (int)d10;
    double d11 = Double.parseDouble(jTextField11.getText());
    int GK3 = (int)d11;
    double d12 = Double.parseDouble(jTextField12.getText());
    int GK4 = (int)d12;
    double d13 = Double.parseDouble(jTextField13.getText());
    int GK5 = (int)d13;
    double d14 = Double.parseDouble(jTextField14.getText());
    int GK6 = (int)d14;
    double d15 = Double.parseDouble(jTextField15.getText());
    int GK7 = (int)d15;
    double d16 = Double.parseDouble(jTextField16.getText());
    int GK8 = (int)d16;
    double d17 = Double.parseDouble(jTextField17.getText());
    int GK9 = (int)d17;
    double d18 = Double.parseDouble(jTextField18.getText());
    int GK10 = (int)d18;
    double d19 = Double.parseDouble(jTextField19.getText());
    int GK11 = (int)d19;
    double d20 = Double.parseDouble(jTextField20.getText());
    int GK12 = (int)d20;
    double d21 = Double.parseDouble(jTextField21.getText());
    int GK13 = (int)d21;
    double d22 = Double.parseDouble(jTextField22.getText());
    int GK14 = (int)d22;
    double d23 = Double.parseDouble(jTextField23.getText());
    int GK15 = (int)d23;
    double d24 = Double.parseDouble(jTextField24.getText());
    int GK16 = (int)d24;
    double d25 = Double.parseDouble(jTextField25.getText());
    int GK17 = (int)d25;
    double d26 = Double.parseDouble(jTextField26.getText());
    int GK18 = (int)d26;
    double d27 = Double.parseDouble(jTextField27.getText());
    int GK19 = (int)d27;
    double d28 = Double.parseDouble(jTextField28.getText());
    int GK20 = (int)d28;
    double d29 = Double.parseDouble(jTextField29.getText());
    int GK21 = (int)d29;
    double d30 = Double.parseDouble(jTextField30.getText());
    int GK22 = (int)d30;
    double d31 = Double.parseDouble(jTextField31.getText());
    int GK23 = (int)d31;
    double d32 = Double.parseDouble(jTextField32.getText());
    int GK24 = (int)d32;
    
    double d33 = Double.parseDouble(jTextField33.getText());
    int PF1 = (int)d33;
    double d34 = Double.parseDouble(jTextField34.getText());
    int PF2 = (int)d34;
    double d35 = Double.parseDouble(jTextField35.getText());
    int PF3 = (int)d35;
    double d36 = Double.parseDouble(jTextField36.getText());
    int PF4 = (int)d36;
    double d37 = Double.parseDouble(jTextField37.getText());
    int PF5 = (int)d37;
    //Ende Variablen
    
    //Rechnungen
    int LKs = LK1 + LK2 + LK3 + LK4 + LK5 + LK6 + LK7 + LK8;
    int GKs = GK1 + GK2 + GK3 + GK4 + GK5 + GK6 + GK7 + GK8 + GK9 + GK10 + GK11 + GK12 + GK13 + GK14 + GK15 + GK16 + GK17 + GK18 + GK19 + GK20 + GK21 + GK22 + GK23 + GK24;
    int PFs = PF1 + PF2 + PF3 + PF4 + PF5;
    int result = 2*LKs + GKs + 4*PFs;
    String grade = "";
    if(result == 300) 
    {
      grade = "4,0";
      }  
    else if(result >= 301 && result <= 318){
      grade = "3,9";
    }
    else if(result >= 319 && result <= 336){
      grade = "3,8";
    }
    else if(result >= 337 && result <= 354){
      grade = "3,7";
    }
    else if(result >= 355 && result <= 372){
      grade = "3,6";
    }
    else if(result >= 373 && result <= 390){
      grade = "3,5";
    }
    else if(result >= 391 && result <= 408){
      grade = "3,4";
    }
    else if(result >= 409 && result <= 426){
      grade = "3,3";
    }
    else if(result >= 427 && result <= 444){
      grade = "3,2";
    }
    else if(result >= 445 && result <= 462){
      grade = "3,1";
    }
    else if(result >= 463 && result <= 480){
      grade = "3,0";
    }
    else if(result >= 481 && result <= 498){
      grade = "2,9";
    }
    else if(result >= 499 && result <= 516){
      grade = "2,8";
    }
    else if(result >= 517 && result <= 534){
      grade = "2,7";
    }
    else if(result >= 535 && result <= 552){
      grade = "2,6";
    }
    else if(result >= 553 && result <= 570){
      grade = "2,5";
    }
    else if(result >= 571 && result <= 588){
      grade = "2,4";
    }
    else if(result >= 589 && result <= 606){
      grade = "2,3";
    }
    else if(result >= 607 && result <= 624){
      grade = "2,2";
    }
    else if(result >= 625 && result <= 642){
      grade = "2,1";
    }
    else if(result >= 643 && result <= 660){
      grade = "2,0";
    }
    else if(result >= 661 && result <= 678){
      grade = "1,9";
    }
    else if(result >= 679 && result <= 696){
      grade = "1,8";
    }
    else if(result >= 697 && result <= 714){
      grade = "1,7";
    }
    else if(result >= 715 && result <= 732){
      grade = "1,6";
    }
    else if(result >= 733 && result <= 750){
      grade = "1,5";
    }
    else if(result >= 751 && result <= 768){
      grade = "1,4";
    }
    else if(result >= 769 && result <= 786){
      grade = "1,3";
    }
    else if(result >= 787 && result <= 804){
      grade = "1,2";
    }
    else if(result >= 805 && result <= 822){
      grade = "1,1";
    }
    else if(result >= 823 && result <= 900){
      grade = "1,0";
    }
    else{
      grade = "Nicht bestanden, oder ungültige Eingabe.";
      }
    // end of if-else
    jLabel9.setText(String.valueOf(result));
    jLabel11.setText(grade);
  } // end of jButton1_ActionPerformed
  
  // Ende Methoden
} // end of class abiturgui

