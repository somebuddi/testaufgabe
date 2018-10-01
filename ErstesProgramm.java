import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 01.10.2018
 * @author 
 */

public class ErstesProgramm extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  
  public ErstesProgramm() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("ErstesProgramm");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(40, 168, 105, 33);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(160, 168, 97, 33);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jLabel1.setBounds(48, 32, 209, 105);
    jLabel1.setText("text");
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public ErstesProgramm
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new ErstesProgramm();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    jLabel1.setText("OK!");
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    jLabel1.setText("Abbrechen");
    
  } // end of jButton2_ActionPerformed

  // Ende Methoden
} // end of class ErstesProgramm

