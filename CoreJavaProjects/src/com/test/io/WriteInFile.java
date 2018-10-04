package com.test.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class WriteInFile {
	
	public static String fileName = "d:\\myFile.txt";
	public static void main(String[] args) {
		String content = "First Bufferred Writer program";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
