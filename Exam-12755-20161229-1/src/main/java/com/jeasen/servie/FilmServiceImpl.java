package com.jeasen.servie;

import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.jeasen.mapper.FilmMapper;
import com.jeasen.pojo.Film;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	FilmMapper filmdao;

	

	@Override
	public int addFilm() {

		Scanner scanner = new Scanner(System.in);
		Film film = new Film();
		System.out.println("请输入title:");
		String title = scanner.next();
		System.out.println("请输入description:");
		String description = scanner.next();
		System.out.println("请输入language_id):");
		byte by = scanner.nextByte();
		film.setLanguageId(by);
		film.setTitle(title);
		film.setDescription(description);
		film.setLastUpdate(new Date());

		int i = filmdao.insertSelective(film);
		return i;
	}

}
