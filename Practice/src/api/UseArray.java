package api;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numberList = new int[5];
		for (int i = 0; i < numberList.length; i++) {
			System.out.println("Please enter number");
			numberList[i] = sc.nextInt();
		}
		for(int j = 0; j < 5; j++){
		System.out.println(numberList[j]);
		}try{
			if(sc != null){
				sc.close();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
