package file_organizer_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Choice;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComboBox;
public class FileOrganizerGUI {
	/**
	 * Frame and all of its contents
	 */
	private JFrame frmWelcomeToOur;
	private JTextField txtPlaceDirectoryHere;
	private JTextField txtPlaceDirectoryHere_1;
	private JTextField txtPlaceDirectoryHere_2;
	private JTextField txtPlaceDirectoryHere_3;
	private JTextField txtPlaceDirectoryHere_4;
	private JTextField txtPlaceDirectoryHere_5;
	private JTextField txtPlaceDirectoryHere_6;
	private JTextField txtPlaceDirectoryHere_7;
	private JTextField txtPlaceDirectoryHere_8;
	private JTextField txtPlaceDirectoryHere_9;
	private EnterTextFieldHandler handler;
	private JButton btnClickForHelp;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileOrganizerGUI window = new FileOrganizerGUI();
					window.frmWelcomeToOur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FileOrganizerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToOur = new JFrame("File To Our File Organizer!");
		frmWelcomeToOur.setTitle("Welcome To Our File Organizer!");
		frmWelcomeToOur.getContentPane().setForeground(Color.WHITE);
		frmWelcomeToOur.setForeground(Color.CYAN);
		frmWelcomeToOur.setBackground(new Color(0, 0, 255));
		frmWelcomeToOur.getContentPane().setBackground(Color.GRAY);
		frmWelcomeToOur.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 13));
		frmWelcomeToOur.setBounds(100, 100, 450, 300);
		frmWelcomeToOur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToOur.getContentPane().setLayout(null);
		
		JButton directoryInstrctionsButton = new JButton("Input The Directories You Want To Watch");
		directoryInstrctionsButton.setForeground(Color.WHITE);
		directoryInstrctionsButton.setBackground(Color.BLUE);
		directoryInstrctionsButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		directoryInstrctionsButton.setBounds(12, 13, 396, 26);
		frmWelcomeToOur.getContentPane().add(directoryInstrctionsButton);
		/**
		 * instance of the EnterTestFieldHandler class. Used as an action listener that registers appropriate directories
		 */
		handler = new EnterTextFieldHandler();
		
		txtPlaceDirectoryHere = new JTextField();
		txtPlaceDirectoryHere.setForeground(Color.BLUE);
		txtPlaceDirectoryHere.setBackground(Color.WHITE);
		txtPlaceDirectoryHere.setText("Place Directory Here");
		txtPlaceDirectoryHere.setBounds(12, 52, 132, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere);
		txtPlaceDirectoryHere.setColumns(10);
		txtPlaceDirectoryHere.addActionListener(handler);
		
		txtPlaceDirectoryHere_1 = new JTextField();
		txtPlaceDirectoryHere_1.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_1.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_1.setText("Place Directory Here");
		txtPlaceDirectoryHere_1.setBounds(12, 87, 132, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_1);
		txtPlaceDirectoryHere_1.setColumns(10);
		txtPlaceDirectoryHere_1.addActionListener(handler);
		
		txtPlaceDirectoryHere_2 = new JTextField();
		txtPlaceDirectoryHere_2.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_2.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_2.setText("Place Directory Here");
		txtPlaceDirectoryHere_2.setBounds(12, 122, 132, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_2);
		txtPlaceDirectoryHere_2.setColumns(10);
		txtPlaceDirectoryHere_2.addActionListener(handler);
		
		txtPlaceDirectoryHere_3 = new JTextField();
		txtPlaceDirectoryHere_3.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_3.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_3.setText("Place Directory Here");
		txtPlaceDirectoryHere_3.setBounds(12, 157, 132, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_3);
		txtPlaceDirectoryHere_3.setColumns(10);
		txtPlaceDirectoryHere_3.addActionListener(handler);
		
		txtPlaceDirectoryHere_4 = new JTextField();
		txtPlaceDirectoryHere_4.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_4.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_4.setText("Place Directory Here");
		txtPlaceDirectoryHere_4.setBounds(12, 192, 132, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_4);
		txtPlaceDirectoryHere_4.setColumns(10);
		txtPlaceDirectoryHere_4.addActionListener(handler);
		
		txtPlaceDirectoryHere_5 = new JTextField();
		txtPlaceDirectoryHere_5.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_5.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_5.setText("Place Directory Here");
		txtPlaceDirectoryHere_5.setBounds(268, 52, 140, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_5);
		txtPlaceDirectoryHere_5.setColumns(10);
		txtPlaceDirectoryHere_5.addActionListener(handler);
		
		txtPlaceDirectoryHere_6 = new JTextField();
		txtPlaceDirectoryHere_6.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_6.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_6.setText("Place Directory Here");
		txtPlaceDirectoryHere_6.setBounds(268, 87, 140, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_6);
		txtPlaceDirectoryHere_6.setColumns(10);
		txtPlaceDirectoryHere_6.addActionListener(handler);
		
		txtPlaceDirectoryHere_7 = new JTextField();
		txtPlaceDirectoryHere_7.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_7.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_7.setText("Place Directory Here");
		txtPlaceDirectoryHere_7.setBounds(268, 122, 140, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_7);
		txtPlaceDirectoryHere_7.setColumns(10);
		txtPlaceDirectoryHere_7.addActionListener(handler);
		
		txtPlaceDirectoryHere_8 = new JTextField();
		txtPlaceDirectoryHere_8.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_8.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_8.setText("Place Directory Here");
		txtPlaceDirectoryHere_8.setBounds(268, 157, 140, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_8);
		txtPlaceDirectoryHere_8.setColumns(10);
		txtPlaceDirectoryHere_8.addActionListener(handler);
		
		txtPlaceDirectoryHere_9 = new JTextField();
		txtPlaceDirectoryHere_9.setForeground(Color.BLUE);
		txtPlaceDirectoryHere_9.setBackground(Color.WHITE);
		txtPlaceDirectoryHere_9.setText("Place Directory Here");
		txtPlaceDirectoryHere_9.setBounds(268, 192, 140, 22);
		frmWelcomeToOur.getContentPane().add(txtPlaceDirectoryHere_9);
		txtPlaceDirectoryHere_9.setColumns(10);
		txtPlaceDirectoryHere_9.addActionListener(handler);
		
		btnClickForHelp = new JButton("Help");
		btnClickForHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f=new JFrame("How To Register");
				f.setBounds(300, 200, 350,100);
				JTextArea jd = new JTextArea("To register a file/directory, go to the file explorer\nand navigate to the file/directory you want to register\nthen copy the path and paste it in one of the watch boxes.");
				jd.setSize(400, 200);
				f.getContentPane().add(jd);
				f.setVisible(true);
				
			}
		});
		btnClickForHelp.setBounds(171, 85, 70, 26);
		frmWelcomeToOur.getContentPane().add(btnClickForHelp);
		
		String[] recursive = new String[]{"Recursive?","Yes","No"};
		comboBox = new JComboBox(recursive);
		comboBox.setToolTipText("Recursive Search?");
		comboBox.setBounds(156, 146, 100, 33);
		frmWelcomeToOur.getContentPane().add(comboBox);
		
		
	}
	/**
	 * @author Joshua Lamke
	 * ActionHandler that will validate and register appropriate directories to the file watcher
	 */
	private class EnterTextFieldHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent enter) {
			String s="";
			boolean wantsRecursive;
			JTextField tf = (JTextField) enter.getSource();
			s = tf.getText();
			Path p = Paths.get(s);
			try {
				if(((String)comboBox.getSelectedItem()).equals("Recursive?") || ((String)comboBox.getSelectedItem()).equals("No")) {
					wantsRecursive=false;
					DirectoryValidator.validate(p,wantsRecursive);
				}
				else {
					wantsRecursive=true;
					DirectoryValidator.validate(p,wantsRecursive);
				}
			
			}
			catch(DirectoryNotFoundException e) {
				e.getExceptionPopUp();
			}
			catch(Exception e) {
				System.out.println("Something has gone wrong");
			}
			
		}
		
	}
}
