package com.happychoise.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController 
{
	
	 @RequestMapping(value="/logout",method = RequestMethod.GET)
     public ModelAndView logoutuser(HttpServletRequest request){
		
         HttpSession httpSession = request.getSession();
         httpSession.invalidate();
         
         return new ModelAndView("index", "Message", "Logout successful");
     }


}
