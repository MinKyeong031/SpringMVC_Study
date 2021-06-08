package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
    @GetMapping("/")
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	//get  방식으로 /test1으로 접속했을 때 콘솔에  test1 출력
	//test1.jsp만들어서 web으로 출력
	
	

}
