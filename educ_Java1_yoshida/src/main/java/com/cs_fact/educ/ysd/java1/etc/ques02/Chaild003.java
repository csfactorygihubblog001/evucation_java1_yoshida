package com.cs_fact.educ.ysd.java1.etc.ques02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Chaild003  extends AbstractParent{

	@Override
	public void execute(String a) {
		try {
			File file = new File("d:\\child03.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
			bw.write(a + "\r\n");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
