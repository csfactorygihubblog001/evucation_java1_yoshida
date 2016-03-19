package com.cs_fact.educ.ysd.java1.etc.ques02.fukuoka;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.cs_fact.educ.ysd.java1.etc.ques02.tokyo.AbstractParent;

public class MainAbstractTest {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("aaaaa");
		list.add("cccc");
		list.add("aaaaa");
		list.add("dddddd");


		AbstractParent a = AbstractParent.getChild(args[0]);
//		Chaild001 a = new Chaild001();
//		Chaild002 a = new Chaild002();
//		Chaild003 a = new Chaild003();
		a.executeLoop(list);
		
		
		Calendar cal = Calendar.getInstance();
//		GregorianCalendar cal = new GregorianCalendar();	
	}

}
