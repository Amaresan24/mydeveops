package com.example.Mydevelop_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevelopController {

	@GetMapping(value = "/get_data")
	public String getData() {
		return "my first Jenkins Project";
	}

}
