package com.cs_fact.educ.ysd.java1.etc.ques;

import java.text.DecimalFormat;

public class SetterGetter1 {

	private String namae;
	private String nenrei;
//	private int nenrei;
	private String heyabangou;
	
	public String getNamae() {
		return namae;
	}
	public void setNamae(String namae) {
		this.namae = namae;
	}
	public int getNenrei() {
		return Integer.parseInt(nenrei);
//		return nenrei;
	}
	public void setNenrei(int nenrei) {
		this.nenrei = new DecimalFormat("000").format(nenrei);
//		this.nenrei = nenrei;
	}
	public String getHeyabangou() {
		return heyabangou;
	}
	public void setHeyabangou(String heyabangou) {
		this.heyabangou = heyabangou;
	}


	public void print(){
		StringBuilder sb = new StringBuilder()
					.append("名前=>" + namae + ":   ")
					.append("年齢=>" + nenrei + ":   ")
					.append("部屋番号=>" + heyabangou + ":   ");
		System.out.println(sb.toString());
	}

}
