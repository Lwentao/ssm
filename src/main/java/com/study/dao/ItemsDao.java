package com.study.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.bean.Items;

@Repository
public interface ItemsDao {
	public List<Items> getAllItems();
	
	public Items getItemsById(Integer id);
	
	public boolean updateItems(Items item);
}
