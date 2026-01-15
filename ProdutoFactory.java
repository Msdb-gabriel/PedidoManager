package app;

public class ProdutoFactory {

    public static Produto criar(String nome, double preco){

        return new Produto(nome, preco);


    }
}
