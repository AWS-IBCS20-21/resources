//Container: Graphics object (component) that can contain
// another component
//Component: Graphics object (abstract)
//Event Handling: Objects that do not have graphical
// representation. Allows the user to interact with
// components or containers.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingExample {

  public static void main(String[] args) {
    JFrame myFrame = new JFrame("First GUI");
    myFrame.setVisible(true);
    myFrame.setSize(600,800);
    myFrame.setLayout(null);

    JLabel myLabel = new JLabel("Hello. This is GUI");
    myFrame.add(myLabel);
    myLabel.setBounds(100,100, 150, 50);

    JButton myButton = new JButton("GUI Button");
    myFrame.add(myButton);
    myButton.setBounds(350,200, 100, 80);
    JCheckBox myCheckBox = new JCheckBox("IB CS student", true);
    myFrame.add(myCheckBox);


    TextArea ta = new TextArea("Type here", 10, 20);
    myFrame.add(ta);
    ta.setBounds(200, 300, 140, 140);
    ta.addTextListener(new TextListener(){
      public void textValueChanged(TextEvent e) {
        myLabel.setText(ta.getText());
      }
    });

    myFrame.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent windowEvent){
          System.exit(0);
       }
    });
  }
}
