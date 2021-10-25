
import java.io.*;
import java.util.*;
class Assignment{
	static void Count(String inputString)
	{
		long start = System.nanoTime(); 
		HashMap<Character, Integer> charCountMap
			= new HashMap<Character, Integer>();

		char[] strArray = inputString.toCharArray();

		
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {

				
				charCountMap.put(c, charCountMap.get(c) + 1);
			}
			else {

				
				charCountMap.put(c, 1);
			}
		}

		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		long end = System.nanoTime(); 
		System.out.println(end-start); 
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in); 
		String userinput = sc.nextLine(); 
		Count(userinput);
		
	}
}
