import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;

/*

Mark Ashinhust

Displays a menu of choices to a user and performs the chosen task. It will keep asking a user to enter the next choice until the choice of 'Q' (Quit) is entered

*/

public class Main extends Application
{

        private TabPane tabPane;
        private DisplayPane displayPane; //create displayPane method
        private AddPane addPane; // create pane to add patients

        public void start(Stage stage){
        
            //main frame
            StackPane root = new StackPane();
            
            //create tabPane to add tabs
            tabPane = new TabPane();

            //create Display Pane w/ information
            displayPane = new DisplayPane();
            
            //create Display Pane w/ information
            addPane = new AddPane();

            //change and implement tabPane
            Tab displayTab = new Tab();
            displayTab.setText("Patient/Doctor Information");
            
            
            Tab addTab = new Tab();
            addTab.setText("Add Patient");
            
            //add tabPane to selectionModel
            tabPane.getSelectionModel().select(0);
            tabPane.getTabs().addAll(displayTab, addTab);
            
            //add to root
            root.getChildren().add(tabPane);
            
            //set scene and add root
            Scene scene = new Scene(root, 1280, 720);
            stage.setTitle("Doctor/Patient Assignment");
            stage.setScene(scene);
            stage.show();

        }
        
        public static void main(String[] args)
        {
            
            launch(args);
            
        }
        
    }