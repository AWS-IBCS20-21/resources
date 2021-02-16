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
    myFrame.setLayout(new FlowLayout());

    JLabel myLabel = new JLabel("Hello. This is GUI");
    myFrame.add(myLabel);

    JButton myButton = new JButton("GUI Button");
    myFrame.add(myButton);
    JCheckBox myCheckBox = new JCheckBox("IB CS student", true);
    myFrame.add(myCheckBox);
    //JList myList
    //JComboBox myCB
    //JScrollbar myScroll

    myFrame.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent windowEvent){
          System.exit(0);
       }
    });
  }

}
