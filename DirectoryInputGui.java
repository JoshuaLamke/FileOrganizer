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
public class DirectoryInputGui {
	/**
	 * Frame and all of its contents
	 */
	private JFrame DirectoryWatcherFrame;
	private JTextField Directory1;
	private JTextField Directory2;
	private JTextField Directory3;
	private JTextField Directory4;
	private JTextField Directory5;
	private JTextField Directory6;
	private JTextField Directory7;
	private JTextField Directory8;
	private JTextField Directory9;
	private JTextField Directory10;
	private EnterTextFieldHandler handler;
	private JButton btnClickForHelp;
	private JComboBox RecursiveOrNotSelection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DirectoryInputGui window = new DirectoryInputGui();
					window.DirectoryWatcherFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExtensionSettingsGui window = new ExtensionSettingsGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DirectoryInputGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DirectoryWatcherFrame = new JFrame("File To Our File Organizer!");
		DirectoryWatcherFrame.setTitle("Welcome To Our File Organizer!");
		DirectoryWatcherFrame.getContentPane().setForeground(Color.WHITE);
		DirectoryWatcherFrame.setForeground(Color.CYAN);
		DirectoryWatcherFrame.setBackground(new Color(0, 0, 255));
		DirectoryWatcherFrame.getContentPane().setBackground(Color.GRAY);
		DirectoryWatcherFrame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 13));
		DirectoryWatcherFrame.setBounds(100, 100, 450, 300);
		DirectoryWatcherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DirectoryWatcherFrame.getContentPane().setLayout(null);
		
		JButton directoryInstrctionsButton = new JButton("Input The Directories You Want To Watch");
		directoryInstrctionsButton.setForeground(Color.WHITE);
		directoryInstrctionsButton.setBackground(Color.BLUE);
		directoryInstrctionsButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		directoryInstrctionsButton.setBounds(12, 13, 396, 26);
		DirectoryWatcherFrame.getContentPane().add(directoryInstrctionsButton);
		/**
		 * instance of the EnterTestFieldHandler class. Used as an action listener that registers appropriate directories
		 */
		handler = new EnterTextFieldHandler();
		
		Directory1 = new JTextField();
		Directory1.setForeground(Color.BLUE);
		Directory1.setBackground(Color.WHITE);
		Directory1.setText("Place Directory Here");
		Directory1.setBounds(12, 52, 132, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory1);
		Directory1.setColumns(10);
		Directory1.addActionListener(handler);
		
		Directory2 = new JTextField();
		Directory2.setForeground(Color.BLUE);
		Directory2.setBackground(Color.WHITE);
		Directory2.setText("Place Directory Here");
		Directory2.setBounds(12, 87, 132, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory2);
		Directory2.setColumns(10);
		Directory2.addActionListener(handler);
		
		Directory3 = new JTextField();
		Directory3.setForeground(Color.BLUE);
		Directory3.setBackground(Color.WHITE);
		Directory3.setText("Place Directory Here");
		Directory3.setBounds(12, 122, 132, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory3);
		Directory3.setColumns(10);
		Directory3.addActionListener(handler);
		
		Directory4 = new JTextField();
		Directory4.setForeground(Color.BLUE);
		Directory4.setBackground(Color.WHITE);
		Directory4.setText("Place Directory Here");
		Directory4.setBounds(12, 157, 132, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory4);
		Directory4.setColumns(10);
		Directory4.addActionListener(handler);
		
		Directory5 = new JTextField();
		Directory5.setForeground(Color.BLUE);
		Directory5.setBackground(Color.WHITE);
		Directory5.setText("Place Directory Here");
		Directory5.setBounds(12, 192, 132, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory5);
		Directory5.setColumns(10);
		Directory5.addActionListener(handler);
		
		Directory6 = new JTextField();
		Directory6.setForeground(Color.BLUE);
		Directory6.setBackground(Color.WHITE);
		Directory6.setText("Place Directory Here");
		Directory6.setBounds(268, 52, 140, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory6);
		Directory6.setColumns(10);
		Directory6.addActionListener(handler);
		
		Directory7 = new JTextField();
		Directory7.setForeground(Color.BLUE);
		Directory7.setBackground(Color.WHITE);
		Directory7.setText("Place Directory Here");
		Directory7.setBounds(268, 87, 140, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory7);
		Directory7.setColumns(10);
		Directory7.addActionListener(handler);
		
		Directory8 = new JTextField();
		Directory8.setForeground(Color.BLUE);
		Directory8.setBackground(Color.WHITE);
		Directory8.setText("Place Directory Here");
		Directory8.setBounds(268, 122, 140, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory8);
		Directory8.setColumns(10);
		Directory8.addActionListener(handler);
		
		Directory9 = new JTextField();
		Directory9.setForeground(Color.BLUE);
		Directory9.setBackground(Color.WHITE);
		Directory9.setText("Place Directory Here");
		Directory9.setBounds(268, 157, 140, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory9);
		Directory9.setColumns(10);
		Directory9.addActionListener(handler);
		
		Directory10 = new JTextField();
		Directory10.setForeground(Color.BLUE);
		Directory10.setBackground(Color.WHITE);
		Directory10.setText("Place Directory Here");
		Directory10.setBounds(268, 192, 140, 22);
		DirectoryWatcherFrame.getContentPane().add(Directory10);
		Directory10.setColumns(10);
		Directory10.addActionListener(handler);
		
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
		DirectoryWatcherFrame.getContentPane().add(btnClickForHelp);
		
		String[] recursive = new String[]{"Recursive?","Yes","No"};
		RecursiveOrNotSelection = new JComboBox(recursive);
		RecursiveOrNotSelection.setToolTipText("Recursive Search?");
		RecursiveOrNotSelection.setBounds(156, 146, 100, 33);
		DirectoryWatcherFrame.getContentPane().add(RecursiveOrNotSelection);
		
		
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
				if(((String)RecursiveOrNotSelection.getSelectedItem()).equals("Recursive?") || ((String)RecursiveOrNotSelection.getSelectedItem()).equals("No")) {
					wantsRecursive=false;
				}
				else {
					wantsRecursive=true;
				}
				DirectoryValidator.validate(p);
				new ConfigFileStreamer(p,wantsRecursive);
				JOptionPane.showMessageDialog(null, "Directory Registered Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
			} 
			catch(DirectoryNotFoundException e) {
				e.getExceptionPopUp();
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Something has gone wrong", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
}
