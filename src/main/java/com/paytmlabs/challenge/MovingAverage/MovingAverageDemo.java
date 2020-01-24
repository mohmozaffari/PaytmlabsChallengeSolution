package com.paytmlabs.challenge.MovingAverage;

public class MovingAverageDemo {

	public static void main(String[] args) {

        MovingAverage movingAverage = new MovingAverageImpl(4);
        
        movingAverage.addElement(7);
        movingAverage.addElement(4);
        movingAverage.addElement(2);
        
        System.out.println(movingAverage.getAverage());

        movingAverage.addElement(1);
        movingAverage.addElement(6);

        System.out.println(movingAverage.getAverage());
        
        movingAverage.addElement(8);
        
        System.out.println(movingAverage.getAverage());
        
        movingAverage.addElement(3);
        movingAverage.addElement(5);

        System.out.println(movingAverage.getAverage());
        
        movingAverage.addElement(6);
        
        System.out.println(movingAverage.getAverage());
        
        System.out.println("List of all elements in the data structure:");
        movingAverage.getElementsInStructure().stream().forEach(System.out::println);
	}

}
