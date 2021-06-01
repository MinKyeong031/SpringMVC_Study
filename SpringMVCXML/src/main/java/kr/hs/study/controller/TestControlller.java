package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub1")
public class TestControlller {
	@GetMapping("/test2")
	//@RequestMapping(value="/test2", method=RequestMethod.GET)
	public String test2() {
		System.out.println("test2");
		return "sub1/test2";//절대경로 : 루트부터 시작 webapp /WEB-INF/views/sub1/test2.jsp
		//return "WEB-INF/views/sub1/test2.jsp"; 상대겨로 : 현재의 위치 /sub1/WEB-INF/views/sub1/test2.jsp
	}

	@GetMapping("//test3")
//	@RequestMapping(value="/test3", method=RequestMethod.GET)
	public String test3() {
		System.out.println("test3");
		return "sub1/test3";
	}

	@GetMapping("/test4")
//	@RequestMapping(value="/test4", method=RequestMethod.GET)
	public String test4() {
		System.out.println("test4");
		return "sub1/test4";
	}
}
