import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		
		// 바이트 스트림 사용(COPY Programming)
		// 예외처리
		try {
			// 노드 스트림(입출력 데이터에 가장 먼저 연결되는 스트림), 단독O
			FileInputStream fis = new FileInputStream("hagen.jpg");
			// 필터스트림 (입출력 성능을 개선시키는 스트림), 단독X
			BufferedInputStream bis = new BufferedInputStream(fis);

			FileOutputStream fos = new FileOutputStream("copy.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int data;
			
			while((data=fis.read()) != -1) {
//				System.out.println(data);
				bos.write(data);
			}
//			bos.flush();
			bos.close();
			System.out.println("복사완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
