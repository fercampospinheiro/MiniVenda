package br.com.lifejesus.minivenda.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lifejesus.minivenda.model.Usuario;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String  loginFormulario(Usuario usuario, Model model) {
		model.addAttribute("usuario", usuario);
		
		return "usuario/login";
	}
	
	@RequestMapping(value="/autentica",method= RequestMethod.POST)
	public String autenticaUsuario(@ModelAttribute(value="usuario")Usuario usuario, HttpSession session  ) {
		session.setAttribute("usuarioLogado", usuario);
		return "website/home";
	}
	
	
}
