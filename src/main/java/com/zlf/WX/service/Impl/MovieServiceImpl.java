package com.zlf.WX.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zlf.WX.dao.MovieDao;
import com.zlf.WX.entity.Movie;
import com.zlf.WX.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDao movieDao;

	@Override
	public List<Movie> getMovieList() {
		return movieDao.queryMovie();
	}

	@Override
	public Movie getMovieById(int id) {
		return movieDao.queryMovieById(id);
	}

	@Transactional
	@Override
	public boolean addMovie(Movie movie) {

		if (movie.getName() != null && !"".equals(movie.getName())) {

			try {
				int effectedNum = movieDao.insertMovie(movie);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("未插入成功！");
				}
			} catch (Exception e) {
				throw new RuntimeException("插入失败原因:" + e.toString());//getMessage()
			}
		} else {
			throw new RuntimeException("名称不能为空！");
		}
	}

	@Transactional
	@Override
	public boolean modifyMovie(Movie movie) {

		if (movie.getId() != null && movie.getId() > 0) {

			try {

				int effectedNum = movieDao.updateMovie(movie);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("未修改成功!");
				}
			} catch (Exception e) {
				throw new RuntimeException("修改失败原因:" + e.toString());
			}
		} else {
			throw new RuntimeException("ID不能为空！");
		}
	}

	@Transactional
	@Override
	public boolean deleteMovie(int id) {
		if (id > 0) {
			try {

				int effectedNum = movieDao.deleteMovie(id);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("未删除成功!");
				}
			} catch (Exception e) {
				throw new RuntimeException("删除失败原因:" + e.toString());
			}
		} else {
			throw new RuntimeException("ID不能为负！");
		}
	}
}
