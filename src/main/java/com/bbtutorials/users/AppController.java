package com.bbtutorials.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbtutorials.users.controller.UsersController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class AppController {
	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(AppController.class);
	
	@RequestMapping({"/"})
	public String loadUI() {
		log.info("loading UIssdd");
		return "forward:/index.html";
	}

}
