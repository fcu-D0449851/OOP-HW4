package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NissanTiida A = new NissanTiida();
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("��J����:");
		num = scan.nextInt();
		for(int i=0;i<num;i++)
		{
			A.tiida();
	        System.out.printf("\n");
		}
	}
}
