package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Cliente");
        String nomeCliente = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        Pedido pedido = new Pedido(cliente);

       while (true) {
           System.out.println("Digite o nome do produto: ");
           String nomeProduto = sc.nextLine();

           System.out.println("Digite o preço do produto: ");
           double precoProduto = sc.nextDouble();
           sc.nextLine();

           pedido.adicionarProduto(
                   ProdutoFactory.criar(nomeProduto, precoProduto)
           );
           System.out.println("Deseja adicionar outro produto? (s/n)");
           String resposta = sc.nextLine();

           if (!resposta.equalsIgnoreCase("s")) {
               break;
           }
       }
           pedido.listarProdutos();

           System.out.println("Cliente: " + pedido.getCliente().getNome());

           System.out.println("Total: " + pedido.calcularTotal());



        sc.close();
    }
}