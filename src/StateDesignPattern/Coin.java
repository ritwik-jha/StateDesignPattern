package StateDesignPattern;

public enum Coin {
	DIME(1),
	PENNY(10),
	QUARTER(25);
	
	private int value;
	Coin(int val){
		this.value = val;
	}
	
	public int getCoinValue() {
		return value;
	}
}
