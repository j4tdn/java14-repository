package persistence;

import java.util.List;

public class ItemGroupDto {
	
	private Integer itemGroupId;
	private String itemGroupName;
	private Integer amountOfItems;
	private List<ItemDto> items;
	
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer itemGroupId, String itemGroupName, Integer amountOfItems) {
		super();
		this.itemGroupId = itemGroupId;
		this.itemGroupName = itemGroupName;
		this.amountOfItems = amountOfItems;
	}

	public ItemGroupDto(Integer itemGroupId, String itemGroupName, Integer amountOfItems, List<ItemDto> items) {
		super();
		this.itemGroupId = itemGroupId;
		this.itemGroupName = itemGroupName;
		this.amountOfItems = amountOfItems;
		this.items = items;
	}


	public Integer getItemGroupId() {
		return itemGroupId;
	}


	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}


	public String getItemGroupName() {
		return itemGroupName;
	}


	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}


	public Integer getAmountOfItems() {
		return amountOfItems;
	}


	public void setAmountOfItems(Integer amountOfItems) {
		this.amountOfItems = amountOfItems;
	}


	public List<ItemDto> getItems() {
		return items;
	}


	public void setItems(List<ItemDto> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [itemGroupId=" + itemGroupId + ", itemGroupName=" + itemGroupName + ", amountOfItems="
				+ amountOfItems + ", items=" + items + "]";
	}
}
