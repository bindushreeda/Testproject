package com.cgi.lambdaexpression;

interface MyFunction
{
	public String printCompanyName();

	
}
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction m=()->{
		 return "CGI";
		};
System.out.println(m.printCompanyName());
	}

	}


