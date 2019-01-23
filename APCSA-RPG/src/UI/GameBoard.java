package UI;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;


public class GameBoard extends Pane{
	//create the number of boxes with height and width variables
	private int width = 10;
	private int height = 10;
	private int sides = 8;
	
	//set up a 2D array to store the rooms
	private Rectangle[][] board;
	
	//set up array to hold lines
	private Line[] lines;
	
	//constructor to set up the board.
	public GameBoard() {
		//declare a new board
		board = new Rectangle[width][height];
		
		//Initialize the board by looping through each array item
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				board[i][j] = new Rectangle();
				board[i][j].setWidth(70);
				board[i][j].setHeight(70);						
				board[i][j].setStroke(Color.RED);
				board[i][j].setStrokeType(StrokeType.CENTERED);
				board[i][j].setStrokeWidth(1);	
				board[i][j].setFill(Color.BLACK);
				//set the coordinates
				board[i][j].setX(i * 70);
				board[i][j].setY(j * 70);
				
			}
		}
		//Declare new gridlines
		lines = new Line[sides];

		int x = 0;
		int y = 0;
		
		for(int i = 0; i < 4; i++) {
			lines[i] = new Line();
			lines[i].setStartX(x);
			lines[i].setStartY(0);
			lines[i].setEndX(x);
			lines[i].setEndY(630);
			lines[i].setStrokeWidth(2);
			lines[i].setStroke(Color.WHITE);
			x += 210;
		}
		for(int i = 4; i < 8; i++) {
			lines[i] = new Line();
			lines[i].setStartX(0);
			lines[i].setStartY(y);
			lines[i].setEndX(630);
			lines[i].setEndY(y);
			lines[i].setStrokeWidth(2);
			lines[i].setStroke(Color.WHITE);
			y += 210;
		}		
	}
	public void placeboard(final int i, final int j){
	    getChildren().add(board[i][j]);

	}
	public void placeline(final int k) {
	    getChildren().add(lines[k]);		
	}
}
