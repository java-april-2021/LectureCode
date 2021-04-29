package recursion;

public class Recursion {
	public static void main(String[] args) {
		int[][] arr = new int[10][20];
		System.out.println(countdown(3));
	}
	
	public static String countdown(int num) {
		if(num == 0) {
			return "we made it!!";
		}
		
		System.out.println("we are on num " + num);
		return countdown(num - 1);
	}
}
