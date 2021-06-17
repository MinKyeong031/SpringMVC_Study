package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@PostMapping("/test2")
	public String test2(UserDTO dto) {
		dto.setUser_name("lee");
		dto.setUser_id("lee_id");
		dto.setUser_pw("2222");
		dto.setUser_email("lee@gmail.com");
		dto.setUser_addr1("daegu");
		dto.setUser_addr2("chimsan 153");
		
		return "test2";
	}
	
	@PostMapping("/test3")
	public String test3(@ModelAttribute("user") UserDTO dto) {
		dto.setUser_name("park");
		dto.setUser_id("park_id");
		dto.setUser_pw("3333");
		dto.setUser_email("park@gmail.com");
		dto.setUser_addr1("busan");
		dto.setUser_addr2("gwangan 32");
		return "test3";
	}
}
