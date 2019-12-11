package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket {
	/**
	 * 
	 * Creo variables nombradas en fx:id en scenebuilder
	 */
	
	@FXML
	AnchorPane myPane;
	@FXML
	JFXButton Boton;
	@FXML
	ImageView imagen;
	
	@FXML
	public void initialize() {
		fadeInTransicion();
		Tooltip tooltip = new Tooltip("Ey muy buenas a todossssss!");
		Boton.setTooltip(tooltip);
	}
	
	/**
	 * 
	 * Transicion fade, para que la imagen de perfil, vaya apareciendo poco a poco en pantalla
	 */
	@FXML
	private void fadeInTransicion() {
		imagen.setVisible(true);
		/**
		 * defino segundos que va a tardar en aparecer poco a poco la imagen(7)
		 */
		FadeTransition transicion = new FadeTransition(Duration.seconds(7),imagen);
		transicion.setFromValue(0);
		transicion.setToValue(1);
		transicion.play();
	}
	
	/**
	 * 
	 * boton para cerrar app
	 */
	@FXML
	public void closeApp() {
			Stage thisStage = (Stage) Boton.getScene().getWindow();
			thisStage.close();
			OpenStage();
		}
	
	/**
	 * 
	 * abrir dando a let me it una ventana nueva
	 */
	@FXML
	public void OpenStage() {
		myPane = new AnchorPane();
		/**
		 * nombro al archivo fxml de la nueva ventana para cargarlo 
		 */
		FXMLLoader loader = new FXMLLoader(getClass().getResource("mars.fxml"));
		Stage segunda = new Stage();
		
		
		try {
			myPane = (AnchorPane) loader.load();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		segunda.setScene(new Scene(myPane));
		segunda.show();
	}
	
}