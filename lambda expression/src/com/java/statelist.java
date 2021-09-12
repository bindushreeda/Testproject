package com.java;

import java.util.ArrayList;


public class statelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> states=new ArrayList<>();
		states.add("karnataka");
		states.add("mumbai");
		states.add("pune");
		states.add("andra pradesh");
		
		states.forEach((e)->{
			System.out.println(e+" ");});
		 
	

	}

}


