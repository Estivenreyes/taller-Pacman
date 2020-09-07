import processing.core.PApplet;
import processing.core.PImage;

public class Enemy4 extends Enemy{
	
	private PImage enemie4;
	
	
	public Enemy4 (int poseX, int poseY,  int matX, int matY, PApplet app) {
		super(poseX, poseY, matX, matY, app);
		speed = 60;
		
		
	}
	
	public void paint() {
		enemie4 = app.loadImage("./data/enemie4.png");
		app.image(enemie4,poseX,poseY);
	}

}
