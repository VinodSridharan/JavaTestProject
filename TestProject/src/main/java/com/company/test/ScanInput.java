package com.company.test;

import java.util.Scanner; 

class ScanInput {
	
    public static void main(String[] args) {
    	
        System.out.println("HelloWorld");

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number ");

        int n = reader.nextInt();
        System.out.println("You entered " + n);
        
        reader.close();

    }
}