package StateDesignPattern.VendingStates;

import java.util.List;

import StateDesignPattern.Coin;
import StateDesignPattern.ItemShelf;
import StateDesignPattern.VendingMachine;

public class IdleState implements State {
	public void pressInsertCashButton(VendingMachine vm) throws Exception {
		System.out.println("insert cash button pressed -> changing state");
		vm.setState(new AcceptMoneyState());
	};
	
	public void insertCash(VendingMachine vm, List<Coin> insertedCoins) throws Exception{
		throw new Exception("Action not allowed");
	}
	
	public void pressSelectProductButton(VendingMachine vm) throws Exception{
		throw new Exception("Action not allowed");
	}
	
	public void cancelOrRefund(VendingMachine vm) throws Exception{
		throw new Exception("Action not allowed");
	}
	
	public void chooseProduct(VendingMachine vm, int code) throws Exception{
		throw new Exception("Action not allowed");
	}
	
	public void returnChange(VendingMachine vm, ItemShelf item) throws Exception{
		throw new Exception("Action not allowed");
	}
	
	public void proudctDispense(VendingMachine vm, int code) throws Exception{
		throw new Exception("Action not allowed");
	}
}
