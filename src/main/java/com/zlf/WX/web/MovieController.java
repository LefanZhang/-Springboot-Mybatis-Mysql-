package com.zlf.WX.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.zlf.WX.entity.Movie;
import com.zlf.WX.service.MovieService;

@RestController
@RequestMapping("/superadmin")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="/movielist")
	private Map<String,Object> listMovie(){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		List<Movie> list = new ArrayList<Movie>();
		list = movieService.getMovieList();
		modelMap.put("movieList", list);
		return modelMap;
	}
	
	@RequestMapping(value = "/getmoviebyid")
	private Map<String, Object> getMovieById(Integer id) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		
		Movie movie = movieService.getMovieById(id);
		modelMap.put("movie", movie);
		return modelMap;
	}


	@RequestMapping(value = "/addmovie")
	private Map<String, Object> addMovie(@RequestBody Movie movie)
			throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> modelMap = new HashMap<String, Object>();

		modelMap.put("success", movieService.addMovie(movie));
		return modelMap;
	}


	@RequestMapping(value = "/modifymovie")
	private Map<String, Object> modifyMovie(@RequestBody Movie movie)
			throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> modelMap = new HashMap<String, Object>();

		modelMap.put("success", movieService.modifyMovie(movie));
		return modelMap;
	}

	@RequestMapping(value = "/removemovie")
	private Map<String, Object> removeMovie(Integer id) {
		Map<String, Object> modelMap = new HashMap<String, Object>();

		modelMap.put("success", movieService.deleteMovie(id));
		return modelMap;
	}
}
