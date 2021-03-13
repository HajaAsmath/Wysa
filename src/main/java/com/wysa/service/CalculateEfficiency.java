package com.wysa.service;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wysa.model.Wysa;
import com.wysa.repository.WysaRepository;

/*
 * Efficiencty Calculator
 */
@Service
public class CalculateEfficiency {
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(CalculateEfficiency.class);
	
	@Autowired
	WysaRepository repository;
	
	public static final Integer MIN = 60;
	
	/*
	 * To calculate sleep efficiency
	 * @param the Wysa model
	 * @return the Sleep Efficiency
	 */
	public Integer calculateEfficiency(Wysa wysa) {
		LOGGER.info("Calculating efficiency for user");
		Duration duration = Duration.between(wysa.getSleepTime(), wysa.getWakeUpTime());
		long difference = duration.toMinutes();
		Integer hoursSleptInMin = wysa.getHoursSlept() * MIN;
		// Note: formula may vary
		return (int) (hoursSleptInMin/difference) * 100;
	}
	
}
