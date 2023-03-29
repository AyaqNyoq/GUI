import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.prefs.Preferences;

public class OptionGUI extends Application {

    private CheckBox option1;
    private CheckBox option2;

    @Override
    public void start(Stage stage) {
        // Load the saved preferences
        Preferences prefs = Preferences.userNodeForPackage(getClass());
        boolean option1Selected = prefs.getBoolean("option1Selected", false);
        boolean option2Selected = prefs.getBoolean("option2Selected", false);

        // Create the checkboxes and set their initial state based on the saved preferences
        option1 = new CheckBox("Option 1");
        option1.setSelected(option1Selected);
        option1.setOnAction(event -> {
            // Save the selected state of Option 1
            prefs.putBoolean("option1Selected", option1.isSelected());
        });

        option2 = new CheckBox("Option 2");
        option2.setSelected(option2Selected);
        option2.setOnAction(event -> {
            // Save the selected state of Option 2
            prefs.putBoolean("option2Selected", option2.isSelected());
        });

        // Create a label to display the selected option
        Label selectedOptionLabel = new Label();
        if (option1Selected) {
            selectedOptionLabel.setText("Option 1 selected");
        } else if (option2Selected) {
            selectedOptionLabel.setText("Option 2 selected");
        } else {
            selectedOptionLabel.setText("No option selected");
        }

        // Create a VBox to hold the checkboxes and label
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(10);
        vbox.getChildren().addAll(option1, option2, selectedOptionLabel);

        // Create the scene and show the stage
        Scene scene = new Scene(vbox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
