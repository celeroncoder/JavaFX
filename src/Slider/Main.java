package Slider;

// TODO: change the path to the lib folder of the javafx library moved to ~/java/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Slider");
            stage.show();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
