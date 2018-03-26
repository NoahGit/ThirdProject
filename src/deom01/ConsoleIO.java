package deom01;

import java.io.Console;
import java.util.Scanner;

public class ConsoleIO {
	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner in = new Scanner(System.in);
//
//        //git first input
//        System.out.println("plase input your first name:");
//        if(in.hasNext()){
//        	String fn = in.nextLine();
//        	System.out.println(fn);
//        }
//        //git second name
//        System.out.println("please input your second name :");
//        if(in.hasNext()){
//        	String sn = in.nextLine();
//        	System.out.println(sn);
//        }
//        //git age
//        System.out.println("please input your age");
//        if(in.hasNext()){
//        	int ag =  in.nextInt();
//        	System.out.println(ag);
//        }
        
        Console cons = System.console();
        if(cons != null){
        	String userName = cons.readLine("User Name: ");
        	char[] passwd = cons.readPassword("Password:");
        	
        	//test
        	System.out.println(userName);
        	for(char c:passwd){
        		System.out.print(c);
        	}
        	//replace password arrays
        	passwd = null;
        }
	}
}
