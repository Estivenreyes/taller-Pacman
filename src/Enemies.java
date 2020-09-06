import processing.core.PApplet;

public class Enemies {
	float poseX;
	float poseY;
	float speed;
	float dirX;
	float dirY;
	int kill;
	
	private PApplet app;

	public Enemies(PApplet app, float poseX, float poseY, float speed, float dirX, float dirY, int kill) {
		this.app = app;
		this.poseX = poseX;
		this.poseY = poseY;
		this.dirX = dirX;
		this.dirY = dirY;
		this.speed = 5;
		this.kill = 100;
	}

}
