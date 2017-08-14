package com.bit.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bit.vo.wordVO;

public class FileReader_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/bit/input/words.txt";
		ArrayList<wordVO> arrWord = new ArrayList<wordVO>();
		Scanner scanner = new Scanner(System.in);
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			
			while(reader != null) {
				
				reader = buffer.readLine();
				if(reader == null) break;
				String[] words = reader.split(":");
				
				wordVO vo = new wordVO();
				vo.word = words[0];
				vo.mean = words[1];
				
				arrWord.add(vo);
				
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(wordVO v : arrWord) {
			System.out.println("다음에 제시된 단어의 뜻은?");
			System.out.println(v.word + ">>");
			String ans = scanner.nextLine();
			
			if(ans.equalsIgnoreCase(v.mean)) {
				System.out.println("참 잘했어요");
			} else {
				System.out.println("아쉽네");
				System.out.println("정답은 " + v.mean);
			}
		}
		
	}

}
