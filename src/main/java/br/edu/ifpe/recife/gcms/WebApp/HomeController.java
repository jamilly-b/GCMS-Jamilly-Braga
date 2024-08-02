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
	public @ResponseBody String alteracao() {
		return "Alteracao para fazer commit - prática 3";
	}
	
	@RequestMapping("/alteracao-original")
	public @ResponseBody String alteracao2() {
		return "Alteracao no original";
	}
	
	@RequestMapping("/alteracao-copia")
	public @ResponseBody String alteracaoCopia() {
		return "Criação de uma cópia para simular um trabalho paralelo";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String branchHotfix() {
		return "branch hotfix";
	}
}