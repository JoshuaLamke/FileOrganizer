package file_organizer_gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class ExtensionSettingsGui {

	private JFrame frame;
	private JTextField wordDocButton;
	private JTextField pdfButton;
	private JTextField textFileButton;
	private JTextField powerPointButton;
	private JTextField imageButton;
	private JTextField excelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	public ExtensionSettingsGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		wordDocButton = new JTextField();
		wordDocButton.setText("Word Document");
		wordDocButton.setBounds(56, 48, 136, 22);
		frame.getContentPane().add(wordDocButton);
		wordDocButton.setColumns(10);
		
		pdfButton = new JTextField();
		pdfButton.setText("PDF File");
		pdfButton.setBounds(56, 83, 136, 22);
		frame.getContentPane().add(pdfButton);
		pdfButton.setColumns(10);
		
		textFileButton = new JTextField();
		textFileButton.setText("Text File");
		textFileButton.setBounds(56, 118, 136, 22);
		frame.getContentPane().add(textFileButton);
		textFileButton.setColumns(10);
		
		powerPointButton = new JTextField();
		powerPointButton.setText("Powerpoint");
		powerPointButton.setBounds(56, 154, 136, 22);
		frame.getContentPane().add(powerPointButton);
		powerPointButton.setColumns(10);
		
		imageButton = new JTextField();
		imageButton.setText("JPeg,GIF,PNG(Image)");
		imageButton.setBounds(244, 48, 136, 22);
		frame.getContentPane().add(imageButton);
		imageButton.setColumns(10);
		
		excelButton = new JTextField();
		excelButton.setText("Excel File");
		excelButton.setBounds(244, 83, 136, 22);
		frame.getContentPane().add(excelButton);
		excelButton.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(53, 153, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblInputWhereCertain = new JLabel("Input Where Certain file types should Go");
		lblInputWhereCertain.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInputWhereCertain.setBounds(68, 19, 301, 16);
		frame.getContentPane().add(lblInputWhereCertain);
	}	
	private class ConfigFileEditor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
}
