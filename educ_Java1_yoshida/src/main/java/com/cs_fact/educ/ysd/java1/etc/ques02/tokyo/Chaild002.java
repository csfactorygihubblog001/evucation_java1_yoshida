package com.cs_fact.educ.ysd.java1.etc.ques02.tokyo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Chaild002  extends AbstractParent{

	@Override
	public void execute(String a) {
		try {
			File file = new File("d:\\child02.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			FileOutputStream ofs = new FileOutputStream(file);
			bw.write(a + "\r\n");
			bw.flush();bw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
