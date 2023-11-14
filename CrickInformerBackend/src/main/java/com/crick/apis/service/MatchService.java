package com.crick.apis.service;

import java.util.List;
import java.util.Map;

import com.crick.apis.entities.Match;

public interface MatchService {
	
	List<Match> getAllMatches();

	List<Match> getLiveMatches();
	
	List<List<String>> getPointTable();
	
}
