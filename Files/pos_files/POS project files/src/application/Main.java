package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("SalesScreen.fxml"));
			Scene scene = new Scene(root,1280,760);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("category_list.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("category_name.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("centertab.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("hamburger.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("itemlist.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("product.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("sales_table.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("SalesScreen.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
