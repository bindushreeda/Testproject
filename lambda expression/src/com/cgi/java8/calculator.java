package com.cgi.java8;


interface MyInterface
{
	public int incrementByFive(int a);
}
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface m=(a)->{
			int b=a+5;
			int c=0;
			for(int i=0; i<=4;i++)
			{
				c=a++;
			}
			return c;
		 
		};
		System.out.println(m.incrementByFive(0));

	}

}


