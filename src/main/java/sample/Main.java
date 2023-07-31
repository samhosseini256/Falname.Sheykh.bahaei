package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        GridPane pane = fxmlLoader.load();
        Scene scene = new Scene(pane);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setHeight(768);
        primaryStage.setWidth(1024);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
