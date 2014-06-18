package br.com.lifejesus.minivenda.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
@Table(name = "tb_pedido")
public class Pedido {

	@Id
	@GeneratedValue
	private Integer id;
	private Calendar data;
	private Cliente cliente;
	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itemPedido;

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((itemPedido == null) ? 0 : itemPedido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemPedido == null) {
			if (other.itemPedido != null)
				return false;
		} else if (!itemPedido.equals(other.itemPedido))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", cliente=" + cliente
				+ ", itemPedido=" + itemPedido + "]";
	}

	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}

}
