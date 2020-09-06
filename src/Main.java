import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());

	}
	
	int pantalla;
	int [][] matrix;
	World  world;
	Knifeater knifeman;
	
	
	public void settings () {
		size (900,700);
	}
	
	public void setup () {
		world = new World (this);
		
		System.out.println(matrix);
		knifeman = new Knifeater (127, 23, this);
	}
	
	public void draw (){
		background (161,54,61);
		world.drawMatrix();
		knifeman.paint();
		
 	}
	
	/*public void mousePressed() {
		switch (pantalla) {
		case 0:
			
		break;
		
		case 1:
			
		break;
			
		case 2:
			
		break;
		
		case 3:
			
		break;
		
		case 4:
			
		break;
		
		}
	}*/
	int matX =1;
	int matY =1;
	
	public void keyPressed() {
		matrix = world.getMatrix();
		switch (keyCode) {
		case RIGHT:
			if(matrix[matY][matX+1] == 0 || matrix[matY][matX+1] == 1 ) {
				knifeman.move("RIGHT");
				matX++;
			}
			break;
		case LEFT:
			if(matrix[matY][matX-1] == 0 || matrix[matY][matX-1] == 1) {
				knifeman.move("LEFT");
				matX--;
			}
			break;
		case UP:
			if(matrix[matY-1][matX]== 0 || matrix[matY-1][matX]== 1 ) {
				knifeman.move("UP");
				matY--;
			}
			break;
		case DOWN:
			if(matrix[matY+1][matX]==0 || matrix[matY+1][matX]==1) {
				knifeman.move("DOWN");
				matY++;
			}
			break;
			
		default:
			break;
		}
	}
	
}

	
