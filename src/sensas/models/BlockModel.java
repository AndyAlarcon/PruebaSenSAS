package sensas.models;

public class BlockModel {

	
	private char firstLetter;
	private char secondLetter;
	private boolean available;
	private int both;
	
	public BlockModel() {
		
	}

	public BlockModel(char firstLetter, char secondLetter, boolean available, int both) {
		super();
		this.firstLetter = firstLetter;
		this.secondLetter = secondLetter;
		this.available = available;
		this.both = both;
	}

	public char getFirstLetter() {
		return firstLetter;
	}

	public void setFirstLetter(char firstLetter) {
		this.firstLetter = firstLetter;
	}

	public char getSecondLetter() {
		return secondLetter;
	}

	public void setSecondLetter(char secondLetter) {
		this.secondLetter = secondLetter;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getBoth() {
		return both;
	}

	public void setBoth(int both) {
		this.both = both;
	}

	@Override
	public String toString() {
		return "BlockModel [firstLetter=" + firstLetter + ", secondLetter=" + secondLetter + ", available=" + available
				+ ", both=" + both + "]";
	}

	

	
	
	
}
