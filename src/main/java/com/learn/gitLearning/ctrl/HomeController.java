package com.learn.gitLearning.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home() {
		System.out.println("ctrl called ");
		return "welcome";
	}
}
