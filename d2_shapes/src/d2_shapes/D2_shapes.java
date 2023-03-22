/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2_shapes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.*;

/**
 *
 * @author HP
 */
public class D2_shapes extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      
        Line line= new Line(20,20,100,20);
        Group root = new Scene(line);
        
        Scene scene = new Scene(root 400,400);
        
       
        primaryStage.setScene(scene);
         primaryStage.setTitle("2d shapes");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
