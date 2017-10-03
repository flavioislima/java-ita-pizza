package ita.pizza.pizzaria;

public class Principal {
    public static void main(String[] args) {
        //Agora esta na hora de por a mao na Massa (sorry -.-')
        Pizza p1 = new Pizza();
        p1.addIngrediente(1, "Mussarela");
        p1.addIngrediente(2, "Calabresa");
        p1.addIngrediente(3, "Bacon");
        System.out.println("Quantidade de ingredientes: "+ p1.getQuantidade());

        Pizza p2 = new Pizza();
        p2.addIngrediente(1, "Mussarela");
        p2.addIngrediente(2, "Ovos");
        System.out.println("Quantidade de ingredientes: "+ p2.getQuantidade());

        Pizza p3 = new Pizza();
        p3.addIngrediente(1, "Qj Mussarela");
        p3.addIngrediente(2, "Qj Prato");
        p3.addIngrediente(3, "Qj Cheddar");
        p3.addIngrediente(4, "Qj Gorgonzola");
        p3.addIngrediente(5, "Tomate Seco");
        p3.addIngrediente(6, "Azeitonas");
        System.out.println("Quantidade de ingredientes: "+ p3.getQuantidade());

        CarrinhoCompra carrinho  = new CarrinhoCompra();
        carrinho.addPizza(p1);
        carrinho.addPizza(p2);
        carrinho.addPizza(p3);
        carrinho.somaIngredientes();
        carrinho.valorTotalPizzas();

    }

}