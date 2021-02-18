import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AL extends JFrame implements WindowListener,ActionListener {
        JTextField text = new JTextField(20);
        JButton b;
        JButton b2;
        private int numClicks = 0;

        public AL(String title) {

          super(title);
          setLayout(new FlowLayout());
          addWindowListener(this);
          b = new JButton("Click me");
          add(b);
          b2 = new JButton("Don't Click Me");
          add(b2);
          add(text);
          b.addActionListener(this);
          b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              numClicks--;
              text.setText("Button Clicked " + numClicks + " times");
            }
          });
        }

        public static void main(String[] args) {
          AL myWindow = new AL("My first window");
          myWindow.setSize(350,100);
          myWindow.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
          numClicks++;
          text.setText("Button Clicked " + numClicks + " times");
        }

        public void windowClosing(WindowEvent e) {
          dispose();
          System.exit(0);
        }



        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}
