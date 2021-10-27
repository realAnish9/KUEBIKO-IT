// Govinda KC 
import java.util.*;
public class countingStrings {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userString = input.next();
		String text = userString.toUpperCase();
		char[] charArr = text.toCharArray();
		
		int len = charArr.length;
		long startTime = System.currentTimeMillis();
		
		int i = 0, j =0;
		for( i = 0 ; i < len; i++) {
			 int count = 0;
			for(j = 0; j<len; j ++) {
				if(j<i && charArr[i] == charArr[j])
				{
					break;
				}
				if (charArr[i] == charArr[j]) {
					count += 1;
					
				}
				if(j==len -1)
				{
					System.out.println("The character "+charArr[i]+" is repeated "+ count+ " times");
				}
			}
		}
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println(" The total time taken is: " + estimatedTime + "ms");
		
	}
}
