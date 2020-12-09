package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int total = 0;
    	
    	System.out.println("상품을 입력해주세요(종료q)");
    	
    	while(true) {
	    	String product = sc.nextLine();
    		String[] gSplit = product.split(","); //,으로 배열 나누기
    		
	    	
    		//q입력시 종료
	    	if("q".equals(product)) {
		    	System.out.println("[입력완료]");
		    	System.out.println("===================");
		    	break;
	    	}
	    	
	    	//Goods의 생성자와 같이 자료형을 맞춰줘야한다. 2번째 3번째 문자열 --> 정수형 형변환
	    	Goods pro = new Goods(gSplit[0],Integer.parseInt(gSplit[1]),Integer.parseInt(gSplit[2]));
	    	
	    	gList.add(pro);	

	    }
	    	
	    // 종료 후 등록된 상품 리스트 모두 출력
	    for(int i=0; i<gList.size(); i++) {
	    	gList.get(i).showInfo();
	    	total += gList.get(i).getCount();		
	    }
	    	
	    // 등록된 상품 리스트 총 갯수 출력	    	
	    System.out.println("모든 상품의 갯수는 " + total + "개입니다.");
	    	
	    sc.close();	
    	
    
    	}

    }


