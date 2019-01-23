package UI;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
    	try {
    		GameBoard board = new GameBoard();
    		GridPane root = new GridPane();
            Scene scene = new Scene(root, 630, 630); 
            
            //for each player add image file
            Player player = new Player("/imgFiles/Celeste_character_Badeline.png");
            
            //load the grid
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    board.placeboard(i, j);
                }
            }

            //load the lines
            for(int i = 0; i < 8; i++) {
            	board.placeline(i);
            }
            
            // display the game elements
            player.placeplayer();
            root.add(board, 0, 0);
            root.add(player, 0, 0);
            stage.setScene(scene);
            stage.show();    		
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    public static void main(String[] args) {
        launch(args);
    }
}
