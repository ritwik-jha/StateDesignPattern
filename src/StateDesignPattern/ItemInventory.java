package StateDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ItemInventory {
	private List<ItemShelf> itemList;
	
	public ItemInventory() {
		this.itemList = new ArrayList<>();
	}

	public List<ItemShelf> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemShelf> itemList) {
		this.itemList = itemList;
	}
	
	
}
