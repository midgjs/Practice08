package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String friends;
        String[] iArray;
        Friend[] fArray = new Friend[3];
        System.out.println("친구를 3명 등록해 주세요");

        for(int i=0; i<fArray.length; i++) {
        	friends = sc.nextLine();
        	iArray = friends.split(" ");
        	fArray[i] = new Friend(iArray[0], iArray[1], iArray[2]);
        }
        
        for(int i=0; i<fArray.length; i++) {
        	fArray[i].showInfo();
        }
        
        
        
        
        
        sc.close();
    }

}
