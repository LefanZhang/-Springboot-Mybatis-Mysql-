package com.zlf.WX.dao;

import java.util.List;

import com.zlf.WX.entity.Movie;

public interface MovieDao {

	List<Movie> queryMovie();


	Movie queryMovieById(int id);


	int insertMovie(Movie movie);


	int updateMovie(Movie movie);


	int deleteMovie(int id);
}
