package javaArray;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {

		int num[]=new int[10];
	
	   num[0]=1;
	   num[1]=2;
	   num[2]=3;
	   num[3]=4;
	   num[4]=5;
       num[5] =6;
       num[6]=7;
       num[7]=8;
       num[8]=9;
       num[9]=10;
      for(int i=0;i<=9;i++)     //even odd
      {
    	  System.out.println(num[i]);
      }  
      System.out.println("....Sorted Array....");
      System.out.println("Even no.");
      
      Arrays.sort(num);
      
      for(int i=1;i<=9;i=i+2)
      {
    	  System.out.println(num[i]);
      }
      System.out.println("Odd no.");
      for(int i=0;i<=9;i=i+2)
      {
    	  System.out.println(num[i]);
      }
      }
}