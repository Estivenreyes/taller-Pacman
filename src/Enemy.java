import processing.core.PApplet;

public class Enemy {
	protected int poseX;
	protected int poseY;
	protected int speed;
	protected int matX;
	protected int matY;
	
	protected PApplet app;

	public Enemy(int poseX, int poseY, int matX, int matY, PApplet app) {
		this.app = app;
		this.poseX = poseX;
		this.poseY = poseY;
		this.matX = matX;
		this.matY = matY;
		
	}
	
	public void move (int[][] matrix) {
		if(app.frameCount%speed == 0) {
			int dir = (int) app.random(4);
			switch (dir) {
			case 0:
				if( matX < 8 && (matrix[matY][matX+1] == 0 || matrix[matY][matX+1] == 1)) {
					poseX += 100;
					matX++;
				}
			
			break;
			
			case 1:
				if(matX > 0 && (matrix[matY][matX-1] == 0 || matrix[matY][matX-1] == 1)) {
					poseX -=100;
					matX--;
				}
			break;
			
			case 2:
				if(matY > 0 && (matrix[matY-1][matX]== 0 || matrix[matY-1][matX]== 1) ) {
					poseY -=100;
					matY--;
				}
			break;
				
			case 3:
				if(matY < 6 && (matrix[matY+1][matX]==0 || matrix[matY+1][matX]==1)) {
					poseY +=100;
					matY++;
				}
				
			break;
			}
		}
	}

	public void paint() {
		
		
	}

}
