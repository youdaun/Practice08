package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Friend[] friend = new Friend[3];
		
		System.out.println("친구를 3명 등록해 주세요");
		for(int i=0; i<friend.length; i++) {
			String info = sc.nextLine();
			String[] fArray = info.split(" ");
			Friend f = new Friend(fArray[0], fArray[1], fArray[2]);
			friend[i] = f;
		}
		
		for(int i=0; i<friend.length; i++) {
			friend[i].showInfo();
		}

		
		sc.close();

	}

}
