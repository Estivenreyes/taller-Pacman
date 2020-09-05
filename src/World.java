import processing.core.PApplet;

public class World {
	
	private PApplet app;

	public World (PApplet app) {
		this.app = app;

	}
	
	
	int[][] matrix;
	int col,row;
	int posX, posY;
	int matX, matY;
	
	public void drawMatrix() {
		col     = 9;
		row     = 6;
		posX = 0;
		posY = 0;
		matX = 1;
		matY = 1;
	    matrix  = new int [][]{
	    	{1,1,1,1,1,1,1,1,1},
			{1,0,0,2,2,2,0,0,0},
			{1,0,0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0,0,0},
		};
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if(matrix[j][i] == 0) {
					app.fill(255);
				}else if (matrix[j][i] == 1) {
					app.fill(0);
				}else {
					app.fill(255,0,0);
				}
				app.rect((i*40),(j*40),40,40);
			}
		}
		
	}

}
