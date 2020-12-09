package com.happychoise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {

	@RequestMapping("/")
	public String loginMessage() {
		return "login";
	}
	
	@RequestMapping("/dashboard")
	public String loginApp() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String navToLogin() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String navToRegister() {
		return "register";
	}

	@RequestMapping("/payment")
	public String navTopayment() {
		return "payment";
	}
	
	@RequestMapping("/payToMerchantInStore")
	public String navToinStorePurchase() {
		return "payToMerchantInStore";
	}
		
	
	@RequestMapping("/dashboardMerchant")
	public String navToindexMerchant() {
		return "indexMerchant";
	}

	@RequestMapping("/merchPayToMerchant")
	public String navTomerchPayToMerchant() {
		return "merchPayToMerchant";
	}
	
	@RequestMapping("/payToMerchantOnline")
	public String navTopayToMerchantOnline() {
		return "payToMerchantOnline";
	}
	
	@RequestMapping("/payToMerchantPurchaseHistory")
	public String navTopayToMerchantPurchaseHistory() {
		return "payToMerchantPurchaseHistory";
	}
	
		
}
