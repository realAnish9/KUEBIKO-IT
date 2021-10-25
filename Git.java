import java.util.*; 
public class Git {
	public static void main(String []args)
	{
		long start = System.nanoTime();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string: "); 
		String userinput = scan.nextLine(); 
		
		char[] character_array = userinput.toCharArray();
		int length = character_array.length; 
		int i =0, j =0, counter=0; 
		for (i=0;i<length;i++)
		{
			counter =0; 
			for(j=0;j<length;j++)
			{
				//if a character is checked once, it wont do it another time. 
				if(j<i && character_array[i] == character_array[j])
				{
					break;
				}
				if(character_array[j] == character_array[i])
				{
					counter ++; 
				}
				
				if(j==length-1)
				{
					System.out.println("The character "+character_array[i]+" is repeated "+ counter+ " times");
				}
			}
			
		}
		long end = System.nanoTime(); 
		
		System.out.println(end-start); 
		
	}
}


