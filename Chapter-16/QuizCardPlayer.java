import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class QuizCardPlayer 
{
    private ArrayList<QuizCard> cardList;
    private int currentCardIndex;
    private QuizCard currentCard;
    private JTextArea display;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    public static void main(String[] args) 
    {
        QuizCardPlayer reader = new QuizCardPlayer();
        reader.go();    
    } // end main()

    public void go()
    {
        frame = new JFrame("Quiz Card Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        display = new JTextArea(10, 20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setEditable(false);

        JScrollPane scroller = new JScrollPane(display);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainPanel.add(scroller);

        nextButton = new JButton("Show Question");
        nextButton.addActionListener(e -> nextCard());
        mainPanel.add(nextButton);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Laod card set");
        loadMenuItem.addActionListener(e -> open());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setVisible(true);
    } // end go()

    private void nextCard()
    {
        if(isShowAnswer)
        {
            display.setText(currentCard.getAnswer());
            nextButton.setText("Next Card");
            isShowAnswer = false;
        }
        else
        {
            if(currentCardIndex < cardList.size())
            {   
                // show the next question
                showNextCard();
            }
            else
            {
                // there are no more cards
                display.setText("That was the last card");
                nextButton.setEnabled(false);
            }
        }
    }// end nextCard()

    private void open()
    {
        JFileChooser fileOpen = new JFileChooser();
        fileOpen.showOpenDialog(frame);
        loadFile(fileOpen.getSelectedFile());
    } // end open()

    private void loadFile(File file)
    {
        cardList = new ArrayList<>();
        currentCardIndex = 0;
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null)
            {
                makeCard(line);
            }
            reader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Could't write the cardlist out: " + e.getMessage());
        } // end try/catch
        // now show the first card
        showNextCard();
    } // end loadFile()

    private void makeCard(String lineToParse)
    {
        String[] result = lineToParse.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        cardList.add(card);
        System.out.println("made a card");
    } // end makeCard()

    private void showNextCard()
    {
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
    } // end showNextCard();
} // end class
