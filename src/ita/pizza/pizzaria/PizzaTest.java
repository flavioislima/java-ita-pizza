package ita.pizza.pizzaria;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.AfterClass;


public class PizzaTest {
	//testa o valor da pizza
	@Test
	public void valorTest() {
		Pizza ptest = new Pizza();
		ptest.addIngrediente(10, "mussarela");
		assertEquals(15, ptest.getPreco());

	}
	//testa a quantidade de ingredientes de uma pizza
	@Test
	public void qtdTest() {
		Pizza ptest2 = new Pizza();
		ptest2.addIngrediente(10, "mussarela");
		assertEquals(1, ptest2.getQuantidade());

	}

	//testa a classe carrinho
	@Test
	public void carroTeste(){
		//Pizzas que serão somadas ao Carrinho
		Pizza ptest4 = new Pizza();
		Pizza ptest5 = new Pizza();
		Pizza ptest6 = new Pizza();

		//Pizza que não será somada ao Carrinho
		Pizza pvazia = new Pizza();

		ptest4.addIngrediente(1, "Cheddar");
		ptest4.addIngrediente(2, "Provolone");

		ptest5.addIngrediente(3, "Tomate Seco");
		ptest5.addIngrediente(4, "Bacon");
		ptest5.addIngrediente(5, "Azeitonas");

		ptest6.addIngrediente(6, "Chocolate");
		ptest6.addIngrediente(7, "M & M");
		ptest6.addIngrediente(8, "Leite Condensado");
		ptest6.addIngrediente(9, "Morango");
		ptest6.addIngrediente(10, "Coco Ralado");
		ptest6.addIngrediente(11, "Bombom");

		CarrinhoCompra ccTest = new CarrinhoCompra();
		ccTest.addPizza(ptest4);
		ccTest.addPizza(ptest5);
		ccTest.addPizza(ptest6);
		ccTest.addPizza(pvazia);

		assertEquals(11, ccTest.somaIngredientes());
		assertEquals(58, ccTest.valorTotalPizzas());


		}

	//remove os ingredientes após a execução da classe
	@AfterClass
	public static void removeTest() {
		Pizza ptest3 = new Pizza();
		ptest3.addIngrediente(10, "mussarela");
		ptest3.addIngrediente(20, "calabresa");
		ptest3.removeIngrediente();
		assertEquals(0, ptest3.getQuantidade());
	}

}
