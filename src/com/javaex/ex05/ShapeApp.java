package com.javaex.ex05;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
        List<Shape> sList = new ArrayList<Shape>(); 
        
        Shape rTan01 = new Rectangle(5,6);
        Shape rTria01 = new RectTriangle(6,2);

        sList.add(rTan01);
        sList.add(rTria01);
        
        for(int i=0; i<sList.size(); i++) {
        	//System.out.println("넓이: "+sList.get(i).getArea() + "  둘레:" + sList.get(i).getPerimeter());
        	
        	System.out.println("area:" +sList.get(i).getArea());
        	System.out.println("perimeter: " + sList.get(i).getPerimeter());
        	
        	if(sList.get(i) instanceof Resizeable) {
        		((Resizeable)sList.get(i)).resize(0.5);
        		
            	System.out.println("new area:" +sList.get(i).getArea());
            	System.out.println("new perimeter: " + sList.get(i).getPerimeter());
        		
        		
        	}
        	
        }


        
    }
}
