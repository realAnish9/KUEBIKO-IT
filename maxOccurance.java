import java.util.*;
public class maxOccurance {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); // measuring time in nano sec
		
		//Scanner sc = new Scanner(System.in);
		
	//	System.out.println("Enter a string: ");
		
		//String input = sc.nextLine();
		
		StringBuilder sb  = new StringBuilder();
		for(int i = 0; i < 10000000; i++) {
			sb.append(i);
		}
		
//		String input = "kljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhgkljhghjhghhjhktfhgvhgvhg";
//		input = input + input + input + input;
		String input = sb.toString();
		char[]arr = input.toCharArray(); //converting the user input to array 
		
		int length = arr.length; //taking the length of the array 
		int i, j, counter;
		
		for (i = 0; i<length; i++) {
			
			
			counter = 0;
			
			
			for(j=0;j<length;j++) {
				
				// this steps basically checks if a character is checked once
				// if its checked then it will not execute again and go to the 
				// other condition
				
					if(j<i && arr[i] == arr[j]) 
					{
						break;
					}
				
					if(arr[j] == arr[i]) 
					{
						counter++;
					}
					if(j == length-1) 
					{
						System.out.println("The character "+ arr[i]+ " is repeated " + counter + " times.");
					}
					
				}
			}
		
			long end = System.currentTimeMillis();
			long difference = end - start; 
			System.out.println("TIME TO EXECUTE: ");
			System.out.println(difference/1000);

	}

}
