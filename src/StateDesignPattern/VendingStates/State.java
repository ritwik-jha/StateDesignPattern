package StateDesignPattern.VendingStates;

import java.util.List;

import StateDesignPattern.Coin;
import StateDesignPattern.ItemShelf;
import StateDesignPattern.VendingMachine;

public interface State {
	public void pressInsertCashButton(VendingMachine vm) throws Exception;
	
	public void insertCash(VendingMachine vm, List<Coin> insertedCoins) throws Exception;
	
	public void pressSelectProductButton(VendingMachine vm) throws Exception;
	
	public void cancelOrRefund(VendingMachine vm) throws Exception;
	
	public void chooseProduct(VendingMachine vm, int code) throws Exception;
	
	public void returnChange(VendingMachine vm, ItemShelf item) throws Exception;
	
	public void proudctDispense(VendingMachine vm, int code) throws Exception;
}
