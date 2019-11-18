package file_organizer_gui;

import java.awt.Color;
import java.awt.Font;
import java.nio.file.Path;

import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 * @author Joshua Lamke
 * Exception that is thrown when the inputed path does not exist inside of the file system
 */
@SuppressWarnings("serial")
public class DirectoryNotFoundException extends Exception{
	private String message;
	private String pathName;
	private JFrame popUp;
	private JTextArea buttonForException;
	/**
	 * @author Joshua Lamke
	 * @param p The directory to be verified
	 */
public DirectoryNotFoundException(Path p) {
	pathName=p.toString();
	message = "Unable to find the Directory/File named:\n\"" + pathName + "\"\nPlease check the spelling or click\nthe help button for more information.\n Exiting Gui";
	/**
	 * Creates a popUp window for the exception detailing what went wrong
	 */
	popUp = new JFrame("Directory Not Found");
	popUp.getContentPane().setBackground(Color.WHITE);
	popUp.setBounds(500, 500, 500, 200);
	popUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	popUp.getContentPane().setLayout(null);
	
	buttonForException = new JTextArea(message);
	buttonForException.setFont(new Font("Times New Roman",Font.BOLD,24));
	buttonForException.setBounds((int)popUp.getAlignmentX()/2, (int)popUp.getAlignmentY(), 500, 300);
	popUp.getContentPane().add(buttonForException);
}
/**
 * sets the DirectoryNotFoundExcpetion's error message pop up to be visible
 */
public void getExceptionPopUp() {
	popUp.setVisible(true);
}
}
