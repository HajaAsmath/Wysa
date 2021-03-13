package com.wysa.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wysa.model.Wysa;
import com.wysa.repository.WysaRepository;
import com.wysa.service.CalculateEfficiency;

@RestController
public class WysaController {
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(WysaController.class);

	
	@Autowired
	CalculateEfficiency calculateEfficiency;
	
	@Autowired
	WysaRepository userRepository;
	
	/*
	 * Register the User in database and returns sleep efficiency
	 * @param Wysa model
	 * @return registered model
	 */
	@RequestMapping(value = "/register",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Wysa registerUser(@Valid @RequestBody Wysa wysa) {
		LOGGER.info("Received a user "+ wysa.getName() +" for registration");
		wysa.setEfficiency(calculateEfficiency.calculateEfficiency(wysa));
		userRepository.save(wysa);
		return wysa;
	}
}
