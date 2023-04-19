package com.icraft.day8;

public class PolymoriphsmDemo1 {
	
	public void show(String fname) {
		System.out.println("String:: " + fname);
	}
	
	public void show(int age) {
		System.out.println("INT:: " + age);
	}
	
    public void show(double salary) {
    	System.out.println("Double:: " + salary);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolymoriphsmDemo1 m1 =  new PolymoriphsmDemo1();
		m1.show("JAMES");
		
	}

}
