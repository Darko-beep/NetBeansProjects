/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two_d_shapes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.*;

/**
 *
 * @author HP
 */
public class Two_d_shapes extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      Line line = new Line
      line.setStroke(Colour.RED);
      Group group new Group(line);
      Scene scene = new Scene(root);
      primaryStage.setScene()
          primaryStage.show();ne);
       primaryStage.setTitle("2D SHAPE");
      
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
