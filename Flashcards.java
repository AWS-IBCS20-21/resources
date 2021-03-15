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
  JButton reset;
  JLabel question;
  JLabel correct;
  ArrayList<String> questions;
  HashMap<String, String> cards;

  public void resetB() {
    questions.add("What is the capital of Washington?");
    questions.add("Who is the president of the U.S.?");
    questions.add("What's 1 + 1?");
    questions.add("How do you say tree in french?");
    questions.add("What is the meaning of life?");
  }

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

    cards = new HashMap<String, String>();
    questions = new ArrayList<String>();

    next = new JButton("Next Question");
    flashWin.add(next);
    next.setBounds(400,200,200,50);
    next.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //EVALUATE ANSWER
        String ans = response.getText();
        String curQ = question.getText();
        if (ans.equals(cards.get(curQ))) {
          System.out.println("Correct!");
        }
        else {
          System.out.println("Wrong!");
        }


        //CHOOSE NEW QUESTION AT RANDOM
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

    reset = new JButton("RESET");
    flashWin.add(reset);
    reset.setBounds(100,200,150,50);
    reset.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        resetB();
      }
    });

    flashWin.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent windowEvent){
          System.exit(0);
       }
    });
  }

  public static void main(String[] args) {

    Flashcards f = new Flashcards();

    f.cards.put("What is the capital of Washington?", "Olympia");
    f.cards.put("Who is the president of the U.S.?", "Biden");
    f.cards.put("What's 1 + 1?", "2");
    f.cards.put("How do you say tree in french?", "Arbre");
    f.cards.put("What is the meaning of life?", "42");


    f.questions.add("What is the capital of Washington?");
    f.questions.add("Who is the president of the U.S.?");
    f.questions.add("What's 1 + 1?");
    f.questions.add("How do you say tree in french?");
    f.questions.add("What is the meaning of life?");

    System.out.println(f.questions.size());


    f.question.setText("Ready for the questions? Hit next!");

  }

}
