package net.talaatharb.sshautomation.desktop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Desktop application Main class
 * 
 * @author mharb
 *
 */
public class SSHAutomationDesktopMain extends Application {

	@Override
	public void start(Stage stage) {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		Label l = new Label("JavaFX: " + javafxVersion + ", running on Java: "
				+ javaVersion + ".");
		Scene scene = new Scene(new StackPane(l), 640, 480);
		stage.setScene(scene);
		stage.setTitle("ssh-automation");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
