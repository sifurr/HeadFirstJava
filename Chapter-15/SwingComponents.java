import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;

public class SwingComponents 
{
    private JCheckBox checkBox;
    private JList<String> list;

    public static void main(String[] args) 
    {
        SwingComponents gui = new SwingComponents();
        gui.go();    
    }

    public void go()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField textField = new JTextField(20);
        // textField.setPreferredSize(new Dimension(200, 40));
        textField.setFont(new Font("serif", Font.PLAIN, 20));
        textField.setBackground(Color.PINK);
        textField.setForeground(Color.white);
        textField.setCaretColor(Color.white);
        textField.setText("Text Field: Type anything");

        JTextArea textArea = new JTextArea(10, 20);
        textArea.setText("Text Area: ");
        textArea.setBackground(new Color(0x000000)); // way to set custom color using hex value
        textArea.setForeground(Color.green);
        textArea.setFont(new Font("serif", Font.PLAIN, 18));
        textArea.setCaretColor(Color.green);
        // textArea.selectAll(); // it will select all text by default
        // textArea.requestFocus(); // user will be able to start tying immediately
        // textArea.append("button clicked"); // it will look like the user has already clicked        

        // set scrolbar for text area
        JScrollPane scrollerForTextArea = new JScrollPane(textArea);
        scrollerForTextArea.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollerForTextArea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        textArea.setLineWrap(true);

        checkBox = new JCheckBox();
        // checkBox.setSelected(true);
        checkBox.addItemListener(new CheckboxListener());

        // List item
        String[] listEntries = {"alpha", "beta", "gama", "delta", "epsilon", "zeta", "eta", "theta"};
        list = new JList<>(listEntries);
        JScrollPane scrollerForJList = new JScrollPane(list);
        scrollerForJList.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollerForJList.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        list.setVisibleRowCount(4); // number of lines to show before scrolling
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // retrict the user to selecting only one item at a time
        list.addListSelectionListener(new ListListener());

        JButton button = new JButton("click me");
        button.addActionListener(event ->
                                        {
                                            if(event.getSource() == button)
                                            {
                                                System.out.println(textField.getText());
                                                textField.setText(""); // clear the text field
                                                textArea.setText(""); // clear the text area
                                                button.setEnabled(false);
                                            }
                                            
                                        }       
                                );
        panel.add(button); // button
        panel.add(textField); // text field
        panel.add(scrollerForTextArea); // text area
        panel.add(checkBox); // check box
        panel.add(scrollerForJList); // list items        
        
        frame.getContentPane().add( BorderLayout.CENTER, panel);
        frame.setSize(300, 300);        
        frame.pack();
        frame.setVisible(true);
    } // end go()

    class CheckboxListener implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            String onOrOff = "off";
            if(checkBox.isSelected())
            {
                onOrOff = "on";
            }
            System.out.println("Check box is " + onOrOff);
        }
    } // end CheckboxListener

    class ListListener implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent e) 
        {
            if(!e.getValueIsAdjusting())
            {
                String selection = list.getSelectedValue();
                System.out.println(selection);
            }            
        }   
    }
}
