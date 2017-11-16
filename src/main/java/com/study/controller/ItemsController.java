package com.study.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.bean.Items;
import com.study.service.ItemsService;

@Controller
public class ItemsController {

	@Autowired
	ItemsService itemsService;
	
	/**
	 * 
	 * @return 返回ModelAndView
	 */
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() {
		List<Items> allItems = itemsService.getAllItems();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", allItems);
		modelAndView.setViewName("itemsList");
		return modelAndView;
	}
	
	/**
	 * 
	 * @return 返回String(ModelAndView中view的名字)
	 */
	@RequestMapping("/editorItem")
	public String queryItemsById(Map<String, Object> model,@RequestParam(value="id")Integer id) {
		System.out.println(id);
		Items itemsById = itemsService.getItemsById(id);
		model.put("item", itemsById);
		return "editorItem";
	}
	
	/**
	 * 限定请求方式，只接受post请求
	 * 返回void， 直接在函数最后跳转页面
	 */
	@RequestMapping(value="/updateItem", method=RequestMethod.POST)
	public void updatItems(HttpServletRequest request, HttpServletResponse response, Items item) {
		System.err.println(item.toString());
		itemsService.updateItems(item);
		request.setAttribute("item", item);
		try {
			request.getRequestDispatcher("/WEB-INF/pages/editorItem.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
}
