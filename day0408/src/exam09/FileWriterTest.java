package exam09;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("/Users/pangyan/Desktop/javaStudy//hello.txt");
			fw.write("hello java");
			System.out.println("파일을 생성하였습니다.");
		}catch(IOException e) {
			System.out.println("예외가 발생되었습니다. "+e.getMessage());
		}

	}

}
