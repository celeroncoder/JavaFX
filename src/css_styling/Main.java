package css_styling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);

			// scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());

			// to reuse stylesheet in more than one scene
			String css = this.getClass().getResource("Main.css").toExternalForm();
			scene.getStylesheets().add(css);
			stage.setTitle("Css Styling");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
