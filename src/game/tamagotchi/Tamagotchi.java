package game.tamagotchi;

public class Tamagotchi {
	private String name;
	private int age;
	private String feeling;
	private double weight;
	private String lastWish;
	private String nextWish;
	private double knowledge;
	private int dirty;
	private double muscle;
	
	public Tamagotchi(String name){
		setName(name);
		setAge(1);
		setWeight(0.5);
//		setFeeling();
//		setLastWish();
		setKnowledge(0.8);
		setDirty(1);
		setMuscle(0.3);
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
	public String getFeeling() {
		return feeling;
	}
	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}
	public String getLastWish() {
		return lastWish;
	}
	public void setLastWish(String lastWish) {
		this.lastWish = lastWish;
	}
	public String getNextWish() {
		return nextWish;
	}
	public void setNextWish(String nextWish) {
		this.nextWish = nextWish;
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
	
}
