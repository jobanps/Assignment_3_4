import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment_3_4 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Define UI Control Elements
		
		
		//Defining Layout Manager
		VBox root = new VBox();
		
		//adding UI Control Elements inside Layout Manager
		
		
		//Creating new Scene
		Scene scene = new Scene(root, 400,600);
		// Setting Scene inside Stage
		primaryStage.setScene(scene);
	}
	
	
	


}
