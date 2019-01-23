package UI;

import javafx.scene.image.Image ;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Player extends Pane{
	//set up image and image view
	private Image image;
	private ImageView player;

	private int xCoord;
	private int yCoord;
	
	//the maximum stats we want to work with are 10
	private Stats[] stats = new Stats[10];
	
	public Player(String file) {
		image = new Image(file);
		player = new ImageView(image);
		player.setImage(image);
		player.setFitWidth(70);
		player.setFitHeight(70);
		setStats();
		
	}
	
	//place the player at coordinates
	public void placeplayer() {
		xCoord = 0;
		yCoord = 0;
		player.setX(0);
		player.setY(0);
		getChildren().add(player);
	}
	public void moveLeft() {

	}
	public void moveRight() {
		
	}
	public void moveUp() {
		
	}
	public void moveDown() {
		
	}
	private void setStats() {
		stats[0] = new Stats("Heart", 100);
		stats[1] = new Stats("Strength", 1);
		stats[2] = new Stats("Defense", 1);
		stats[3] = new Stats("Magic", 1);
		stats[4] = new Stats("Luck", 0);
		stats[5] = new Stats("Evade", 0);
		stats[6] = new Stats("Accuracy", 0);
		stats[7] = new Stats("Money", 0);
		stats[8] = new Stats("", 0);
		stats[9] = new Stats("Experience", 0);
	}

}
