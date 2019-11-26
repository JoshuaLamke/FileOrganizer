package file_organizer_gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

public class ExtensionSettingsGui {

	protected JFrame frame;
	private JTextField wordDocButton;
	private JTextField pdfButton;
	private JTextField textFileButton;
	private JTextField powerPointButton;
	private JTextField imageButton;
	private JTextField excelButton;
	private JTextField otherFileButton;

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
		wordDocButton.addActionListener(new FileTypeSettingsListener(wordDocButton.getText()));
		
		pdfButton = new JTextField();
		pdfButton.setText("PDF File");
		pdfButton.setBounds(56, 83, 136, 22);
		frame.getContentPane().add(pdfButton);
		pdfButton.setColumns(10);
		pdfButton.addActionListener(new FileTypeSettingsListener(pdfButton.getText()));
		
		textFileButton = new JTextField();
		textFileButton.setText("Text File");
		textFileButton.setBounds(56, 118, 136, 22);
		frame.getContentPane().add(textFileButton);
		textFileButton.setColumns(10);
		textFileButton.addActionListener(new FileTypeSettingsListener(textFileButton.getText()));
		
		powerPointButton = new JTextField();
		powerPointButton.setText("Powerpoint");
		powerPointButton.setBounds(56, 154, 136, 22);
		frame.getContentPane().add(powerPointButton);
		powerPointButton.setColumns(10);
		powerPointButton.addActionListener(new FileTypeSettingsListener(powerPointButton.getText()));
		
		imageButton = new JTextField();
		imageButton.setText("JPeg,GIF,PNG(Image)");
		imageButton.setBounds(244, 48, 136, 22);
		frame.getContentPane().add(imageButton);
		imageButton.setColumns(10);
		imageButton.addActionListener(new FileTypeSettingsListener(imageButton.getText()));
		
		excelButton = new JTextField();
		excelButton.setText("Excel File");
		excelButton.setBounds(244, 83, 136, 22);
		frame.getContentPane().add(excelButton);
		excelButton.setColumns(10);
		excelButton.addActionListener(new FileTypeSettingsListener(excelButton.getText()));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(53, 153, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblInputWhereCertain = new JLabel("Input Where Certain file types should Go");
		lblInputWhereCertain.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInputWhereCertain.setBounds(68, 19, 301, 16);
		frame.getContentPane().add(lblInputWhereCertain);
		
		otherFileButton = new JTextField();
		otherFileButton.setText("Other File Types");
		otherFileButton.setBounds(244, 118, 136, 22);
		frame.getContentPane().add(otherFileButton);
		otherFileButton.setColumns(10);
		otherFileButton.addActionListener(new FileTypeSettingsListener(otherFileButton.getText()));
	}	
	private class FileTypeSettingsListener implements ActionListener{
		String fileType;
		String buttonText;
		public FileTypeSettingsListener(String buttonText){//figures out which button it is
			this.buttonText=buttonText;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			switch(buttonText) {
			case("Word Document"):
				fileType = "Word";
				break;
			case("PDF File"):
				fileType = "PDF";
				break;
			case("Text File"):
				fileType = "Text";
				break;
			case("Powerpoint"):
				fileType = "Powerpoint";
				break;
			case("JPeg,GIF,PNG(Image)"):
				fileType = "Image";
				break;
			case("Excel File"):
				fileType = "Excel";
				break;
			case("Other File Types"):
				fileType = "Other";
				break;
			}
			JTextField cast = (JTextField)e.getSource();
			Path path = Paths.get(cast.getText());
			try {
				DirectoryValidator.validate(path);
				new ConfigFileStreamer(path,fileType);
				JOptionPane.showMessageDialog(null, "Directory Registered Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
			catch(DirectoryNotFoundException f) {
			
			}
		}
	}
}
