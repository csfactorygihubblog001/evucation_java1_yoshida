package com.cs_fact.educ.ysd.java1.etc.ques;


public class SetterGetter1 {

	private String namae;
	private int nenrei;
	private int heyabangou;
	public String getNamae() {
		return namae;
	}
	public void setNamae(String namae) {
		this.namae = namae;
	}
	public int getNenrei() {
		return nenrei;
	}
	public void setNenrei(int nenrei) {
		this.nenrei = nenrei;
	}
	public int getHeyabangou() {
		return heyabangou;
	}
	public void setHeyabangou(int heyabangou) {
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
