package com.fdc.twi.controller.secure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecuredController {

	@RequestMapping(method=RequestMethod.GET)
	public String get() {
		return "This is secured get";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String post() {
		return "This is secured post";
	}
}
