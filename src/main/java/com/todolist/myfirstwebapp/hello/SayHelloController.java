package com.todolist.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//-"say-hello"=> "Hello! How is your learning going?"
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		
		return "Hello! How is your learning going?";
	}


@RequestMapping("say-hello-html")
@ResponseBody
public String sayHelloHtml() {

	
	return " <!DOCTYPE html>\r\n"
			+ "<html>\r\n"
			+ "<head>\r\n"
			+ "<title>Page Title</title>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "\r\n"
			+ "<h1>This is a Heading</h1>\r\n"
			+ "<p>This is a paragraph.</p>\r\n"
			+ "\r\n"
			+ "</body>\r\n"
			+ "</html> ";
}

@RequestMapping("say-hello-jsp")
//@ResponseBody
public String sayHelloJsp() {

	
	return "sayHello";
}


}
