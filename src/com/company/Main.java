
//Suman Poudel
//Character counting in a string

package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
            public static void main(String[] args){
                Scanner input=new Scanner(System.in);
                System.out.print("Enter the String : ");
                String charc=input.nextLine().toUpperCase();
                long startTime=System.nanoTime();
                int len=charc.length();
                char[] Arr=charc.toCharArray();
                HashMap<Character,Integer>word =new HashMap<>();
                for(int i=0;i<len;i++){
                    if(word.containsKey(Arr[i]))
                        word.put(Arr[i],word.get(Arr[i])+1);
                    else
                        word.put(Arr[i],1);
                }
                for (Map.Entry<Character, Integer> set : word.entrySet()) {
                    System.out.println(set.getKey() + " : " + set.getValue());
                }

                long endTime=System.nanoTime();
                long timeTaken=endTime-startTime;

                System.out.println("Time Taken : "+(timeTaken)+ " ns.");
            }
        }


