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

  public Flashcards() {

    flashWin = new JFrame("Flashcards Demo");
    flashWin.setSize(600, 500);
    flashWin.setVisible(true);
    flashWin.setLayout(null);

    response = new JTextArea("Type response here", 10, 20);
    flashWin.add(response);
    response.setBounds(200, 350, 200, 50);

    question = new JLabel("Sample Question");
    flashWin.add(question);
    question.setBounds(250, 150, 200, 50);
  }

  public void updateQuestion(String q) {
    question.setText(q);
  }

  public static void main(String[] args) {
    Flashcards f = new Flashcards();
    f.updateQuestion("Hey class. What is the weather?");

    HashMap<String, String> cards = HashMap<String, String>();
    cards.put("What is the capital of Washington?", "Olympia");

  }

}
