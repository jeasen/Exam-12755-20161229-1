package com.jeasen.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.jeasen.Event.AfterInsertFilmEvent;
import com.jeasen.Event.BeforeInsertFilmEvent;

public class FilmAspect implements ApplicationContextAware {

	private ApplicationContext ctx = null;

	public ApplicationContext getCtx() {
		return ctx;
	}

	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.ctx = arg0;
	}

	public void doBefore(JoinPoint point) {
		BeforeInsertFilmEvent event = new BeforeInsertFilmEvent("");
		ctx.publishEvent(event);
	}

	public void doAfter(JoinPoint point) {
		AfterInsertFilmEvent event = new AfterInsertFilmEvent("");
		ctx.publishEvent(event);
	}

}
