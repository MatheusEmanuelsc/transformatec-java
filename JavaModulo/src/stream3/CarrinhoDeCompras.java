package stream3;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	public static void main(String[] args) {

		List<Produto>compras= new ArrayList<>();
		compras.add(new Produto(1, "celular", 600d));
		compras.add(new Produto(2, "tablet", 300d));
		compras.add(new Produto(3, "notebook", 1200d));
		compras.add(new Produto(4, "fone", 100d));
		compras.add(new Produto(5, "carregador", 50d));
		compras.add(new Produto(6, "radio", 200d));
		compras.add(new Produto(7, "gifcard", 20d));
		compras.add(new Produto(8, "mouse", 100d));
		compras.add(new Produto(9, "mochila", 200d));
		
		List<Double>precoLista=compras.stream().filter(compra->compra.getPreco()>=400).map(compra-> compra.getPreco()).toList();
		precoLista.forEach((preco)-> System.out.println("preço: "+preco));
		
		
		
		
	}
}
