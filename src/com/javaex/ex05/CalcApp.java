package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	Add add = new Add();
    	Div div = new Div();
    	Mul mul = new Mul();
    	Sub sub = new Sub();
    	
    	boolean exit = true;
    	
    	while(exit) {
    		System.out.print(">> ");
    		String num = sc.nextLine();
    		
    		if(num.equals("/q")) {
    			System.out.println("종료합니다.");
    			exit = false;
    		}
    		else {
    			String[] sArray = num.split(" ");
        		int a = Integer.parseInt(sArray[0]);
        		int b = Integer.parseInt(sArray[2]);
        		
        		switch(sArray[1]) {
        		case "+":
        			add.setValue(a, b);
        			System.out.println(add.calculate());
        			break;
        		case "-":
        			sub.setValue(a, b);
        			System.out.println(sub.calculate());
        			break;
        		case "*":
        			mul.setValue(a, b);
        			System.out.println(mul.calculate());
        			break;
        		case "/":
        			div.setValue(a, b);
        			System.out.println(div.calculate());
        			break;
        		default:
        			System.out.println("알 수 없는 연산입니다.");
        			break;
        		}
    		}
    		
    	}
    	sc.close();
    }
}
