package file_organizer_gui;

import java.awt.Color;
import java.awt.Font;
import java.nio.file.Path;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @@author William Hiranpat
 * Exception that is thrown when the file has no extension
 */

public class NoExtensionException extends Exception{
    private String message;
    private String pathName;
    private JFrame popUp;
    private JTextArea buttonForException;

    public NoExtensionException(String message){
        this.message = message;
        popUp = new JFrame("Extension not Found");
        popUp.getContentPane().setBackground(Color.WHITE);
        popUp.setBounds(500, 500, 500, 200);
        popUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popUp.getContentPane().setLayout(null);
    
        buttonForException = new JTextArea(message);
        buttonForException.setFont(new Font("Times New Roman",Font.BOLD,24));
        buttonForException.setBounds((int)popUp.getAlignmentX()/2, (int)popUp.getAlignmentY(), 500, 300);
        popUp.getContentPane().add(buttonForException);
    }

    public void showExceptionPopUp() {
        popUp.setVisible(true);
    }
}