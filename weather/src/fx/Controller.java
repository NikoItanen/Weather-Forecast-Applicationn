package fx;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Controller {

    @FXML
    private Label label;

    public void initialize() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime today = LocalDateTime.now();
        label.setText("Today is: " + dtf.format(today));
    }
}