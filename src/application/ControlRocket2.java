package application;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ControlRocket2 {

	/**
	 * 
	 * creo variable que ya esta creada en fxml fx:id botonCancelar
	 */
	@FXML
	JFXButton botonCancelar;

	/**
	 * 
	 * mensaje que deberia aparecer al inicializarse la segunda ventana
	 * habiendo pulsado en el boton Let it me!
	 */
	@FXML
	public void initialize() {
		System.out.println("segunda ventana abierta estupendamente");

	}

	/**
	 * cerrar segunda ventana dando al boton cancelar, 
	 * el boton enviar no tiene ningun tipo de accion programada
	 */
	@FXML
	public void cerrarSegundaVentana() {
		Stage thisStage = (Stage) botonCancelar.getScene().getWindow();
		thisStage.close();

	}
}
