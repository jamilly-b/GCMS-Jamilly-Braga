package br.edu.ifpe.recife.gcms.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
	
	@RequestMapping("/jamilly")
	public @ResponseBody String greetingJamilly() {
		return "Hello, jamilly";
	}
	
	@RequestMapping("/gcms")
	public @ResponseBody String alteracoes() {
		return "Alterações para realizar commit da prática 3";
	}
}