package com.logitech.meetio.rest;

import java.io.IOException;
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

import com.logitech.meetio.error.ResourceNotFoundException;
import com.logitech.meetio.pojo.Game;
import com.logitech.meetio.service.GameService;

import jakarta.validation.Valid;

@RestController
public class GameRestController {

	Logger logger = LoggerFactory.getLogger(GameRestController.class);

	@Autowired
	private GameService service;

	@GetMapping("/games")
	public List<Game> games() {
		return service.getGames();
	}

	@GetMapping("/game/{id}")
	public Game game(@PathVariable long id) throws ResourceNotFoundException, IOException {
		return service.getGame(id);
	}

	@PostMapping("/game")
	@ResponseStatus(value = HttpStatus.OK)
	public void game(@RequestBody @Valid Game game) {
		logger.debug(game.toString());

		// User group based authentication should be implemented for this end point.
		service.setGame(game);
	}

}
