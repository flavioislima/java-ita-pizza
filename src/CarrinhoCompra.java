import java.util.ArrayList;

public class CarrinhoCompra {
    //Define um Array para guardar as Pizzas
        public ArrayList<Pizza> Pizzas;

        public CarrinhoCompra(){
            this.Pizzas = new ArrayList<>();
        }

        //função para adicionar pizzas ao array Pizzas
        public void addPizza(Pizza pizza){
            if (pizza.getQuantidade()>0){
                this.Pizzas.add(pizza);
            }
        }

        //função que calcula o valor total das pizzas. Percorre o array em busca as pizzas cadastradas e verifica preço
        //a preço e soma à variável vTotal
        public int valorTotalPizzas(){
           int vTotal = 0;
           for (Pizza pizza:Pizzas){
               vTotal = vTotal + pizza.getPreco();
           }
            System.out.println("\nO valor total das Pizzas é de: R$"+vTotal);
           return vTotal;
        }

        //função que realiza algo parecido com a anterior mas, dessa vez, calcula a quantidade de ingredientes utilizada.
        public int somaIngredientes(){
            int ingTotal = 0;
            for (Pizza pizza:Pizzas){
                ingTotal = ingTotal + pizza.getQuantidade();
            }
            System.out.println("\nA quantidade total de ingredientes é de "+ingTotal);
            return ingTotal;
        }


}
