package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] sArray = numLine.split(" "); // 공백으로 단위를 나눔
		int[] nArray = new int[sArray.length]; // nArray 배열 생성
		
		for(int i=0; i<nArray.length; i++) {
			nArray[i] = Integer.parseInt(sArray[i]); // 공백으로 나눈 단위를 nArray 배열에 재배치
		}
		
		for (int i=0; i<nArray.length; i++) {
			sum += nArray[i];
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
