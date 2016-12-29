package com.jeasen.Event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class AfterInsertFilmEvent extends ApplicationEvent {

	public AfterInsertFilmEvent(Object source) {
		super(source);
	}


}
