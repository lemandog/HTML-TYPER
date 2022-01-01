import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ColorsController {
    @FXML
    ColorPicker colorSelect;
    @FXML
    Label webCol;
    @FXML
    Label rgbCol;
    @FXML
    Label hslCol;


    public void onColorSelected() {
        Color selected = colorSelect.getValue();
        webCol.setText(selected.toString());
        rgbCol.setText(selected.getRed() + " " + selected.getBlue() + " " + selected.getGreen());
        hslCol.setText(selected.getHue() + " " + selected.getSaturation() + " " + selected.getBrightness());
    }

    public void copyWeb() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(webCol.getText()), null);
    }

    public void copyRGB() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(rgbCol.getText()), null);
    }

    public void copyHSL() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(hslCol.getText()), null);
    }
}
