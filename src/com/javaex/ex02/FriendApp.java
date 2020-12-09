package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	List<Friend> fList = new ArrayList<Friend>();
    	

    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	
    	for(int i=0; i<3; i++) {
    		
    		String name = sc.next(); 
    		String hp = sc.next(); 
    		String school = sc.next(); 
    		
    		Friend fri = new Friend(name,hp,school);
    		
    		fList.add(i, fri);

    	}
    	
    	for(int i=0; i<fList.size(); i++) {
    		fList.get(i).showInfo();
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	sc.close();


    	
    	
    }

}
