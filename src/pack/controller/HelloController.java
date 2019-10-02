package pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView summaryGET() {
		String result = helloModel.getGreeting();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("result", result);
		return modelAndView;
	}
}