package StateDesignPattern.VendingStates;

import java.util.List;

import StateDesignPattern.Coin;
import StateDesignPattern.ItemShelf;
import StateDesignPattern.VendingMachine;

public class AcceptMoneyState implements State {
	public void pressInsertCashButton(VendingMachine vm) throws Exception {
		System.out.println("please insert cash");
	};
	
	public void insertCash(VendingMachine vm, List<Coin> insertedCoins) throws Exception{
		if(insertedCoins.isEmpty()) {
			System.out.println("No coins inserted, cancelling the operation");
			cancelOrRefund(vm);
			return;
		}
		vm.setCoinList(insertedCoins);
		System.out.println("Coins inserted proceed to select product");
	}
	
	public void pressSelectProductButton(VendingMachine vm) throws Exception{
		vm.setState(new SelectProductState());
	}
	
	public void cancelOrRefund(VendingMachine vm) throws Exception{
		if(!vm.getCoinList().isEmpty()) {
			System.out.println("Refunding the amount");
			int ans = 0;
			List<Coin> coinList = vm.getCoinList();
			for(Coin coin : coinList) {
				ans += coin.getCoinValue();
			}
			System.out.println("Refund amount: " + ans);
			vm.setCoinList(null);
		}
		System.out.println("Cancelling the operation");
		vm.setState(new IdleState());
		
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
