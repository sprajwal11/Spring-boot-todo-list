package com.todolist.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
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
		
		model.put("name", uname);
		model.put("password", psw);
		
		
		
//		model.put("name", name);
//		System.out.println(name);
		
		return "welcome";
	}

}


