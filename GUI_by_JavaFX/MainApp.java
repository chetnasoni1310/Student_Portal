package Grading_System.GUI_by_JavaFX;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class MainApp {
    private SceneController controller;

    public MainApp(SceneController controller) {
        this.controller = controller;
    }

    public StackPane createWelcomeScene() {
        Label label = new Label("Welcome to Student Portal!");
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // When the label is clicked, navigate to the Main Menu
        label.setOnMouseClicked(event -> controller.showMainMenu());

        return root;
    }
}
