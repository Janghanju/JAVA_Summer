package com.bit.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/bit/input/word.txt";
			// ... word.txt 파일을 읽기위해서 여는 과정
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			// reader에서 사용할 문자열 변수는 클래스 초기화를 해야한다.
			String reader = new String();
//			String reader = "";
			while(true) {
				reader = buffer.readLine();
				
				// null coder값으로 봤을때 0
				if(reader == null) {
					break;
				}
				
				System.out.println(reader);
			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(fileName + "open error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("read error");
		}
		
	}

}
