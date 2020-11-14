package pe.edu.upc.ezshipping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("nombre", "Dylan Delgado");
		return "index";
	}
	
	@GetMapping("login")
	public String login() {
		return "login/index";
	}
}
