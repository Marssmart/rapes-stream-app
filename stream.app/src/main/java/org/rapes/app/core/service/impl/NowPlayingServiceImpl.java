package org.rapes.app.core.service.impl;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.rapes.app.core.config.ContextConfiguration;
import org.rapes.app.core.service.NowPlayingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NowPlayingServiceImpl implements NowPlayingService {

	@Autowired
	@Qualifier(ContextConfiguration.BASIC_HTTP_CLIENT)
	private HttpClient client;

	public String getActualNowPlaying() throws ParseException, IOException {
		HttpGet request = new HttpGet("http://www.rapes.sk/jazler.php");
		request.addHeader("Content-Type", "text/html; charset=UTF-8");
		
		HttpResponse response = client.execute(request);
		
		HttpEntity entity = response.getEntity();

		if (entity != null) {
			return EntityUtils.toString(entity);
		}else{
			return null;
		}
	}
}
