package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	//어려워서 코드만 받았음 나중에 다시 풀어보기
    	
    	while(true) {
    		String in = sc.nextLine();

    		if(in.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}else {
    			String[] input = in.split(" ");
            	
            	if(input[1].equals("+")) {
            		Add num = new Add();
            		num.setValue(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
            		System.out.println(num.calculate());
            		
            	}else if(input[1].equals("-")) {
            		Sub num = new Sub();
            		num.setValue(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
            		System.out.println(num.calculate());
            		
            	}else if(input[1].equals("*")) {
            		Mul num = new Mul();
            		num.setValue(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
            		System.out.println(num.calculate());
            		
            	}else if (input[1].equals("/")) {
            		Div num = new Div();
            		num.setValue(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
            		System.out.println(num.calculate());
            		
            	}else {
            		System.out.println("알 수 없는 연산입니다.");
            	}
    		}
    	}
    	sc.close();
    }
}