package br.com.lifejesus.minivenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lifejesus.minivenda.model.Produto;

@Controller
@RequestMapping("/manutencaoProduto")
public class ManutencaoProdutoController {

	@RequestMapping(value="/registra", method=RequestMethod.GET)
	public String  preparaViewProduto(Model model, Produto produto) {	
		model.addAttribute("produto",produto);
		return "manutencao/produto/cadastro";
	}
	
	@RequestMapping(value="/registra", method=RequestMethod.POST)
	public String  registraProduto(Produto produto, Model model) {	
		return "manutencao/produto/confirmacao";
	}
	
	@RequestMapping(value="/atualiza", method=RequestMethod.POST)
	public String atualizarIformacaoProduto(Produto produto, Model model) {
		
		return "manutencao/produto/descricao";
	}
	
	@RequestMapping(value="/registrados", method=RequestMethod.GET)
	public String listaProdutos(Model  model) {
		
		return "manutencao/produto/registrados";
	}
	@RequestMapping(value="/localiza", method=RequestMethod.POST)
	public String procuraProduto(int codigoProduto, Model model) {
		return "manutencao/produto/descricao";
	}
	
}
