package pack.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import pack.model.HelloModel;

@org.springframework.stereotype.Controller
@RequestMapping({"hello.do", "hi", "aaa/world.do", "h*.do", "k*", "mbc", "jtbc"})
public class HelloController {
	@Autowired // Sector Insection
	private HelloModel helloModel;

	/*
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView summaryGET() {
		String result = helloModel.getGreeting();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("result", result);
		return modelAndView;
	}
	*/
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Object> summaryGET() {
		String result = helloModel.getGreeting();
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		
		return map;
		/*
		 * 웹에서 요청이 hello.do로 왔기 때문에 hello인 파일만 찾아 출력한다.
		 * 
	}*/
	
	@RequestMapping(method = RequestMethod.GET)
	public Model summaryGET(Model model) {
		String result = helloModel.getGreeting();
		
		model.addAttribute("result", result);
		
		return model;
	}
}