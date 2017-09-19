package class1;

public class OnlinePizzaService {
	public static void main(String args[]) {
		System.out.println("Welcome to Pizza Service");
		Customer camille;
		Website pizzaHut;
		camille = new Customer();
		camille.name = "Camille";
		camille.userName = "Camille@husky.neu.edu";
		pizzaHut = new Website();
		camille.login(pizzaHut);

		Customer manjula;
		manjula = new Customer();
		manjula.name = "Manjula";
		manjula.userName = "manjula@neu.edu";
		manjula.login(pizzaHut);

		System.out.println("Bye Bye to Pizza Service");
	}
}
