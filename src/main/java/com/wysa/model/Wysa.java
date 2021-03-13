package com.wysa.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Range;

import com.wysa.customvalidator.GoalConstraint;
import com.wysa.customvalidator.PeriodConstraint;

/*
 * Wysa model for user registration
 */
@Entity(name = "wysa")
public class Wysa {
	@Id
	@Column(name = "id")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	private String id;
	
	@Column(name = "name")
	@NotNull
	private String name;
	
	@Column(name = "goal")
	@NotNull
	@GoalConstraint
	private String goal;
	
	@Column(name = "period")
	@NotNull
	@PeriodConstraint
	private String period;
	
	@Column(name = "sleeptime")
	@NotNull
	private LocalTime sleepTime;
	
	@Column(name = "wakeuptime")
	@NotNull
	private LocalTime wakeUpTime;
	
	@Column(name = "hoursslept")
	@NotNull
	@Range(min = 1, max = 10)
	private Integer hoursSlept;
	
	@Column(name = "Efficiency")
	private Integer efficiency;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public LocalTime getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(LocalTime sleepTime) {
		this.sleepTime = sleepTime;
	}

	public LocalTime getWakeUpTime() {
		return wakeUpTime;
	}

	public void setWakeUpTime(LocalTime wakeUpTime) {
		this.wakeUpTime = wakeUpTime;
	}

	public Integer getHoursSlept() {
		return hoursSlept;
	}

	public void setHoursSlept(Integer hoursSlept) {
		this.hoursSlept = hoursSlept;
	}

	public Integer getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(Integer efficiency) {
		this.efficiency = efficiency;
	}
	
	
	
}
