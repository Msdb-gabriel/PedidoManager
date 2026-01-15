package app;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido (Cliente cliente ){

        this.cliente = cliente;
        this.produtos = new ArrayList<>();

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void adicionarProduto(Produto produto){

        this.produtos.add(produto);
    }

    public double calcularTotal(){

        double total= 0;

        for ( Produto produto : produtos){

            total+= produto.getPreco();


        }
        return total;

    }
    public void listarProdutos() {
        System.out.println("\nProdutos do pedido:");

        for (Produto produto : produtos) {
            System.out.println(
                    "- " + produto.getNome() + " | R$ " + produto.getPreco()
            );
        }
    }

}
