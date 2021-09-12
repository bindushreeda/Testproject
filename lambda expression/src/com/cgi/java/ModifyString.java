package com.cgi.java;
interface StringConcat
{
	public String joinString(String a, String b);
}
public class ModifyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcat s=(a,b)->{
			
			return a.concat(b);
		 
		};
		System.out.println(s.joinString("bindu","shree"));

	}

}

