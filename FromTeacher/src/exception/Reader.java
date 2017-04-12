package exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {

	public static void main(String[] args) {
		String filePath = "C:/Users/saadi/Word Meaning/WordList.docx";
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
