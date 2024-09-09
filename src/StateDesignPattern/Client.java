package StateDesignPattern;

import java.util.ArrayList;
import java.util.List;

import StateDesignPattern.VendingStates.State;

public class Client {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		populateInventory(vm);
		
		try {
			State vendingState = vm.getState();
			
			vendingState.pressInsertCashButton(vm);
			
			vendingState = vm.getState();
			List<Coin> coinList = new ArrayList<>();
			coinList.add(Coin.PENNY);
			coinList.add(Coin.QUARTER);
			vendingState.insertCash(vm, coinList);
			
			vendingState = vm.getState();
			vendingState.pressSelectProductButton(vm);
			
			vendingState = vm.getState();
			vendingState.chooseProduct(vm, 103);
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	public static void populateInventory(VendingMachine vm) {
		ItemInventory inventory = vm.getInventory();
		List<ItemShelf> listItemShelf = inventory.getItemList();
		
		for(int i = 0; i<15; i++) {
			if(i >= 0 && i < 5) {
				Item item = new Item(30, ItemType.COCACOLA);
				ItemShelf itemShelf = new ItemShelf(item, 101, true);
				listItemShelf.add(itemShelf);
			}
			else if(i > 5 && i <= 10) {
				Item item = new Item(35, ItemType.PEPSI);
				ItemShelf itemShelf = new ItemShelf(item, 102, true);
				listItemShelf.add(itemShelf);
			}
			else {
				Item item = new Item(32, ItemType.SPRITE);
				ItemShelf itemShelf = new ItemShelf(item, 103, true);
				listItemShelf.add(itemShelf);
			}
		}
		inventory.setItemList(listItemShelf);
		vm.setInventory(inventory);
	}
}
