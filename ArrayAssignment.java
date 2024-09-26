package com.demo;
import java.util.Arrays;

public class ArrayAssg {

	public static void main(String[] args) {
		
int [] numericArray = {1, 4, 7, 3, 2, 5, 7 ,8};
Arrays.sort(numericArray);		
for (int i=0; i<numericArray.length; i++) {
	
	
	System.out.println(numericArray[i]);
}
int largestNumber = 0;
int secondlargestNumber = 0;
for(int i = 0; i < numericArray.length; i++){
 if(largestNumber < numericArray[i]){
	   secondlargestNumber = largestNumber;
	   largestNumber = numericArray[i];
 }else if(secondlargestNumber < numericArray[i]){
	   secondlargestNumber = numericArray[i];
 } 
}
System.out.println("two largest numbers are : First -  " 
   +largestNumber + " Second " + secondlargestNumber);

	}
}
