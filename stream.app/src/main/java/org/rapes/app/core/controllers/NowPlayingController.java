package org.rapes.app.core.controllers;

import java.io.IOException;

import org.apache.http.ParseException;
import org.rapes.app.core.service.NowPlayingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NowPlayingController {

	private static final Logger LOG = LoggerFactory.getLogger(NowPlayingController.class);
	
	@Autowired
	private NowPlayingService nowPlayingService;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET,value = RequestPaths.NOW_PLAYING_SERVICE)
	public String handleRequest(){
		
		String nowPlaying = null;
		try {
			nowPlaying = nowPlayingService.getActualNowPlaying();
		} catch (ParseException e) {
			LOG.error("Error while parsing",e);
		} catch (IOException e) {
			LOG.error("Error while requesting: ",e);
		}
		
		return nowPlaying;
	}
}
