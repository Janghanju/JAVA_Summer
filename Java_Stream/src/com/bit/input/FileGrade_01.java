package com.bit.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileGrade_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/bit/input/grades.txt";
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			
			System.out.println("========================================");
			System.out.println("성적표");
			System.out.println("========================================");
			
			while(reader != null) {
				reader = buffer.readLine();
				
				if(reader == null) break;
				
				String[] grades = reader.split(":");
				String strNum = grades[0];
				String strName = grades[1];
				String strKor = grades[2];
				String strEng = grades[3];
				String strMath = grades[4];
				
				System.out.println(strNum + "\t");
				System.out.println(strName + "\t");
				System.out.println(strKor + "\t");
				System.out.println(strEng + "\t");
				System.out.println(strMath + "\t");
				
				int sum = Integer.parseInt(strKor);
				sum += Integer.parseInt(strEng);
				sum += Integer.parseInt(strMath);
				
				System.out.println(sum + "\t");
				System.out.println(sum/3);
				
				System.out.println("---------------------------");
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
