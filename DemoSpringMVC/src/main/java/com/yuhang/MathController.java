package com.yuhang;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yuhang.service.MathService;

// YH: Annotation to specify that this class contains controller methods.
@Controller
public class MathController {

	// YH: Annotation to specify that this method should handle requests denoted as "add"
	@RequestMapping("/add")
	//YH: Through the annotation "@RequestParam" we obtain the user input parameters.
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {	
		
		MathService ms = new MathService();
		int k = ms.add(i,j);
		
		//YH: Pass data to the view
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayResult");
		mv.addObject("result", k);

		return mv;
	}

/*
	// YH: Alternative way:
	// YH: Annotation to specify that this method should handle requests denoted as "add"
	@RequestMapping("/add")
	// YH: Parameter "HttpServletRequest request" contains user input values for addition
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {			
				
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		// YH: Should move the logical part into the service part (Model) instead of doing it in controller
		int k = i + j;

		// YH: Pass result to the view
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv;
	}
*/
}
