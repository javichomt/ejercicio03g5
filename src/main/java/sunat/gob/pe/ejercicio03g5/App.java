package sunat.gob.pe.ejercicio03g5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
    	
    	Label lblUsuario = new Label("Usuario");
    	lblUsuario.setPrefWidth(90);
    	lblUsuario.setAlignment(Pos.BASELINE_CENTER);
    	TextField txtUsuario = new TextField();
    	
    	Label lblPassword = new Label("Password");
    	lblPassword.setPrefWidth(90);
    	lblPassword.setAlignment(Pos.BASELINE_CENTER);
    	PasswordField txtPassword = new PasswordField();
    	
    	Button btnLogin = new Button("Login");
    	btnLogin.setPrefSize(70, 25);
    	Button btnCancelar = new Button("Cancelar");
    	btnCancelar.setPrefSize(70, 25);
    	
    	HBox fila1 = new HBox(lblUsuario, txtUsuario);
    	HBox fila2 = new HBox(lblPassword, txtPassword);
    	HBox fila3 = new HBox(btnLogin, btnCancelar);
    	fila3.setSpacing(10);
    	fila3.setAlignment(Pos.BASELINE_CENTER);
    	
    	Insets sangriacolumnas = new Insets(30, 0, 0, 0);
    	VBox columnas = new VBox(fila1, fila2, fila3);
    	columnas.setSpacing(10);
    	columnas.setPadding(sangriacolumnas);   	
    	
    	btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				//System.out.println("Ingreso al sistema");
				Alert alerta = new Alert(AlertType.INFORMATION);
				alerta.setContentText("Ingreso al sistema");
				alerta.show();
				
			}
		});
    	
    	btnCancelar.setOnAction(new EventHandler<ActionEvent>() {
    		
    		@Override
			public void handle(ActionEvent event) {
				
    			txtUsuario.setText("");
    			txtPassword.setText("");
			}
		});
    	
    	//btnCancelar.setOnAction(p -> cancelarLogin());
      
        var scene = new Scene(columnas, 300, 150);
        stage.setScene(scene);
        stage.setTitle("Login de usuario");
        stage.setResizable(false);
        stage.setMaximized(false);
        stage.show();
    }
    
    /*private void cancelarLogin() {
    	
    }*/

    public static void main(String[] args) {
        launch();
    }

}