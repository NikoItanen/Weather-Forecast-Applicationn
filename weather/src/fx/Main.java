package fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.util.Scanner;
import java.awt.*;


public class Main extends Application {

    int x = Settings.getResolutionHeight();

    @Override
    public void start(Stage firstStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        firstStage.setTitle("Weather App");
        firstStage.setScene(new Scene(root, x, y));
        firstStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



// Setting class will contain different settings.

class Settings {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    private int resolutionWidth = (int)size.getWidth();
    private int resolutionHeight = (int)size.getHeight();

    public void setResolution() {

        // Resolution will be asked in console

        Scanner sc = new Scanner(System.in);

        System.out.println("Set Width Resolution: ");
        resolutionWidth = sc.nextInt();

        System.out.println("Set Height Resolution: ");
        resolutionHeight = sc.nextInt();
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }
    public int getResolutionWidth() {
        return resolutionWidth;
    }
}

