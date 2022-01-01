import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/mainWindow.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("HTML - TYPER");
        stage.setMaxHeight(800);
        stage.setMinHeight(400);
        stage.setMaxWidth(1200);
        stage.setMinWidth(400);

        stage.setScene(scene);
        stage.show();
    }
}
