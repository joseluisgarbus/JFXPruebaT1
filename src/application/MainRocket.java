package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;


/**
 * 
 * @author joselu
 * version 1.01
 * 
 * Antes de comenzar a programar sobre el proyecto tendremos que:
 * Descargar y añadir mediante build path jfoenix
 * Descargar SceneBuilder 
 * 
 * Ambos, tanto jfoenix, scenebuilder y JAVA, tienen que estar en la misma version, 
 * en mi caso, utilizo en este proyecto jfoenix8, scenebuilder8 y java8. 
 * Todo ello para un buen funcioamiento de la herramienta JFoenix
 */
public class MainRocket extends Application {


	@FXML
	AnchorPane myPane;
	
	/**
	 * habra que añadir todas las ventanas a la misma altura del proyecto, dentro de applicacion
	 * cargamos la pantalla principal de la aplicacion nombrando la ventana principal
	 */
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("mars.fxml"));
		
		
		try {
			myPane = (AnchorPane) loader.load();
			Scene scene = new Scene(myPane);
			primaryStage.setScene(scene);
	        primaryStage.setTitle("Joselu JavaFx");
	        Font.loadFont(getClass().getResourceAsStream("PoiretOne-Regular.ttf"), 20);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}