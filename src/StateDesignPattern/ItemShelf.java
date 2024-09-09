package StateDesignPattern;

public class ItemShelf {
	private Item item;
	private int code;
	private boolean itemAvailable;
	
	public ItemShelf(Item item, int code, boolean avail) {
		this.item = item;
		this.code = code;
		this.itemAvailable = avail;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public boolean isItemAvailable() {
		return itemAvailable;
	}
	public void setItemAvailable(boolean itemAvailable) {
		this.itemAvailable = itemAvailable;
	}
	
	
}
