package ita.pizza.pizzaria;

import java.util.HashMap;

public class Pizza {

    //Defini��o do Hashmap que ser� utilizado
    public HashMap  <Integer, String> ingredientes;

    public Pizza(){
        this.ingredientes = new HashMap<>();
    }

    //Fun��es para adicionar um novo ingrediente, utiliza um c�digo e um nome com String
    public void addIngrediente(Integer cod, String nome){
        ingredientes.put(cod, nome);
    }

    //Fun��es para buscar a quantidade de ingredientes na pizza
    public int getQuantidade() {
        return ingredientes.size();
    }

    //Fun��es que calcula o pre�o da Pizza baseado na quantidade de ingredientes.
    public int getPreco(){
        int pPizza = 0;
        if (getQuantidade() < 3 ){
            pPizza = 15;
        }
        else if (getQuantidade() >=3 && getQuantidade() <=5){
            pPizza = 20;
        }
        else{
            pPizza = 23;
        }
        System.out.println("Preço da Pizza: R$" + pPizza);
        return pPizza;
    }

    // Fun��o que retorna a lista de ingredientes da Pizza:
    //Fun��o apenas ilustrativa para saber como buscar informa��es do HashMap
    public int listaIngredientes(){
        for (int key : ingredientes.keySet()){
            String value = ingredientes.get(key);
            System.out.print("Ingredientes: \n" + key + " - " + value);
        }
        return 0;
    }
    
    public void removeIngrediente(){
    		ingredientes.clear();
    		System.out.print("\nIngredientes removidos");

    }

}



