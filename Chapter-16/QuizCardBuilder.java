import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import javax.swing.*;

public class QuizCardBuilder 
{
    private ArrayList<QuizCard> cardList = new ArrayList<>();    
    private JTextArea question;
    private JTextArea answer;
    private JFrame frame;

    public static void main(String[] args) 
    {
        QuizCardBuilder gui = new QuizCardBuilder();
        gui.go();    
    }

    public void go()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        question = createTextArea(bigFont);
        JScrollPane qScroller = createScroller(question);
        answer = createTextArea(bigFont);
        JScrollPane aScroller = createScroller(answer);

        mainPanel.add(new JLabel("Question:"));
        mainPanel.add(qScroller);
        mainPanel.add(new JLabel("Answer:"));
        mainPanel.add(aScroller);

        JButton nextButton = new JButton("Next Card");
        nextButton.addActionListener(e -> nextCard());
        mainPanel.add(nextButton);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(e -> clearAll());

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(e -> saveCard());

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    } // end main()

    private JScrollPane createScroller(JTextArea textArea)
    {
        JScrollPane scroller = new JScrollPane(textArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scroller;
    } // end createScroller()

    private JTextArea createTextArea(Font font)
    {
        JTextArea textArea = new JTextArea(6, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(font);

        return textArea;
    } // end createTextArea()

    private void nextCard()
    {
        QuizCard card = new QuizCard(question.getText(), answer.getText());
        cardList.add(card);
        clearCard();
    } // end nextCard()

    private void saveCard()
    {
        QuizCard card = new QuizCard(question.getText(), answer.getText());
        cardList.add(card);

        JFileChooser fileSave = new JFileChooser();
        fileSave.showSaveDialog(frame);
        saveFile(fileSave.getSelectedFile());
    } // end saveCard()

    private void clearAll()
    {
        cardList.clear();
        clearCard();
    } // end clearAll()

    private void clearCard()
    {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    } // end clearCard()

    private void saveFile(File file)
    {
        // BufferedWriter is outside so that finally block can access it
        // BufferedWriter writer = null;

        // modern, try with resource code
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) 
        {
            
            for(QuizCard card : cardList)
            {
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }
            writer.close();
        } catch (IOException ex) 
        {
            System.out.println("Couldn't write the card list out: " + ex.getMessage());
        }

        // finally block is not needed because of using try-with-resource code 
        /* 
        finally
        {
            try
            {
                writer.close();
            }
            catch(Exception e)
            {
                System.out.println("Couldn't close the writer" + e.getMessage());
            }
        }
        */ 
    } // end saveFile()
}
