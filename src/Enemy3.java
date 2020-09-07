import processing.core.PApplet;
import processing.core.PImage;

public class Enemy3 extends Enemy{

	private PImage enemie3;
	
	
	public Enemy3 (int poseX, int poseY, int matX, int matY, PApplet app) {
		super(poseX, poseY, matX, matY, app);
		speed = 60;
		
	}
	
	public void paint() {
		enemie3 = app.loadImage("./data/enemie3.png");
		app.image(enemie3,poseX,poseY);
	}

}
