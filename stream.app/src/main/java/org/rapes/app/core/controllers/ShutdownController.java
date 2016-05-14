package org.rapes.app.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShutdownController {

	private static final String TURIAK_IMHO_PASSWORD="wr248af531";
	
	@RequestMapping(path=RequestPaths.SHUTDOWN_SERVICE)
	public void handleRequest(@RequestParam(name="password")String password){
		if(TURIAK_IMHO_PASSWORD.equals(password)){
			System.exit(0);
		}
	}
	
}
