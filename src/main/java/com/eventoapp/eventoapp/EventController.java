package com.eventoapp.eventoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {
	
	@RequestMapping("/cadastrarEvento")
	public String form() {
		return"evento/formEvento";
	}
}
