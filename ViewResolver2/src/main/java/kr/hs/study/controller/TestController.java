package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.model.dto.AbcDTO;


@Controller
public class TestController {
	
    @GetMapping("/test1")
	public String test1() {
		return "test1";
	}
    
    @GetMapping("/test2")
    public String test2(Model model) {
    	model.addAttribute("id", "kim");
    	model.addAttribute("password", "1111");
    	return "test2";
    }
    
    @GetMapping("/test3")
    public String test3() {
    	return "login_form";
    }
//    
//    @PostMapping("/test3")
//    public String test3_re(UserDTO dto, Model model) {
//    	model.addAttribute("id", dto.getId());
//    	model.addAttribute("password", dto.getPassword());
//    	model.addAttribute("email", dto.getEmail());
//    	return "login_result";
//    }

    @GetMapping("/test4")
    public ModelAndView test4(ModelAndView mv) {
    	mv.addObject("id", "lee");
    	mv.addObject("password", "1111");
    	mv.addObject("email", "lee@gmail.com");
    	mv.setViewName("test4");
    	return mv;
    }
    
    @GetMapping("/test5")
    public String test5(AbcDTO dto, Model model) {
    	model.addAttribute("a", dto.getA());
    	model.addAttribute("b", dto.getB());
    	model.addAttribute("c", dto.getC());
    	return "test5";
    }

    @GetMapping("/test6")
    public String test6(@ModelAttribute AbcDTO dto) {
    	return "test6";
    }
    @GetMapping("/test7")
    public String test7(@ModelAttribute("sample") AbcDTO dto) {
    	return "test7";
    }
}
