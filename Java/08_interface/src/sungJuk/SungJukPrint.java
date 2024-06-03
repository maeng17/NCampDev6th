package sungJuk;

import java.util.ArrayList;

public class SungJukPrint implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		
		for(SungJukDTO sungJukDTO : list) {
			System.out.println(sungJukDTO);
		} //for
		
	}


}
