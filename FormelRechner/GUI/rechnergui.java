import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.01.2020
 * @author 
 */

public class rechnergui extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel13 = new JLabel();
  private JLabel jLabel14 = new JLabel();
  private JLabel jLabel15 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  private JButton jButton5 = new JButton();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  // Ende Attribute
  
  public rechnergui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 509; 
    int frameHeight = 292;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("rechnergui");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(40, 24, 406, 20);
    jLabel1.setText("Wähle eine Formel");
    cp.add(jLabel1);
    jButton1.setBounds(32, 72, 129, 41);
    jButton1.setText("Binomische Formel");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(344, 72, 115, 41);
    jButton2.setText("Geschwindigkeit");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(32, 168, 129, 49);
    jButton3.setText("pq-Formel");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(288, 176, 185, 41);
    jButton4.setText("Gleichförmige Beschleunigung");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jLabel6.setBounds(72, 120, 46, 20);
    jLabel6.setText("a");
    cp.add(jLabel6);
    jLabel13.setBounds(304, 120, 43, 17);
    jLabel13.setText("v1");
    cp.add(jLabel13);
    jLabel14.setBounds(72, 152, 43, 17);
    jLabel14.setText("t1");
    cp.add(jLabel14);
    jLabel15.setBounds(304, 160, 35, 17);
    jLabel15.setText("t2");
    cp.add(jLabel15);
    jTextField1.setBounds(120, 120, 78, 20);
    cp.add(jTextField1); //a
    jTextField2.setBounds(352, 120, 78, 20);
    cp.add(jTextField2);  //b
    jTextField3.setBounds(120, 152, 81, 17);
    cp.add(jTextField3);
    jTextField4.setBounds(352, 160, 73, 17);
    cp.add(jTextField4);
    jButton5.setBounds(184, 176, 89, 33);
    jButton5.setText("Berechnen!");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jLabel2.setBounds(88, 224, 99, 25);
    jLabel2.setText("Das Ergebnis ist:");
    cp.add(jLabel2);
    jLabel3.setBounds(200, 224, 291, 25);
    jLabel3.setText("text");
    cp.add(jLabel3);
    // Ende Komponenten
    
    setVisible(true);
    
    jLabel6.setVisible(false);
    jLabel14.setVisible(false);
    jLabel15.setVisible(false);
    jLabel13.setVisible(false);
    jLabel2.setVisible(false);
    jLabel3.setVisible(false);
    jTextField1.setEnabled(false);
    jTextField1.setVisible(false);
    jTextField2.setEnabled(false);
    jTextField2.setVisible(false);
    jTextField3.setEnabled(false);
    jTextField3.setVisible(false);
    jTextField4.setEnabled(false);
    jTextField4.setVisible(false);
    jButton5.setVisible(false);
    jButton5.setEnabled(false);
    
  } // end of public rechnergui
  
  // Anfang Methoden
  static int f = 0;
  
  public static void main(String[] args) {
    new rechnergui();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setEnabled(false);
    jButton1.setVisible(false);
    jButton2.setEnabled(false);
    jButton2.setVisible(false);
    jButton3.setEnabled(false);
    jButton3.setVisible(false);
    jButton4.setEnabled(false);
    jButton4.setVisible(false);
    jLabel1.setText("Formel: (a+b)^2");
    jLabel6.setVisible(true);
    jLabel6.setText("a:");
    jLabel13.setVisible(true);
    jLabel13.setText("b:");
    jTextField1.setEnabled(true);
    jTextField1.setVisible(true);
    jTextField2.setEnabled(true);
    jTextField2.setVisible(true);
    f = 1;
    jButton5.setVisible(true);
    jButton5.setEnabled(true);
    jLabel2.setVisible(true);
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setEnabled(false);
    jButton1.setVisible(false);
    jButton2.setEnabled(false);
    jButton2.setVisible(false);
    jButton3.setEnabled(false);
    jButton3.setVisible(false);
    jButton4.setEnabled(false);
    jButton4.setVisible(false);
    jLabel1.setText("Formel: s/t");
    jLabel6.setVisible(true);
    jLabel6.setText("s:");
    jLabel13.setVisible(true);
    jLabel13.setText("t:");
    jTextField1.setEnabled(true);
    jTextField1.setVisible(true);
    jTextField2.setEnabled(true);
    jTextField2.setVisible(true);
    f = 2;
    jButton5.setVisible(true);
    jButton5.setEnabled(true);
    jLabel2.setVisible(true);
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton1.setEnabled(false);
    jButton1.setVisible(false);
    jButton2.setEnabled(false);
    jButton2.setVisible(false);
    jButton3.setEnabled(false);
    jButton3.setVisible(false);
    jButton4.setEnabled(false);
    jButton4.setVisible(false);
    jLabel1.setText("Formel: -p/2 +- sqrt((p/s)^2 -q)");
    jLabel6.setVisible(true);
    jLabel6.setText("p:");
    jLabel13.setVisible(true);
    jLabel13.setText("q:");
    jTextField1.setEnabled(true);
    jTextField1.setVisible(true);
    jTextField2.setEnabled(true);
    jTextField2.setVisible(true);
    f = 3;
    jButton5.setVisible(true);
    jButton5.setEnabled(true);
    jLabel2.setVisible(true);
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
        jButton1.setEnabled(false);
    jButton1.setVisible(false);
    jButton2.setEnabled(false);
    jButton2.setVisible(false);
    jButton3.setEnabled(false);
    jButton3.setVisible(false);
    jButton4.setEnabled(false);
    jButton4.setVisible(false);
    jLabel1.setText("Formel: (v2-v1)/(t2-t1)");
    jLabel6.setVisible(true);
    jLabel6.setText("v2:");
    jLabel13.setVisible(true);
    jLabel13.setText("v1:");
    jLabel14.setVisible(true);
    jLabel14.setText("t2");
    jLabel15.setVisible(true);
    jLabel15.setText("t1");
    jTextField1.setEnabled(true);
    jTextField1.setVisible(true);
    jTextField2.setEnabled(true);
    jTextField2.setVisible(true);
    jTextField3.setEnabled(true);
    jTextField3.setVisible(true);
    jTextField4.setEnabled(true);
    jTextField4.setVisible(true);
    f = 4;
    jButton5.setVisible(true);
    jButton5.setEnabled(true);
    jLabel2.setVisible(true);
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     if (f == 1){
      String as = jTextField1.getText();
      String bs = jTextField2.getText();
      int a = Integer.parseInt(as);
      int b = Integer.parseInt(bs);
      double c = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);
      jLabel3.setVisible(true);
      String cs = String.valueOf(c);
      jLabel3.setText(cs);
      jLabel1.setText("Formel: (" + a + "+" + b + ")^2");
      }
    else if (f == 2){
      String as = jTextField1.getText();
      String bs = jTextField2.getText();
      int s = Integer.parseInt(as);
      int t = Integer.parseInt(bs);
      double v = s / t;
      jLabel3.setVisible(true);
      String cs = String.valueOf(v);
      jLabel3.setText(cs);
      jLabel1.setText("Formel: " + s + "/" + t);
    } 
    else if (f == 3){
      String as = jTextField1.getText();
      String bs = jTextField2.getText();
      int p = Integer.parseInt(as);
      int q = Integer.parseInt(bs);
      double v = - p / 2 + Math.sqrt(Math.pow(p / 2, 2) - q);
      double w = - p / 2 - Math.sqrt(Math.pow(p / 2, 2) - q);
      jLabel3.setVisible(true);
      String cs = String.valueOf(v);
      String ds = String.valueOf(w);
      jLabel3.setText(cs + " and " + ds);
      jLabel1.setText("Formel: -" + p + "/2 +- sqrt((" + p + "/2)^2 -" + q + ")");
    }
    else if (f == 4) {
      String as = jTextField1.getText();
      String bs = jTextField2.getText();
      String cs = jTextField3.getText();
      String ds = jTextField4.getText();
      int s = Integer.parseInt(as);
      int t = Integer.parseInt(bs);
      int u = Integer.parseInt(cs);
      int v = Integer.parseInt(ds);
      int w = s - t;
      int x = u - v;
      int y = w / x;
      jLabel3.setVisible(true);
      String zs = String.valueOf(y);
      jLabel3.setText(zs);
      jLabel1.setText("Formel: (" + s + "-" + t + ")/(" + u + "-" + v + ")");
    }
    // end of if-else
      
  } // end of jButton5_ActionPerformed

  // Ende Methoden
} // end of class rechnergui

