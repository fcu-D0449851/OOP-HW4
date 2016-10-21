package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordEncorder A = new PasswordEncorder();
		String password;
		int i=0;
        Scanner scan = new Scanner(System.in); 
        
        while(i==0){
        System.out.println("輸入要轉換的字串:");
        password = scan.next();
		
        if(password=="exit")
        	i=1;
        A.encode(password);
		A.showpassword();
        }
	}
}
