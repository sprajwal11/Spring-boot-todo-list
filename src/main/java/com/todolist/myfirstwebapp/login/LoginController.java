package com.todolist.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	//@ResponseBody
	public String goToLofinPage() {
		
//		model.put("name", name);
//		System.out.println(name);
		
		return "login";
	}

	@RequestMapping(value="login",method = RequestMethod.POST)
	//@ResponseBody
	public String goToWelcomePage(@RequestParam String uname,@RequestParam String psw, ModelMap model) {
		
		if(authenticationService.authenticate(uname, psw)) {
			
		
		model.put("name", uname);
		//model.put("password", psw);
		
		
		//Authentication logic
		/*
		 * name: prajwal
		 * password: password123
		 * */
		
		
//		model.put("name", name);
//		System.out.println(name);
		
		return "welcome";
		}
		model.put("errorMessage", "Invalid username or password. Please try again.");
		return "login";
		
	}

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

}


