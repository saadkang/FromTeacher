package array;

import java.util.Scanner;

public class BuildArray {

	public void setArray(){
		int limit = 10;
		int[] numberList = new int[limit];
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		for(int j = 0; j < numberList.length; j++){
			numberList[j] = sc.nextInt();
		}
	}
	public void retrieveArray(int[] array){
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}
