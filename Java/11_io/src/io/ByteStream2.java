package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file= new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		
		int size = (int) file.length(); // 파일 크기
		
		//파일 크기만큼 배열을 잡는다.
		byte[] ar = new byte [size];
		
		//파일 읽기
		bis.read(ar, 0, size);
		
		
		System.out.println(new String(ar)); //byte[] -> String 변환
		
		bis.close();
	}

}
