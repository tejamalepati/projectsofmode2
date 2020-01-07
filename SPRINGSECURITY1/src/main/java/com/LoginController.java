package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value = "/")

	public ModelAndView welcomePage() {
		return new ModelAndView("welcomePage");

	}

	@RequestMapping(value = { "/Success" }, method = RequestMethod.GET)
	public ModelAndView SuccessPage(HttpServletRequest req) {

		return new ModelAndView("Success");
	}

	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
			model.setViewName("loginPage");
			return model;
		}

		else if (logout != null) {
			model.addObject("message", "Logged out successfully.");
			model.setViewName("loginPage");
			return model;
		} else if (logout == null && error == null) {
			return new ModelAndView("loginPage");
		}

		return new ModelAndView("Success");
	}

}
