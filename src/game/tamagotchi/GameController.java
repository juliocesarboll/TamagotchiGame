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
				"Ol�, Bem-Vindo ao Tamagotchi, jogue esta divertida vers�o do maior classico da sua inf�ncia.");
		JOptionPane.showMessageDialog(null,
				"Lembre-se, este � um jogo que est� em fase beta, por favor, se encontrar algum bug ou erro, informar ao dono do jogo.");
	}

	public void ending() {
		JOptionPane.showMessageDialog(null,
				"Puts, infelizmente o jogo terminou pra voc�, n�o deixe de voltar e tentar cuidar melhor do seu tamagotchi xD");
		JOptionPane.showMessageDialog(null,
				"Lembre-se, este � um jogo que est� em fase beta, por favor, se encontrar algum bug ou erro, informar ao dono do jogo.");
	}

	public void credits() {
		JOptionPane.showMessageDialog(null,
				"Jogo desenvolvido por J�lio C�sar Boll. \nEmail para contato: juliocesarboll@gmail.com");
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
