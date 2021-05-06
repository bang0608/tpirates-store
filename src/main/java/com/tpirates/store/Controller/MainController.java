package com.tpirates.store.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//import com.tpirates.store.service.StoreService;

/**
 * Handles requests for the application home page.
 */

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getMainPage() {
		return "main";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getRegisterPage() {
		return "register";
	}
	
}
