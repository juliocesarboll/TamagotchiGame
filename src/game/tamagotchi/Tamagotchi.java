package game.tamagotchi;

public class Tamagotchi {
	private String name;
	private int age;
	private double weight;
	private int wish;
	
	public Tamagotchi(String name){
		this.name = name;
		this.age = 1;
		this.weight = 1.0;
		this.wish = 0;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getWish() {
		return wish;
	}

	public void setWish(int wish) {
		this.wish = wish;
	}

	@Override
	public String toString() {
		return "Tamagotchi [name=" + name + ", age=" + age + ", weight=" + weight + ", wish=" + wish + "]";
	}
	
	
		
}
