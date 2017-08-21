import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest2 {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("member.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("memberout.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
//			int data;
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
