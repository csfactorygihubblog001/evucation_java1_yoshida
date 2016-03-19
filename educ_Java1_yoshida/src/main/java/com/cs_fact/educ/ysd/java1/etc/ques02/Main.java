package com.cs_fact.educ.ysd.java1.etc.ques02;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("aaaaa");
		list.add("cccc");
		list.add("aaaaa");
		list.add("dddddd");


		AbstractParent a = AbstractParent.getChild(args[0]);
		a.executeLoop(list);
	}

}
