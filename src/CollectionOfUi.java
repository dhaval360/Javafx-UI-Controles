import java.io.FileInputStream;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import views.MainViewController;

public class CollectionOfUi extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/views/mainView.fxml"));
		root = (BorderPane)loader.load();
		MainViewController controller  = loader.getController();
		Scene scene = new Scene(root,600,600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
