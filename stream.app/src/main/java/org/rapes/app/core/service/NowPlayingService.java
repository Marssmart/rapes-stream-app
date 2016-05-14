package org.rapes.app.core.service;

import java.io.IOException;

import org.apache.http.ParseException;

public interface NowPlayingService {

	public String getActualNowPlaying() throws ParseException, IOException;
}
