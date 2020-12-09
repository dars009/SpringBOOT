package com.happychoise.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.happychoise.configuration.ConnectionUtil;

@Controller
public class PayToMerchantController {

	private static final Logger logger = Logger.getLogger(PayToMerchantController.class);

	@RequestMapping(value = "/payToMerchant", method = RequestMethod.POST)
	public ModelAndView payToMerchant(HttpServletRequest request, HttpServletResponse response) {
		String message = null;
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(
					"insert into paymentrapide.order (id, order_type, merchant_name, product_detail, order_amount) values (?,?,?,?,?)");
			stmt.setInt(1, Integer.parseInt(request.getParameter("userid")));
			stmt.setString(2, request.getParameter("purchaseType"));
			stmt.setString(3, request.getParameter("merchant"));
			stmt.setString(4, request.getParameter("product_detail"));
			stmt.setInt(5, Integer.parseInt(request.getParameter("amount")));
			int rs = stmt.executeUpdate();
			if(rs>0) {
				message = "Congratulations! Your order placed successfully..!";
				request.setAttribute("Message", message);   
				HttpSession session = request.getSession(false);
				session.setAttribute("Message", message);
				return new ModelAndView("payToMerchantInStore", "Message", "Congratulations! Your order placed successfully..!");
			} else {
				System.out.println("Order Failed..!");
				return new ModelAndView("payToMerchantInStore", "Message", "Order failed please try again after sometime..!");
			}
		} catch (Exception e) {
			System.out.println(e + "Error");
		}
		return new ModelAndView("payToMerchantInStore", "Message", "Order failed please try again after sometime..!");

	}
	
	
	
	
	
	
	@RequestMapping(value = "/payToMerchantOnline", method = RequestMethod.POST)
	public ModelAndView payToMerchantOnline(HttpServletRequest request, HttpServletResponse response) {
		String message = null;
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(
					"insert into paymentrapide.order (id, order_type, merchant_name, product_detail, order_amount,emi_tenure) values (?,?,?,?,?,?)");
			stmt.setInt(1, Integer.parseInt(request.getParameter("userid")));
			stmt.setString(2, request.getParameter("purchaseType"));
			stmt.setString(3, request.getParameter("merchant"));
			stmt.setString(4, request.getParameter("product_detail"));
			stmt.setInt(5, Integer.parseInt(request.getParameter("amount")));
			stmt.setInt(6, Integer.parseInt(request.getParameter("emi_tenure")));
			int rs = stmt.executeUpdate();
			if(rs>0) {
				message = "Congratulations! Your order placed successfully..!";
				request.setAttribute("Message", message);   
				HttpSession session = request.getSession(false);
				session.setAttribute("Message", message);
				return new ModelAndView("payToMerchantOnline", "Message", "Congratulations! Your order placed successfully..!");
			} else {
				System.out.println("Order Failed..!");
				return new ModelAndView("payToMerchantOnline", "Message", "order Failed..!");
			}
		} catch (Exception e) {
			System.out.println(e + "Error");
		}
		return new ModelAndView("payToMerchantOnline", "Message", "order Failed..!");
	}
}
