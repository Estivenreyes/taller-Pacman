import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());

	}
	
	int screen;
	int [][] matrix;
	World  world;
	Knifeater knifeman;
	
	PImage Screen1, Screen2, Screen3, Screen4;
	boolean paintScreen1, paintScreen2, paintScreen3, paintScreen4;
	String name;
	ArrayList<Player> players = new ArrayList<Player>();
	ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	
	
	public void settings () {
		size (900,700);
	}
	
	public void setup () {
		world = new World (this);
		
		knifeman = new Knifeater (127, 23, this);
		Screen1 = loadImage("./data/Screen1.png");
		Screen2 = loadImage("./data/Screen2.png");
		Screen3 = loadImage("./data/Screen3.png");
		System.out.println(matrix);
		name = "";
		enemies.add(new Enemy1(420,420,4,4,this));
		enemies.add(new Enemy2(711,311,3,7,this));
		enemies.add(new Enemy3(313,514,3,5,this));
		enemies.add(new Enemy4(713,514,7,5,this));
	
	}
	
	public void draw (){
		background (161,54,61);
		
		if(screen == 0) {
			image(Screen1,0,0);
		}
		
		if(screen == 1) {
			image(Screen2,0,0);
			fill (52);
			textSize(14);
			text(name, 233, 400); 
		}
		
		if(screen == 2) {
			image(Screen3,0,0);
		}
		
		if(screen == 3) {
			world.drawMatrix();
			knifeman.paint();	
			for(int i = 0; i < enemies.size(); i++) {
				enemies.get(i).paint();
				//System.out.println(enemies.get(i));
			}
		}
		
		
 	}
	
	public void mousePressed() {
		switch (screen) {
		case 0:
			if (mouseX > 702 && mouseX < 797 && mouseY > 548 && mouseY < 627) {
				screen = 1;
			}
	
		break;
		
		case 1:
			if (mouseX > 702 && mouseX < 797 && mouseY > 548 && mouseY < 627) {
				players.add(new Player(name,null));
				screen = 2;
				System.out.println(players);
			}
			
		break;
			
		case 2:
			if (mouseX > 353 && mouseX < 540 && mouseY > 549 && mouseY < 596) {
				screen = 3;
			}
		break;
		
		case 3:
			
		break;
		
		case 4:
			if (mouseX > 353 && mouseX < 540 && mouseY > 549 && mouseY < 596) {
				screen = 0;
			}
			
		break;
			
		}
	}
	int matX =1;
	int matY =0;
	
	public void keyPressed() {
		switch (screen) {
		case 1:
			if(keyCode != 8) {
				name += key;
			}else {
				name = name.substring(0, name.length() - 1);
			}
			
		break;
			
		case 3:
			matrix = world.getMatrix();
			switch (keyCode) {
			case RIGHT:
				if( matX < 8 && (matrix[matY][matX+1] == 0 || matrix[matY][matX+1] == 1)) {
					knifeman.move("RIGHT");
					matX++;
					System.out.println(matX);
				}
				break;
			case LEFT:
				if(matX > 0 && (matrix[matY][matX-1] == 0 || matrix[matY][matX-1] == 1)) {
					knifeman.move("LEFT");
					matX--;
				}
				break;
			case UP:
				if(matY > 0 && (matrix[matY-1][matX]== 0 || matrix[matY-1][matX]== 1) ) {
					knifeman.move("UP");
					matY--;
				}
				break;
			case DOWN:
				if(matY < 6 && (matrix[matY+1][matX]==0 || matrix[matY+1][matX]==1)) {
					knifeman.move("DOWN");
					matY++;
				}
				break;
				
			default:
				break;
			}
			break;
		
		}
		
	}
	
}

	
