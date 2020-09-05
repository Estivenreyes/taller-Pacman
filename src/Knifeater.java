import processing.core.PApplet;

public class Knifeater extends Character{
	
	private PApplet app;
	
	public Knifeater (PApplet app, float poschX, float poschY, float dirX, boolean atack) {
		super(atack, atack, dirX, dirX);
		this.app = app;
	}
	
	public void pintar () {
		fill(100,20,0);
		app.ellipse(poschX, poschY, 88, 88);
	}
	
	public void atack() {
		
	}

}
