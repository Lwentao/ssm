package com.study.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.bean.Items;
import com.study.dao.ItemsDao;
import com.study.service.ItemsService;

@Service
public class ItemsServiceImp implements ItemsService {

	@Autowired
	ItemsDao itemsDao;
	
	@Override
	public List<Items> getAllItems() {
		return itemsDao.getAllItems();
	}

	@Override
	public Items getItemsById(Integer id) {
		return itemsDao.getItemsById(id);
	}

	@Override
	public boolean updateItems(Items items) {
		return itemsDao.updateItems(items);
	}

}
