package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.dto.UserDTO;


@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "register_form";
	}
	
	@PostMapping("/register")
	public String register(UserDTO dto) {
		dto.setUser_name("kim");
		dto.setUser_id("kimid");
		dto.setUser_pw("1111");
		dto.setUser_email("kim@gmail.com");
		dto.setUser_addr1("seoul");
		dto.setUser_addr2("kwanak 353");
		
		return "test1";
	}
}
