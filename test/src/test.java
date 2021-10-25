import java.util.*;
import java.util.Map;
public class test {
public static void main(String[] args){
    Scanner us=new Scanner(System.in);
    System.out.println("Enter the String for character count: ");
    String str=us.nextLine().toLowerCase();
    long startTime=System.nanoTime();
    int len=str.length();
    char[] Arr=str.toCharArray();
    HashMap<Character,Integer>dict=new HashMap<>();
    for(int i=0;i<len;i++){
        if(dict.containsKey(Arr[i]))
            dict.put(Arr[i],dict.get(Arr[i])+1);
        else
            dict.put(Arr[i],1);
    }
    for (Map.Entry<Character, Integer> set : dict.entrySet()) {
        System.out.println(set.getKey() + " : " + set.getValue());
    }
    long endTime=System.nanoTime();
    long timeTaken=endTime-startTime;
    System.out.println("Time Taken in nanosecond: "+(timeTaken)+ " ns.");
    }
}
    
    

