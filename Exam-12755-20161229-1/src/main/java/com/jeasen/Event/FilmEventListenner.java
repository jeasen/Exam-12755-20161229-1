package com.jeasen.Event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;

public class FilmEventListenner implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		if (event instanceof BeforeInsertFilmEvent) {
			System.out.println("before Insert Film Data ");
		} else if (event instanceof AfterInsertFilmEvent) {
			System.out.println("After Insert Film Data ");
		}else if (event instanceof ContextStartedEvent) {
			System.out.println("Context Start ");
		}else if (event instanceof ContextClosedEvent) {
			System.out.println("Context Stop ");
		}

	}

}
