package collection;

import java.util.ArrayList;

public class PersonMain {

	public ArrayList<PersonDTO> init() { //구현
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도" ,40);
		PersonDTO cc = new PersonDTO("라이언", 30);
		
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
	}
	
	public static void main(String[] args) {
		PersonMain personMain = new PersonMain();
		
		ArrayList<PersonDTO> list = personMain.init(); //호출
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(list.get(i).getName() + "\t" + list.get(i).getAge());
			System.out.println();
		} //for
		
		for(PersonDTO personDTO : list) {
			
			//toString Override 하기 전
			//System.out.println(personDTO.getName() + "\t" + personDTO.getAge());
			
			//toString Override 한 후
			System.out.println(personDTO);
		}
		

	}

}
