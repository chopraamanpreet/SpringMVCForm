package com.amanpreet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student");
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.GET)
	public ModelAndView addStudent(@RequestParam("studentid") String id, @RequestParam("studentname")String name, @RequestParam("studentage")String age ) {
		ModelAndView model=new ModelAndView("result");
		model.addObject("msg","Details submitted: Name" +name+"Number:"+ id + "Age:" +age);
		
		return model;
	}
}
