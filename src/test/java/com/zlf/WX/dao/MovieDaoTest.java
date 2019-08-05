package com.zlf.WX.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zlf.WX.entity.Movie;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovieDaoTest {

	
	@Autowired
	private MovieDao movieDao;

	@Test
	@Ignore
	public void QueryMovie() {
		List<Movie> movieList = movieDao.queryMovie();

		assertEquals(2, movieList.size());
	}
	
	@Test
	@Ignore
	public void InsertMovie() {

		Movie movie = new Movie();
		movie.setName("范伊旋");
		movie.setActor("她本傻子");
		movie.setYear(2000);

		int effectedNum = movieDao.insertMovie(movie);

		assertEquals(1, effectedNum);

		List<Movie> movieList = movieDao.queryMovie();
		assertEquals(3, movieList.size());
	}

	@Test
	@Ignore
	public void QueryMovieById() {
		Movie movie = movieDao.queryMovieById(2);
		assertEquals("harry potter", movie.getName());
	}

	@Test
	@Ignore
	public void UpateMovie() {
		List<Movie> movieList = movieDao.queryMovie();
		for (Movie movie : movieList) {
			if ("harry potter".equals(movie.getName())) {

				assertEquals(2033, movie.getYear().intValue());
				movie.setYear(2020);
				int effectedNum = movieDao.updateMovie(movie);
				assertEquals(1, effectedNum);
			}
		}
	}

	@Test
	@Ignore
	public void DeleteMovie() {
		List<Movie> movieList = movieDao.queryMovie();
		for (Movie movie : movieList) {
			if ("star wars".equals(movie.getName())) {
				int effectedNum = movieDao.deleteMovie(movie.getId());
				assertEquals(1, effectedNum);
			}
		}

		movieList = movieDao.queryMovie();
		assertEquals(2, movieList.size());
	}
}