package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) throws IOException {
		//파일로 출력
		//DataOutputStream bos = new DataOutputStream(new FileOutputStream("result.txt"));
		
		FileOutputStream fos = new FileOutputStream("result.txt");
		DataOutputStream bos = new DataOutputStream(fos);
		
		bos.writeUTF("홍길동");
		bos.writeInt(25);
		bos.writeDouble(185.3);
		
		bos.close();
		
		//파일로부터 입력
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("키 = " + height);
		
		dis.close();
	}

}
