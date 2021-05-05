import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


class AssinantMouse implements EventHandler<MouseEvent> {

	@Override
	public void handle(MouseEvent m) {
		System.out.println("botão pressionado");
		
	}
	
}

public class TestWindowFx extends Application {

	@Override
	public void start(Stage stage) {
		
		BorderPane pn = new BorderPane();
		Scene scn = new Scene(pn, 600, 400);
		
		scn.getStylesheets().add
			(TestWindowFx.class.getResource("estilo.css").toExternalForm());
		
		Label lblText = new Label("Hello World");
		Button btn = new Button ("ok");
		
		AssinantMouse m = new AssinantMouse();
		
		btn.addEventFilter(MouseEvent.MOUSE_CLICKED,m);
		
		pn.setTop(lblText);
		pn.setBottom(btn);
		
		BorderPane.setAlignment(btn, Pos.CENTER);
		BorderPane.setAlignment(lblText, Pos.CENTER);
		
		
		stage.setScene(scn); 
		stage.setTitle("Teste de eventos JavaFX");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TestWindowFx.class, args);
	}

}
