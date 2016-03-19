package com.cs_fact.educ.ysd.java1.etc.ques;

public class Quest01Yoshsida {

	
	public static void main(String[] args) {
		SetterGetter1 b = new SetterGetter1();
		b.setNamae("吉田");
		b.setNenrei(8);
		if(args[0].length() == 1)
		b.setHeyabangou("4");
		
		b.print();
		SetterGetter2 c2 = new SetterGetter2();
		c2.namae = "吉田";
		c2.nenrei = 3;

	}

}
