import javafx.event.ActionEvent;

import java.awt.*;
import java.net.URL;

public class AboutController {

    public void openLink(ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/lemandog/HTML-TYPER/releases").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
