import processing.core.PApplet;

public class Character extends PApplet{
	float poschX;
	float poschY;
	float speed;
	float dirX;
	float dirY;
	int atack;
	boolean eat;

	public Character( boolean atack, boolean eat, float poschX, float poschY) {
		this.poschX = poschX;
		this.poschY = poschY;
		this.speed = 10;
		this.atack = 100;
		this.dirX = 1;
		this.dirY = 1;
		this.eat = eat;

	}

}
