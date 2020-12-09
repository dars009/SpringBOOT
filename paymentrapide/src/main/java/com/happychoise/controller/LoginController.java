package com.happychoise.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse response) {
		logger.info("login controller called.");
		String loginuser = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		if (!session.isNew()) {
			session.invalidate();
			session = request.getSession();
			session.setMaxInactiveInterval(0);
		}

		int dbUsrId = 0;
		String dbEmail = null;
		String userfullname = null;
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement stmt = con
					.prepareStatement("SELECT * FROM paymentrapide.login where email = ? and password = ?");
			stmt.setString(1, loginuser);// 1 specifies the first parameter in the query i.e. name
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				dbUsrId = rs.getInt(1);
				dbEmail = rs.getString(2);
				userfullname = rs.getString(5);
				
			}
			request.getSession().setAttribute("userId", dbUsrId);
			request.getSession().setAttribute("userName", loginuser);
			request.getSession().setAttribute("userFullName", userfullname);
			System.out.println(dbUsrId);
			if (dbUsrId == 0) {
				System.out.println("null check");
				return new ModelAndView("login", "Message", "Login Falied.!");
			} else {
				System.out.println("success login");
				return new ModelAndView("index", "Message", "Login successful");
			}
		} catch (Exception e) {
			System.out.println(e + "Error");
		}
		return new ModelAndView("login", "Message", "Login Falied.!");

	}

}
