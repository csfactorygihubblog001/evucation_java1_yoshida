package com.cs_fact.educ.ysd.java1.etc.ques;

import java.text.DecimalFormat;

public class SetterGetter2 {

	public String namae;
public String nenrei;
//	public int nenrei;
	public String heyabangou;
	


	public void print(){
		StringBuilder sb = new StringBuilder()
					.append("名前=>" + namae + ":   ")
					.append("年齢=>" + nenrei + ":   ")
					.append("部屋番号=>" + heyabangou + ":   ");
		System.out.println(sb.toString());
	}

}
