package game.tamagotchi.classes;

import javax.swing.JOptionPane;

public class Tamagotchi {
	private String name;
	private String feeling;
	private int age;
	private int weight;
	private int dirty;
	private int money;
	private int energy;
	private double knowledge;
	private double muscle;

	public Tamagotchi(String name) {
		setName(name);
		setAge(1);
		setWeight(1);
		setKnowledge(0.8);
		setDirty(1);
		setMuscle(0.3);
		setMoney(20);
		setEnergy(10);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getFeeling() {
		return feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}

	public double getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(double knowledge) {
		this.knowledge = knowledge;
	}

	public int getDirty() {
		return dirty;
	}

	public void setDirty(int dirty) {
		this.dirty = dirty;
	}

	public double getMuscle() {
		return muscle;
	}

	public void setMuscle(double muscle) {
		this.muscle = muscle;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void eat() {
		if (getMoney() >= 1) {
			int temp = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha dentre as opções:\n1- Comer pouco. Custo: $1\n2-Comer o suficiente. Custo: $3\n3-Comer muito. Custo: $5"));

			switch (temp) {
			case 1:
				if (getMoney() >= 1) {
					setWeight(getWeight() + 1);
					temp = 1;
					if (getEnergy() < 10)
						setEnergy(getEnergy() + 1);
					setDirty(getDirty() + 1);
					setMoney(getMoney() - 1);
				}
				break;
			case 2:
				if (getMoney() >= 3) {
					setWeight(getWeight() + 3);
					temp = 3;
					if (getEnergy() < 10)
						setEnergy(getEnergy() + 2);
					if (getEnergy() > 10)
						setEnergy(10);
					setDirty(getDirty() + 1);
					setMoney(getMoney() - 3);
				}
				break;
			case 3:
				if (getMoney() >= 5) {
					setWeight(getWeight() + 5);
					temp = 3;
					if (getEnergy() < 10)
						setEnergy(getEnergy() - 1);
					setDirty(getDirty() + 2);
					setMoney(getMoney() - 5);
				}
				break;
			}

			JOptionPane.showMessageDialog(null, getName() + " encheu a pança.");
		} else {
			JOptionPane.showMessageDialog(null, getName() + " não tem dinheiro para comer.");
		}
	}

	public void sleep() {
		if (getEnergy() <= 3) {
			setAge(getAge() + 1);
			setEnergy(10);
			setMoney(getMoney() + 1);
			setDirty(getDirty() + 2);
			setWeight(getWeight() - 1);
			JOptionPane.showMessageDialog(null, getName() + " foi dormir.");

		} else {
			JOptionPane.showMessageDialog(null, getName() + " está muito agitado para ir dormir.");
		}
	}

	public void study() {
		if (getEnergy() >= 2 && getMoney() >= 1) {
			setKnowledge(getKnowledge() + 0.2);
			setEnergy(getEnergy() - 2);
			setMoney(getMoney() - 1);
			JOptionPane.showMessageDialog(null, getName() + " ficou mais esperto.");
		} else {
			JOptionPane.showMessageDialog(null, getName() + " está muito cansado ou sem dinheiro para estudar.");
		}
	}

	public void shower() {
		if (getDirty() >= 4) {
			setDirty(getDirty() - 3);
			JOptionPane.showMessageDialog(null, getName() + " ficou mais limpo.");
		} else {
			JOptionPane.showMessageDialog(null, getName() + " não precisa tomar banho ainda.");
		}
	}

	public void workOut() {
		if (getEnergy() >= 4 && getMoney() >= 2) {
			setMuscle(getMuscle() + 0.4);
			setDirty(getDirty() + 4);
			setEnergy(getEnergy() - 3);
			setMoney(getMoney() - 2);
			setWeight(getWeight() - 3);
			JOptionPane.showMessageDialog(null, getName() + " ficou mais forte.");
		} else {
			JOptionPane.showMessageDialog(null, getName() + " está muito cansado ou sem dinheiro para treinar.");
		}
	}

	public void work() {
		if (getEnergy() >= 3 && getDirty() <= 4) {
			setMoney(getMoney() + 5);
			setWeight(getWeight() - 1);
			setEnergy(getEnergy() - 2);
			setDirty(getDirty() + 2);
			setKnowledge(getKnowledge() + 0.1);
			JOptionPane.showMessageDialog(null, getName() + " trabalhou bastante.");
		} else {
			JOptionPane.showMessageDialog(null, getName() + " está muito cansado ou sujo para ir trabalhar.");
		}
	}
}
