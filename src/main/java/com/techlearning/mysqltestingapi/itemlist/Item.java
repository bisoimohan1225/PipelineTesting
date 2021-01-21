package com.techlearning.mysqltestingapi.itemlist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int itemID;
	private String itemUniquID;
	private String itemName;
	private String itemType;
	private String itemDesc;
	
	public Item() {
	}
	
	public Item(int itemID, String itemName, String itemType, String itemDesc, String itemUniquID) {
		super();
		this.itemID = itemID;
		this.itemUniquID=itemUniquID;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemDesc = itemDesc;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemUniquID() {
		return itemUniquID;
	}

	public void setItemUniquID(String itemUniquID) {
		this.itemUniquID = itemUniquID;
	}

	
}
