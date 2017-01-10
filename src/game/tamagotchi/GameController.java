package game.tamagotchi;

import javax.swing.JOptionPane;

public class GameController {
	private String time;
	private boolean alive;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public GameController() {
		setTime("07:35");
		setAlive(false);
	}

	public void beggining() {
		JOptionPane.showMessageDialog(null,
				"Olá, Bem-Vindo ao Tamagotchi, jogue esta divertida versão do maior classico da sua infância.");
		JOptionPane.showMessageDialog(null,
				"Lembre-se, este é um jogo que está em fase beta, por favor, se encontrar algum bug ou erro, informar ao dono do jogo.");
	}

	public void ending() {
		JOptionPane.showMessageDialog(null,
				"Puts, infelizmente o jogo terminou pra você, não deixe de voltar e tentar cuidar melhor do seu tamagotchi xD");
		JOptionPane.showMessageDialog(null,
				"Lembre-se, este é um jogo que está em fase beta, por favor, se encontrar algum bug ou erro, informar ao dono do jogo.");
	}

	public void credits() {
		JOptionPane.showMessageDialog(null,
				"Jogo desenvolvido por Júlio César Boll. \nEmail para contato: juliocesarboll@gmail.com");
	}

	public void close() {
		credits();
		System.exit(0);
	}

	public Tamagotchi born() {
		Tamagotchi tamagotchi = new Tamagotchi(JOptionPane.showInputDialog("Digite o nome do seu novo Tamagotchi."));
		setAlive(true);

		return tamagotchi;
	}

	public void die() {
		setAlive(false);
		endGame();
	}

	public Tamagotchi startGame() {
		beggining();
		Tamagotchi tamagotchi = born();
		setAlive(true);

		return tamagotchi;
	}

	public void endGame() {
		ending();
		credits();
		close();
	}
}
