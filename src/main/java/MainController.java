import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class MainController {
    @FXML
    WebView htmlPreview;
    @FXML
    TextArea textArea;
    @FXML
    Button loadHTML;
    @FXML
    Button saveHTML;
    @FXML
    Button tagsButton;
    @FXML
    Button colorsButton;

    @SneakyThrows
    public void loadFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File chosen = fileChooser.showOpenDialog(new Stage());
        try {
            String text = new String(Files.readAllBytes(chosen.toPath()));
            textArea.setText(text);
            htmlPreview.getEngine().loadContent(text);
        } catch (NullPointerException ignored){
            // if (chosen == null), no reaction
        }
    }

    public void saveFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", ".html", ".txt"));
        fileChooser.setInitialFileName("untitled.html");
        File toSave = fileChooser.showSaveDialog(new Stage());
        try {
            PrintWriter writer = new PrintWriter(toSave);
            writer.println(textArea.getText());
            writer.close();
        }
         catch (FileNotFoundException | NullPointerException ignored) {
            // if (toSave == null), no reaction
        }
    }

    public void getTagsList() {
        Stage tags = new Stage();
        FXMLLoader loader = new FXMLLoader(MainController.class.getResource("/tagsWindow.fxml"));
        try {
            Parent root = loader.load();
            Scene aboutScene = new Scene(root);
            tags.setScene(aboutScene);
            tags.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void getColorsList() {
        Stage colors = new Stage();
        FXMLLoader loader = new FXMLLoader(MainController.class.getResource("/colorsWindow.fxml"));
        try {
            Parent root = loader.load();
            Scene aboutScene = new Scene(root);
            colors.setScene(aboutScene);
            colors.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void aboutWindow() {
        Stage about = new Stage();
        FXMLLoader loader = new FXMLLoader(MainController.class.getResource("/aboutWindow.fxml"));
        try {
            Parent root = loader.load();
            Scene aboutScene = new Scene(root);
            about.setScene(aboutScene);
            about.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadContext() {
        htmlPreview.getEngine().loadContent(textArea.getText());
    }

    public void clearFields() {
        textArea.setText("");
        htmlPreview.getEngine().loadContent("");
    }
}
