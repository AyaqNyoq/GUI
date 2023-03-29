import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    private ArrayList<Name> namelist = new ArrayList<Name>();
    
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 130, Color.WHITE);

        GridPane gridpane = new GridPane();

        Label label = new Label("Label");
        gridpane.add(label, 0, 0);

        TextField tf = new TextField();
        gridpane.add(tf, 1, 0);

        Button okbutton = new Button("Press Me");
        gridpane.add(okbutton, 2, 0);

        // creating an anonymous class
        // in Java, an anonymous class extends a superclass (in this case EventHandler)
        // equivalent to:
        //  class WhateverName extends EventHandler<ActionEvent> {
        //     public void handle(ActionEvent event) {...}
        // Or implement an interface
        okbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String value = tf.getText();
                String names[] = value.split(" ");
                Name name = new Name(names[0], names[1]);
                namelist.add(name);
                // add name to arraylist
                System.out.println("Hello World "+tf.getText() +" "+ name.getLname() + name.getFname());
            }
        });

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(25);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(50);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(25);
        gridpane.getColumnConstraints().addAll(col1,col2, col3);

        root.getChildren().add(gridpane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}