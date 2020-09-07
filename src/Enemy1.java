import processing.core.PApplet;
import processing.core.PImage;

public class Enemy1 extends Enemy{
	
	private PImage enemie1;
	

	public Enemy1(int poseX, int poseY, int matX, int matY, PApplet app) {
		super(poseX, poseY, matX, matY, app);
		speed = 60;
	}
	
	public void paint() {
		enemie1 = app.loadImage("./data/enemie1.png");
		app.image(enemie1,poseX,poseY);
		
	}
	



}
