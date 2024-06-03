package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersonDTO dto = new PersonDTO("홍길동", 25, 185.3);
		
		//파일로 저장
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(dto);
		oos.close();
		
		//파일로부터 읽기
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO dto2 = (PersonDTO) ois.readObject(); //자식 = (자식) 부모
		System.out.println("이름 = " + dto.getName());
		System.out.println("나이 = " + dto.getAge());
		System.out.println("키= " + dto.getHeight());
		ois.close();
		
	}

}
