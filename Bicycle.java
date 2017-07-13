package Ex1;

public class Bicycle {
	private String ownerName;
	private String tagNo;
	public Bicycle() {
		ownerName = "Unknown Owner";
	}
	public String GetOwnerName() {
		return ownerName;
	}
	public void SetOwnerName(String name) {
		ownerName = name;
	}
	public String GetTagNo() {
		return tagNo;
	}
	public void SetTagNo(int number) {
		tagNo = Integer.toString(number);
	}
	
}
