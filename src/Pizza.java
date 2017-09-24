import java.util.HashMap;

public class Pizza {

    //Definição do Hashmap que será utilizado
    public HashMap  <Integer, String> ingredientes;

    public Pizza(){
        this.ingredientes = new HashMap<>();
    }

    //Função para adicionar um novo ingrediente, utiliza um código e um nome com String
    public void addIngrediente(Integer cod, String nome){
        ingredientes.put(cod, nome);
    }

    //Função para buscar a quantidade de ingredientes na pizza
    public int getQuantidade() {
        return ingredientes.size();
    }

    //Função que calcula o preço da Pizza baseado na quantidade de ingredientes.
    public int getPreco(){
        int pPizza = 0;
        if (getQuantidade() < 3 ){
            pPizza = 15;
        }
        else if (getQuantidade() >=3 && getQuantidade() <=5){
            pPizza = 20;
        }
        else{
            pPizza = 25;
        }
        System.out.println("Preço da Pizza: R$" + pPizza);
        return pPizza;
    }

    // Função que retorna a lista de ingredientes da Pizza:
    //Função apenas ilustrativa para saber como buscar informações do HashMap
    public int listaIngredientes(){
        for (int key : ingredientes.keySet()){
            String value = ingredientes.get(key);
            System.out.print("Ingredientes: " + key + "-" + value);
        }
        return 0;
    }

}





