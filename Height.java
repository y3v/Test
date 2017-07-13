package Ex2;

public class Height {
	private double height;
	private int age;
	public void SetHeight(double height) {
		this.height = height;
	}
	public void SetAge(int age) {
		this.age = age;
	}
	public double GetHeight() {
		return height;
	}
	public int GetAge() {
		return age;
	}
	public double RecommendedWeight() {
		return (height - 100 + age /10) * 0.9;
	}
}
