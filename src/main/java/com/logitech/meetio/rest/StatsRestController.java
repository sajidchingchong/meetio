package com.logitech.meetio.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.logitech.meetio.pojo.Game;
import com.logitech.meetio.pojo.Stats;
import com.logitech.meetio.service.StatsService;

import jakarta.validation.Valid;

@RestController
public class StatsRestController {

	Logger logger = LoggerFactory.getLogger(StatsRestController.class);

	@Autowired
	private StatsService service;

	@PostMapping("/played/{gameId}")
	@ResponseStatus(value = HttpStatus.OK)
	public void play(@PathVariable long gameId, @RequestBody @Valid Stats stats) {
		stats.setGameId(gameId);

		logger.debug(stats.toString());

		service.setStats(stats);
	}

	@GetMapping("/popular")
	public List<Game> popular() {
		return service.getPopularGames();
	}

}
