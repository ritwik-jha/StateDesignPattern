package StateDesignPattern.VendingStates;

import java.util.List;

import StateDesignPattern.Coin;
import StateDesignPattern.ItemShelf;
import StateDesignPattern.VendingMachine;

public class SelectProductState implements State {
	public void pressInsertCashButton(VendingMachine vm) throws Exception {
		throw new Exception("Action not allowed");
	}
	
	public void insertCash(VendingMachine vm, List<Coin> insertedCoins) throws Exception{
		throw new Exception("Action not allowed");
	}
	
	public void pressSelectProductButton(VendingMachine vm) throws Exception{
		throw new Exception("Action not allowed");
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
		List<ItemShelf> itemList = vm.getInventory().getItemList();
		
		for(ItemShelf itemShelf : itemList) {
			if(code == itemShelf.getCode() && itemShelf.isItemAvailable()) {
				itemShelf.setItemAvailable(false);
				
				returnChange(vm, itemShelf);
				return;
			}
		}
		System.out.println("Product not available");
		cancelOrRefund(vm);
	}
	
	public void returnChange(VendingMachine vm, ItemShelf item) throws Exception{
		int totalMoney = 0;
		List<Coin> coinList = vm.getCoinList();
		for(Coin coin : coinList) {
			totalMoney += coin.getCoinValue();
		}
		
		if(totalMoney < item.getItem().getPrice()) {
			System.out.println("Insufficient funds");
			cancelOrRefund(vm);
			return;
		}
		
		if(totalMoney > item.getItem().getPrice()) {
			System.out.println("Returing change");
			int returnAmount = totalMoney - item.getItem().getPrice();
			int coinCount = 0;
			
			while(returnAmount != 0) {
				coinCount++;
				returnAmount--;
			}
			System.out.println("No of pennies: " + coinCount);
		}
		
		vm.setState(new DispenseProductState(vm, item.getCode()));
		
	}
	
	public void proudctDispense(VendingMachine vm, int code) throws Exception{
		throw new Exception("Action not allowed");
	}
}
