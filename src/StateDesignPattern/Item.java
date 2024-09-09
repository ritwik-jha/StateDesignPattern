package StateDesignPattern;

public class Item {
	private int price;
	private ItemType itemType;
	
	public Item(int price, ItemType type) {
		this.price = price;
		this.itemType = type;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	
	
}
