package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Person;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String person(Model model){
		Person person = new Person();
		person.setFirstName("Roger");
		person.setLastName("Liu");
		person.setAge(35);
		model.addAttribute("person", person);
		return "personview";
	}
	
	@ResponseBody
	@RequestMapping("/")
	public String entry(){
		return "Hello My Spring Boot Application";
	}
	
}
