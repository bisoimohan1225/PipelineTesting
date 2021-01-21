package com.techlearning.mysqltestingapi.itemlist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public List<Item> getItemList() {
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}

	public void addItem(Item item) {
		itemRepository.save(item);
	}

	/*public void updateItem(Iterable<Integer> itemID, Item item) {
		if(((Object) itemRepository.findAllById(itemID)).equals(itemID)) {
			itemRepository.save(itemID, item);
		}else {
			itemRepository.save(item);
		}
			
	}*/

}
