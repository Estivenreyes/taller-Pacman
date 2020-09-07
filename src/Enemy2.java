import processing.core.PApplet;
import processing.core.PImage;

public class Enemy2 extends Enemy{
	
	private PImage enemie2;
	
	

	public Enemy2 (int poseX, int poseY, int matX, int matY, PApplet app) {
		super(poseX, poseY, matX, matY, app);
		speed = 30;
		
	}
	
	public void paint() {
		enemie2 = app.loadImage("./data/enemie2.png");
		app.image(enemie2,poseX,poseY);
	}

}
