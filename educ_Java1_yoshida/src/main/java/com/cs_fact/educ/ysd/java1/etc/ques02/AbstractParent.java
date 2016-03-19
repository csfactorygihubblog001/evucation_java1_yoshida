package com.cs_fact.educ.ysd.java1.etc.ques02;

import java.util.List;

public abstract  class AbstractParent {

	public static AbstractParent getChild(){
		return new Chaild003();
	}


	public void executeLoop(List<String> list ){
		for( String str : list){
			execute(str);
		}
	}


	public abstract void execute(String a);
}
