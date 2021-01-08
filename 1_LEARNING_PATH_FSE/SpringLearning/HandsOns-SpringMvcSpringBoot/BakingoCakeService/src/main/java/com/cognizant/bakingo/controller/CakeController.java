package com.cognizant.bakingo.controller;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.bakingo.bean.Cake;
import com.cognizant.bakingo.service.CakeService;

@Controller
public class CakeController {

	@Autowired
	private CakeService cakeService;

	// add the code as per the requirement
	@RequestMapping(value = "/showCakeOrderForm", method = RequestMethod.GET)
	public String showCakeOrderForm(@ModelAttribute("cake") Cake cake) {

		return "placeOrder";
	}

	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {

		double price = 0;
		if (result.hasErrors()) {
			return "placeOrder";
		}
		if (CakeService.flavorList.containsKey(cake.getFlavor())) {
			Integer flavorRate = CakeService.flavorList.get(cake.getFlavor());
			if(cake.getIncludeCandles()==null) {
            	cake.setIncludeCandles(0);
            }
            if(cake.getIncludeinscription()==null) {
            	cake.setIncludeinscription(0);
            }
			price = cake.getSelectedcake() + flavorRate + cake.getIncludeCandles() + cake.getIncludeinscription();
			cake.setPrice(price);
			double indianPrice = cake.getPrice() * 75.0;
			int orderId = cakeService.addOrder(cake);
			map.addAttribute("cake", cake);
			map.addAttribute("indianPrice", indianPrice);
			map.addAttribute("orderId", orderId);
			if (orderId >= 1000)
				return "orderStatus";
		}
		return "orderStatus";
	}

	@ModelAttribute("flavorList")
	public Set<String> populateFillingList() {
		return CakeService.flavorList.keySet();
	}

}
