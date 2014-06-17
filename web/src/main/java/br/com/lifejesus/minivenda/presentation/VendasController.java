package br.com.lifejesus.minivenda.presentation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lifejesus.minivenda.domain.Cliente;
import br.com.lifejesus.minivenda.domain.ItemPedido;
import br.com.lifejesus.minivenda.domain.Pedido;
import br.com.lifejesus.minivenda.domain.Produto;

@Controller
@RequestMapping("/vendas")
public class VendasController {

	private List<ItemPedido> carrinho= new ArrayList<ItemPedido>(); 
	private ItemPedido itemPedido = new ItemPedido();
	private Pedido pedido = new Pedido();
	
	@RequestMapping(value="/AdicionaProdutoCarrinho",method=RequestMethod.POST)
	public String adicionaItemPedido(Model model,Produto produto,int qtd,Pedido pedido) {
		
		this.itemPedido.setPedido(pedido);
		this.itemPedido.setProduto(produto);
		this.itemPedido.setQuantidade(qtd);
		this.carrinho.add(itemPedido);
		model.addAttribute("carrinho", carrinho);
		
		return "vendas/fechaPedido";
	}
	
	@RequestMapping(value="/FechaPedido",method=RequestMethod.POST)
	public String  adiconaPedido(Cliente cliente, Pedido pedido,List<ItemPedido>carrinho ) {
		this.pedido.setCliente(cliente);
		pedido.setData(Calendar.getInstance());;
		pedido.setItemPedido(carrinho);	
		return "vendas/formasPagamento";
	}
	
}
