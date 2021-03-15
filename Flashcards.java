// Hashmap implementation with GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Flashcards {

  JFrame flashWin;
  // TextArea for responses
  // Button to flip through the "cards"
  // Label for the questions(cards)
  // Label for whether or not the response is correct
  JTextArea response;
  JButton next;
  JLabel question;
  JLabel correct;
  ArrayList<String> questions;

  public Flashcards() {

    flashWin = new JFrame("Flashcards Demo");
    flashWin.setSize(600, 500);
    flashWin.setVisible(true);
    flashWin.setLayout(null);

    //System.out.println(x);

    response = new JTextArea("Type response here", 10, 20);
    flashWin.add(response);
    response.setBounds(200, 350, 200, 50);

    question = new JLabel("Sample Question");
    flashWin.add(question);
    question.setBounds(250, 150, 300, 50);

    questions = new ArrayList<String>();

    next = new JButton("Next Question");
    flashWin.add(next);
    next.setBounds(400,200,200,50);
    next.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        int sizeA = questions.size();
        if (sizeA > 0) {
          int choice = r.nextInt(questions.size());
          String qu = questions.get(choice);
          question.setText(qu);

          questions.remove(choice);
        }
        else {
          question.setText("no more questions :(");
        }
      }
    });

    flashWin.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent windowEvent){
          System.exit(0);
       }
    });
  }

  public static void main(String[] args) {
    int x = 5;

    HashMap<String, String> cards = new HashMap<String, String>();
    cards.put("What is the capital of Washington?", "Olympia");

    Flashcards f = new Flashcards();
    f.questions.add("What is the capital of Washington?");
    f.questions.add("Who is the president of the U.S.?");
    f.questions.add("What's 1 + 1?");
    f.questions.add("How do you say tree in french?");
    f.questions.add("What is the meaning of life?");

    System.out.println(f.questions.size());


    f.question.setText("Ready for the questions? Hit next!");

  }

}
