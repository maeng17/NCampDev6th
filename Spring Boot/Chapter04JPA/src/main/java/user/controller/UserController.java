package user.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value="writeForm")
	public String writeForm() {
		return "user/writeForm";
	}
	
	@PostMapping(value="write")
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO) {
		userService.write(userDTO);
	}
	
	@PostMapping(value="isExistId")
	@ResponseBody
	public String isExistId(@RequestParam(value="id") String id) {
		return userService.isExistId(id);
	}
	
	@GetMapping(value="list")
	public String list(@RequestParam(value="page", required = false, defaultValue = "0") String page, Model model) {
		System.out.println("page = " + page);
		model.addAttribute("page", page);
		return "user/list";
	}
	
	@PostMapping(value="getUserList")
	@ResponseBody 
	public Page<UserDTO> getUserList( //Page는 List와 비슷 List는 담아오기만 하지만 Page는 페이징처리 함
			//page는 0부터 시작. 0리면 1페이지, 1이면 2페이지,...
			@PageableDefault(page=0, size=3, sort="name", direction = Sort.Direction.DESC) Pageable pageable) {
		return userService.getUserList(pageable);
	}
	
	@GetMapping(value="updateForm")
	public String updateForm(@RequestParam(value="id") String id,
							 @RequestParam(value="page") String page,
							 Model model) {
		model.addAttribute("id", id);
		model.addAttribute("page", page);
		return "user/updateForm";
	}
	
	@PostMapping(value="getUser")
	@ResponseBody
	public Optional<UserDTO> getUser(@RequestParam(value="id") String id) {
		return userService.getUser(id);
	}
	
	@PostMapping(value="update")
	@ResponseBody
	public void update(@ModelAttribute UserDTO userDTO) {
		userService.update(userDTO);
	}
	
	@PostMapping(value="delete")
	@ResponseBody
	public void delete(@RequestParam(value="id") String id) {
		userService.delete(id);
	}
	
	@PostMapping(value="getUserSearchList")
	@ResponseBody
	public List<UserDTO> getUserSearchList(@RequestParam(value="columnName") String columnName,
											@RequestParam(value="value") String value) {
		return userService.getUserSearchList(columnName, value);
	}

}


