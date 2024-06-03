package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.SungJukDTO;

@Controller
public class SungJukController {
	@GetMapping(value="sungJuk/input.do")
	public String input() {
		return "sungJuk/input";
	}
	
	@PostMapping(value="sungJuk/result.do")
	public String result(@ModelAttribute SungJukDTO sungJukDTO, ModelMap modelMap) {
		int tot = sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath();
		double avg = tot / 3.0;
		
		sungJukDTO.setTot(tot);
		sungJukDTO.setAvg(avg);
		
//		modelMap.put("name", sungJukDTO.getName());
//		modelMap.put("tot", sungJukDTO.getTot());
//		modelMap.put("avg", sungJukDTO.getAvg());
		
		modelMap.put("sungJukDTO", sungJukDTO);
		
		return "sungJuk/result";
	}
}
