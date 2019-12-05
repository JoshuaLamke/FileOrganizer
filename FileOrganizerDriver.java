package file_organizer_gui;

import java.awt.EventQueue;

public class FileOrganizerDriver {
	private static ConfigFileReader initializer;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExtensionSettingsGui window = new ExtensionSettingsGui();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DirectoryInputGui window = new DirectoryInputGui();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		initializer = new ConfigFileReader();
		initializer.readConfig();
		initializer.getWatcher().processEvents();
	}
}
