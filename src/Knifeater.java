import processing.core.PApplet;
import processing.core.PImage;

public class Knifeater {
	
	private PApplet app;
	private PImage knifeater;
	private float poschX;
	private float poschY;
	private boolean eat;
	private boolean mamadisimo;
	
	public Knifeater(float poschX, float poschY, PApplet app) {
		this.poschX = poschX;
		this.poschY = poschY;
		this.eat = false;
		this.mamadisimo = false;
		this.app = app;
		this.knifeater = app.loadImage("./data/Knifeater.png"); 

	}
	
	public void paint() {
		app.image(knifeater,poschX,poschY);
	}
	
	
	public void move (String direction) {
		switch(direction) {
		case "UP":
			poschY -= 100;
			System.out.println("funciona");
		break;
		case "DOWN":
			poschY += 100;
			System.out.println("funciona");
		break;
		case "RIGHT":
			poschX += 100;
			System.out.println("funciona");
		break;
		case "LEFT":
			poschX -= 100;
			System.out.println("funciona");
		break;
		}
	}

	public boolean isMamadisimo() {
		return mamadisimo;
	}

	public void setMamadisimo(boolean mamadisimo) {
		this.mamadisimo = mamadisimo;
	}

	public boolean isEat() {
		return eat;
	}

	public void setEat(boolean eat) {
		this.eat = eat;

	}
	
	

}
