package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("정렬 전 = ");
		for (String data : ar) {
			System.out.print(data + "\t");
		}
		System.out.println();
		
		Arrays.sort(ar);
		
		System.out.print("정렬 후 = ");
		for (String data : ar) {
			System.out.print(data + "\t");
		}
		System.out.println();
		
		//객체 비교
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도" ,40);
		PersonDTO cc = new PersonDTO("라이언", 30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println();
		System.out.println("나이로 정렬");
		System.out.println("[정렬 전]");
		for (PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		//나이를 기준으로 오름차순 or 내림차순
		Collections.sort(list);
		
		System.out.println("[정렬 후]");
		for (PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		
		System.out.println("이름으로 오름차순");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare (PersonDTO p1, PersonDTO p2) {
				// return p1.getName().compareTo(p2.getName()); //오름차순
				
				//return p1.getName().compareTo(p2.getName()) * -1; // 내림차순
				return p2.getName().compareTo(p1.getName()); //내림차순
			}
		};
		Collections.sort(list, com); //기존값 말고, 새로운 기준치인 com으로 sort
		
		System.out.println("[정렬 후]");
		for (PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		

	}

}
