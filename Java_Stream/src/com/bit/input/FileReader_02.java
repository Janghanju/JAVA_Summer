package com.bit.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/bit/input/words.txt";
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			
			while(true) {
				reader = buffer.readLine();
				
				if(reader == null) {
					break;
				}
				
				String[] words = reader.split(":");
				System.out.println("단어 : ");
				System.out.println(words[0]);
				
				System.out.println("뜻 : ");
				System.out.println(words[1]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(fileName + "open error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("read error");
		}
		
	}

}
