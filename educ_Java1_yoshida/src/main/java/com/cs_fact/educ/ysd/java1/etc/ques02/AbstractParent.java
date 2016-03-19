package com.cs_fact.educ.ysd.java1.etc.ques02;

import java.util.List;

public abstract  class AbstractParent {

	public static AbstractParent getChild(String flg){
		if(flg.equals("1")){
			return new Chaild001();
		}else if(flg.equals("2")){
			return new Chaild002();
		}else if(flg.equals("3")){
			return new Chaild003();
		}
		return null;
	}


	public void executeLoop(List<String> list ){
		for( String str : list){
			execute(str);
		}
	}


	public abstract void execute(String a);
}
