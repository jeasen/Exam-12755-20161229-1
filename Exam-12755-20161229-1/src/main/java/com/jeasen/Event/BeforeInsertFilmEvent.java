package com.jeasen.Event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;

public class BeforeInsertFilmEvent extends ApplicationEvent {

	public BeforeInsertFilmEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}


}
