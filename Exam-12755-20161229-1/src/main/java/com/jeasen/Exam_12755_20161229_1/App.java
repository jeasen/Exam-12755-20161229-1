package com.jeasen.Exam_12755_20161229_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jeasen.servie.FilmServiceImpl;
import com.sun.tools.javadoc.Start;

/**
 * Hello world!
 *
 */
public class App {

	private AbstractApplicationContext context;
	private FilmServiceImpl filmService;

	public App() {
		start();
	}

	private void start() {
		context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		context.start();
		filmService = (FilmServiceImpl) context.getBean("filmService");
		int i = filmService.addFilm();
		if (i == 1) {
			context.close();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new App();
	}
}
