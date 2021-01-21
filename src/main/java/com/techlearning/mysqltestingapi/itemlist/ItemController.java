package com.techlearning.mysqltestingapi.itemlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/getItemList")
	public List<Item> getItemList(){
		return itemService.getItemList();
	}
	@RequestMapping(method = RequestMethod.POST, value="/itemlist")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	/*
	@RequestMapping(method = RequestMethod.PUT, value="/itemlist")
	public void updateItem(@PathVariable Iterable<Integer> itemID, @RequestBody Item item) {
		itemService.updateItem(itemID, item);
	}*/
	
}
