import processing.core.PApplet;
import processing.core.PImage;

public class World {
	
	private PApplet app;
	PImage Rock, wallh, wallv;

	public World (PApplet app) {
		this.app = app;
		this.Rock = app.loadImage("./data/Rock.png");
		this.wallv = app.loadImage("./data/wallh.png");
		this.wallh = app.loadImage("./data/wallv.png");
		

	}
	
	
	int[][] matrix;
	int col,row;
	int posX, posY;
	int matX, matY;
	
	public void drawMatrix() {
		col     = 9;
		row     = 7;
		posX = 0;
		posY = 0;
		matX = 1;
		matY = 1;
	    matrix  = new int [][]{
	    	{2,0,0,3,5,5,0,0,2},
			{5,0,0,0,0,0,0,0,5},
			{5,0,0,4,0,4,0,0,5},
			{0,0,0,0,0,0,0,0,0},
			{2,0,0,4,0,4,0,0,2},
			{5,0,0,0,0,0,0,0,5},
			{5,0,0,3,5,5,0,0,5},
		};
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				switch (matrix[j][i]) {
				case 0:
	
				break;
				
				case 1:

				break;
				
				case 2:
					app.image(wallh, i*100, j*100);
				
				break;
				
				case 3:
					app.image(wallv, i*100, j*100);
					
				break;
				
				case 4:
					app.image(Rock, i*100, j*100);
				break;
				}
				
			}
		}
		
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	
}
