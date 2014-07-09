package br.com.lifejesus.minivenda.presentation;

import br.com.lifejesus.minivenda.domain.CategoriaRepository;
import br.com.lifejesus.minivenda.domain.FornecedorRepository;
import br.com.lifejesus.minivenda.domain.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lifejesus.minivenda.domain.Produto;

@Controller
@RequestMapping("/Produto")
public class ManutencaoProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private FornecedorRepository fornecedorRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String  preparaCadastroDeProduto(Model model, Produto produto) {
        model.addAttribute("produto",produto);
		model.addAttribute("fornecedores", fornecedorRepository.buscaTodosFornecedores());
        model.addAttribute("categorias",categoriaRepository.buscaTodasCategorias());
        return "/manutencao/produto/cadastroProduto";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String  adicionaNovoProduto(Produto produto, Model model) {
        produtoRepository.adicionaNovoProduto(produto);
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
