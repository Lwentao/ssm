package com.study.service;

import java.util.List;

import com.study.bean.Items;

public interface ItemsService {

	public List<Items> getAllItems();

	public Items getItemsById(Integer id);

	public boolean updateItems(Items items);
}
