import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainMenuExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create menu bar and menus
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");
        
        // Create menu items for file menu
        MenuItem newFileItem = new MenuItem("New");
        MenuItem openFileItem = new MenuItem("Open");
        MenuItem saveFileItem = new MenuItem("Save");
        MenuItem exitFileItem = new MenuItem("Exit");
        fileMenu.getItems().addAll(newFileItem, openFileItem, saveFileItem, exitFileItem);
        
        // Create menu items for edit menu
        MenuItem cutEditItem = new MenuItem("Cut");
        MenuItem copyEditItem = new MenuItem("Copy");
        MenuItem pasteEditItem = new MenuItem("Paste");
        editMenu.getItems().addAll(cutEditItem, copyEditItem, pasteEditItem);
        
        // Create menu items for help menu
        MenuItem aboutHelpItem = new MenuItem("About");
        helpMenu.getItems().addAll(aboutHelpItem);
        
        // Add menus to menu bar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
        
        // Create border pane with menu bar
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        
        // Create scene with border pane
        Scene scene = new Scene(borderPane, 400, 300);
        
        // Set the scene on the stage and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("Main Menu");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
