public class Cat {
	// public was uppercase
	// instance variables
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	// fix spelling
	// 2-Parameter Constructor
	// added parameters
	// constructors
	public Cat(String name, String breed, boolean isHungry, int livesRemaining) {
		this.name = name;
		this.breed = breed;
		// this.hungry = yes is wrong, it must = isHungry
		this.isHungry = isHungry;
		livesRemaining = 9;
	}
	// getters
	public String getName() {
		return name;
	}

	public boolean getIsHungry() {
		return isHungry;
	}

	public boolean getFeed() {
		return isHungry;
	}
	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	// added missing setters
	public void setIsHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	// methods
	public void setLivesRemaining(int livesRemaining) {
		this.livesRemaining = livesRemaining;
	}

	public boolean equals(Cat other) {
		return this.name == other.name && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining;
	}

	public String toString(String name, String breed, int livesRemaining) {
		System.out.println(name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
		return breed;
	}
}