package com.zlf.WX.service;

import java.util.List;

import com.zlf.WX.entity.Movie;

public interface MovieService {


	List<Movie> getMovieList();


	Movie getMovieById(int id);


	boolean addMovie(Movie movie);


	boolean modifyMovie(Movie movie);


	boolean deleteMovie(int id);

}
