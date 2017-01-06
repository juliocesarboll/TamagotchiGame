package game.tamagotchi;

import java.util.Random;

public class Action implements Wishes {
	private int number;

	public Action() {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumero(int number) {
		this.number = number;
	}

	@Override
	public double eat() {
		// Fatter
		Random random = new Random();
		double ret = random.nextInt(100);
		ret = ret/100;
		ret += 1.0;
		return ret;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shower() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void workout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double heal() {
		// Skinnier
		Random random = new Random();
		double ret = random.nextInt(100);
		ret = ret/100;
		return ret;
	}

	@Override
	public void goOut() {
		// TODO Auto-generated method stub
		
	}


}
