package StateDesignPattern;

import java.util.ArrayList;
import java.util.List;

import StateDesignPattern.VendingStates.IdleState;
import StateDesignPattern.VendingStates.State;

public class VendingMachine {
	private State state;
	private List<Coin> coinList;
	private ItemInventory inventory;
	
	VendingMachine(){
		state = new IdleState();
		coinList = new ArrayList<>();
		inventory = new ItemInventory();
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public List<Coin> getCoinList() {
		return coinList;
	}
	public void setCoinList(List<Coin> coinList) {
		this.coinList = coinList;
	}
	public ItemInventory getInventory() {
		return inventory;
	}
	public void setInventory(ItemInventory inventory) {
		this.inventory = inventory;
	}
	
	
}
