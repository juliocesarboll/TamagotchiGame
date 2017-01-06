package game.tamagotchi;

import java.util.Random;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		Tamagotchi tamagotchi = new Tamagotchi(JOptionPane.showInputDialog("Digite o nome do seu Tamagotchi"));

		Action action = new Action();
		Random random = new Random();
		String aux = "";

		while (tamagotchi.getAge() < 5 || tamagotchi.getWeight() < 1 || tamagotchi.getWeight() > 20) {

			do {
				// Choose the Action
				aux = JOptionPane.showInputDialog("Digite aqui o n�mero da A��o desejada!\n"
						+ "1- Comer\n2- Dormir\n3- Tomar Banho\n4- Brincar\n5- Estudar\n6- Malhar\n7- Ir ao Hospital\n8- Passear\n0- Exit");
				action.setNumero(Integer.parseInt(aux));

				// If 0, Exit game
				if (action.getNumber() == 0) {
					JOptionPane.showConfirmDialog(null, "Obrigado por jogar!");
					System.exit(0);
				}

			} while (action.getNumber() < 1 || action.getNumber() > 8);

			switch (action.getNumber()) {

			case 1:
				// Wish Status 0-10 to do this Action
				tamagotchi.setWish(random.nextInt(10) + 1);

				do {
					// Need confirm if understood the risk
					aux = JOptionPane.showInputDialog("A vontade do(a) " + tamagotchi.getName() + " de Comer �: "
							+ tamagotchi.getWish() + "\n" + "Se a vontade for Menor que 6, " + tamagotchi.getName()
							+ " poder� haver acidentes inoportunos.\n" + "Digite 1 para continuar ou 0 para sair.");

				} while (Integer.parseInt(aux) < 0 || Integer.parseInt(aux) > 1);
				
				// Confirmed
				if (Integer.parseInt(aux) == 1) {
					if (tamagotchi.getWish() < 6) {
						
						// Random to decide if the Shit will happen
						int shit = random.nextInt(10) + 1;

						if (shit <= 5) {
							
							//Random to decide WHICH Shit will happen
							int damnIt = random.nextInt(10) + 1;

							if (damnIt <= 4) {
								double x = action.heal();
								
								JOptionPane.showConfirmDialog(null,
										"�, infelizmente deu merda!\n" + tamagotchi.getName()
												+ " Teve intoxica��o alimentar e foi para o Hospital.\n"
												+ "Devido a isso, perdeu: " + x + "kg");
								tamagotchi.setWeight(tamagotchi.getWeight() - x);
								
								break;
							}
							if (damnIt >= 5 && damnIt <= 8) {
								double x = action.heal();
								
								JOptionPane.showConfirmDialog(null,
										"�, infelizmente deu merda!\n" + tamagotchi.getName()
												+ " Cortou a lingua lambendo a faca e foi para o Hospital.\n"
												+ "Devido a isso, perdeu: " + x + "kg");
								tamagotchi.setWeight(tamagotchi.getWeight() - x);
								
								break;
							} 
							
							if(damnIt >= 9 && damnIt <=10){
								JOptionPane.showConfirmDialog(null, "�, infelizmente deu merda!\n"
										+ tamagotchi.getName() + " Se engasgou e morreu.");
								System.exit(0);
							}
						}
					}
					
					// Eat if the Wish is Higher than 5
					double x = action.eat();
					JOptionPane.showConfirmDialog(null, tamagotchi.getName() + " Engordou: " + x + "kg");
					tamagotchi.setWeight(tamagotchi.getWeight() + x);
					
					break;
				} else {
					break;
				}
			case 2:
				action.sleep();

			case 3:
				action.shower();

			case 4:
				action.play();

			case 5:
				action.study();

			case 6:
				action.workout();

			case 7:
				action.heal();

			case 8:
				action.goOut();

			default:
			}
		}
		JOptionPane.showConfirmDialog(null, "Infelizmente o(a) " + tamagotchi.getName() + "morreu");
		System.exit(0);
	}
}
