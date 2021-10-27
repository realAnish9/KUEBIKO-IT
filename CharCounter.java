import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		
		String input = sc.nextLine();
		long start = System.currentTimeMillis();
		char[] ch = new char[input.length()];
		
		for(int i=0; i< input.length(); i++) {
			
			ch[i] = input.charAt(i);
			boolean b1 = Character.isAlphabetic(ch[i]);
			if(b1) {
				ch[i] = Character.toLowerCase(ch[i]);
				
			}
		}
		
		int counter = 1;
		for(int i=0;i<input.length();i++) {
			for(int j = i+1;j<input.length();j++) {
				if(j<i && ch[i] == ch[j])
				{
					break;
				}
				if(ch[i] == ch[j]) {
					counter++;
				}
			}
			System.out.println("The character "+ ch[i] +" is repeated "+ counter + " times.");
			counter =1;
			
		}
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println("The time taken is: "+diff+" ms");
		

	}

}
