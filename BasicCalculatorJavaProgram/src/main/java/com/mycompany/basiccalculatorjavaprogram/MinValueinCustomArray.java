package com.mycompany.basiccalculatorjavaprogram;

import java.util.Scanner;
public class MinValueinCustomArray
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Please enter the size of the array");
Scanner console = new Scanner(System.in);
int length = console.nextInt();
int customArray[] = new int[length];
int i;
for( i = 0; i < customArray.length;i++){
    System.out.println("Please enter the elements for the array and I will find out the minimum value");
    customArray[i] = console.nextInt();
}
for (int elements : customArray){
    System.out.println(elements);
}


int minValue = 5000;
for(int j = 0; j < customArray.length; j++){
    if(customArray[j] < minValue){
        minValue = customArray[j];
    }
}
System.out.println("The minimum Value is " + minValue);
	}
}
