package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.ModelDTO;
import kr.hs.study.model.ModelDTO2;
import kr.hs.study.model.ModelDTO3;

@Controller
public class TestController {
	
    @GetMapping("/test1")
	public String test1(ModelDTO dto) {
    	System.out.println(dto.getA());
    	System.out.println(dto.getB());
    	System.out.println(dto.getC());

		return "result";
	}

	@GetMapping("/test2")
	public String test2() {
		return "login_form";
	}

	@PostMapping("/login")
	public String login(ModelDTO2 dto) {
    	System.out.println(dto.getId());
    	System.out.println(dto.getPass());
    	
		return "result";
	}

    @GetMapping("/test3")
	public String testd(ModelDTO3 dto) {
    	System.out.println(dto.getA());
    	System.out.println(dto.getB());
		for(int value : dto.getC()) {
			System.out.println(value);
		}

		return "result";
	}
}
