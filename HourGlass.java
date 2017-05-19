/**
 * 
 */

/**
 * @author kazandra
 *
 */

//If you have any questions about my work or if something is not working
//please contact me at: kzelaya20@cmc.edu

public class HourGlass {

	public static void main(String[] args) {
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
		
		//This is the top of the hourglass
		for(int i = 8; i >= 2; i-=2){
			for(int k = 1; k < (6 - i/2); k++){
				System.out.print(" ");
			}
			System.out.print("\\");
			for(int j = 1; j <= i; j++){
			System.out.print(":");
			}
		System.out.println("/");
		}
		
		
		
		
		//This is the awkward || in the center
		System.out.println("     " + "||");
		
		
		
		//This is the bottom of the hour glass, I simply reversed the logic from the top
		for(int i = 2; i <= 8; i+=2){
			for(int k = 1; k < (6 - i/2); k++){
				System.out.print(" ");
			}
			System.out.print("/");
			for(int j = 1; j <= i; j++){
			System.out.print(":");
			}
		System.out.println("\\");
		}
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");

	}

}
