import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.logging.*;

public class PathManager {

    public static void main(String[] args) {
        // creating a new jframe for main window
        JFrame frame = new JFrame();

        //setting elements of the frame
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when user clicks the x button, program will terminate
        frame.setLayout(new BorderLayout()); // setting the layout of the frame to border layout
        frame.getContentPane().setBackground(GUIStyle.BACKGROUND_COLOR);

        //creating top menu panel for the tabs / buttons
        JPanel topMenuPanel = new JPanel();
        topMenuPanel.setLayout(new GridLayout(1,4, 10, 0));
        topMenuPanel.setBackground(GUIStyle.BACKGROUND_COLOR);
        topMenuPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // creating buttons for the top menu panel
        JButton DirectoryCleanserButton = GUIStyle.createStyledButton("Directory Cleanser");
        JButton FileRenamerButton = GUIStyle.createStyledButton("File Renamer");
        JButton FileMoverButton = GUIStyle.createStyledButton("File Mover");
    

        // adding buttons to the top menu panel
        topMenuPanel.add(DirectoryCleanserButton);
        topMenuPanel.add(FileRenamerButton);
        topMenuPanel.add(FileMoverButton);


        // adding the top menu panel to the frame
        frame.add(topMenuPanel, BorderLayout.NORTH);

        // creating a center panel for path input field and submit button as a FlowLayout
        JPanel pathInputPanel = new JPanel();
        pathInputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pathInputPanel.setBackground(GUIStyle.BACKGROUND_COLOR);

        // creating a path input field
        JTextField pathInputField = new JTextField(30);

        //creating a label for the path input field
        JLabel pathLabel = new JLabel("Enter Path:");
        pathLabel.setForeground(GUIStyle.TEXT_COLOR);
        pathLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        // creating a submit button
        JButton submitButton = styledButton("Submit", GUIStyle.BUTTON_COLOR, GUIStyle.TEXT_COLOR);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String path = pathInputField.getText();
                System.out.println("Path is set to: " + path);
            }
        });

        // adding components to the path input panel
        pathInputPanel.add(pathLabel);
        pathInputPanel.add(pathInputField);
        pathInputPanel.add(submitButton);
       

        //creating a label for the words to be targeted
        JLabel targetWordInputLabel = new JLabel("Enter specific words to be targeted:");
        targetWordInputLabel.setForeground(GUIStyle.TEXT_COLOR);
        targetWordInputLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        // creating a text area for the words to be targeted
        JTextField targetWordInputArea = new JTextField(30);
        targetWordInputArea.setForeground(GUIStyle.TEXT_COLOR);
        targetWordInputArea.setBackground(GUIStyle.BACKGROUND_COLOR);

         // buttons to locate the words that are targeted in the entered path
         JButton locateWordsButton = GUIStyle.createStyledButton("Locate in Path"); // button to show the files and folders that contain the targeted words
         JButton removeWordsButton = GUIStyle.createStyledButton("Remove Relevant Files & Folders"); // button to remove the files and folders that contain the targeted words
 
        
        // main panel for input fields for words to be targeted
        JPanel targetWordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,15));
        targetWordPanel.setBackground(GUIStyle.BACKGROUND_COLOR);
        targetWordPanel.add(targetWordInputLabel);
        targetWordPanel.add(targetWordInputArea);
        targetWordPanel.add(locateWordsButton);
        targetWordPanel.add(removeWordsButton);

         // creating a combined panel for the directory cleanser
         JPanel combinedPanel1 = new JPanel(new BorderLayout());
         combinedPanel1.setBackground(GUIStyle.BACKGROUND_COLOR);
         combinedPanel1.add(pathInputPanel, BorderLayout.NORTH);
         combinedPanel1.add(targetWordPanel, BorderLayout.CENTER);

 
        
        DirectoryCleanserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.add(combinedPanel1 , BorderLayout.CENTER);

                // to ensure that the dynamic changes are correctly displayed
                frame.revalidate();
                frame.repaint();
                
            }
        });

        


        frame.setVisible(true);
    }

    private static JButton styledButton(String text, Color bgColor, Color fgColor) {
        JButton button = new JButton(text);
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setFont(new Font("Arial", Font.PLAIN, 12));
        return button;
    }
}
