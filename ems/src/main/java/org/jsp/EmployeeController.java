package org.jsp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	List<Employee> al=new ArrayList();
	
	@RequestMapping("/save")
	public String save(@RequestParam String name,@RequestParam String  job,@RequestParam String salary) {
		Employee emp = new Employee(0, name, job, salary);
		al.add(emp);
		return "index.jsp";
	}
	@RequestMapping("/findAll")
	public ModelAndView findall() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("allviews.jsp");
		mv.addObject("al", al);
		return mv;
	}

}
