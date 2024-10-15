import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PathManager {

    public static void main(String[] args) {
        // creating a new jframe for main window
        JFrame frame = new JFrame();

        //setting elements of the frame
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when user clicks the x button, program will terminate   frame.setLayout(new FlowLayout()); // setting the layout of the frame to flow layout
        frame.setLayout(new BorderLayout()); // setting the layout of the frame to grid layout

        //creating top menu panel for the tabs / buttons
        JPanel topMenuPanel = new JPanel();
        topMenuPanel.setLayout(new GridLayout(1,4));

        // creating buttons for the top menu panel
        JButton DirectoryCleanser = new JButton("Directory Cleanser");
        JButton FileRenamer = new JButton("File Renamer");
        JButton FileMover = new JButton("File Mover");
        JButton Console = new JButton("Console");

        // adding buttons to the top menu panel
        topMenuPanel.add(DirectoryCleanser);
        topMenuPanel.add(FileRenamer);
        topMenuPanel.add(FileMover);
        topMenuPanel.add(Console);

        // adding the top menu panel to the frame
        frame.add(topMenuPanel, BorderLayout.NORTH);

        // creating a center panel for path input field and submit button as a FlowLayout
        JPanel pathInputPanel = new JPanel();
        pathInputPanel.setLayout(new FlowLayout());

        // creating a path input field
        JTextField pathInputField = new JTextField(30);

        //creating a label for the path input field
        JLabel pathLabel = new JLabel("Enter Path:");

        // creating a submit button
        JButton submitButton = new JButton("Submit");

        // adding components to the path input panel
        pathInputPanel.add(pathLabel);
        pathInputPanel.add(pathInputField);
        pathInputPanel.add(submitButton);

        // adding the path input panel to the frame
        frame.add(pathInputPanel, BorderLayout.CENTER);

        frame.setVisible(true);

        
      }

}


