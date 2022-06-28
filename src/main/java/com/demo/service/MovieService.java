package com.demo.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.MovieDTO;
import com.demo.entity.Movie;
import com.demo.repository.MovieRepository;

@Service
@Transactional
public class MovieService {
	@Autowired
	MovieRepository repo;
	public void addMovie(MovieDTO dto) {
		Movie entity=new Movie();
		entity.setMovieId(dto.getMovieId());;
		entity.setMovieTitle(dto.getMovieTitle());
		entity.setDateReleased( dto.getDateReleased());
		entity.setMovieRunningTime(dto.getMovieRunnungTime());
		repo.save(entity);
		System.out.println("Movie record inserted");
	}
	public void getRecord() {
		//List<Movie> list=repo.findAll();
		//list.stream().forEach(System.out::println);
		
		List<Movie> list=repo.findByMovieTitle("Intesteller");
		if(list.isEmpty()) {
			 System.out.println("No Movie With Given Title");
		}
		else{
		list.stream().forEach(System.out::println);
		}
		
		//List<Movie> list=repo.findMovie("Intesteller",1001);
		//list.stream().forEach(System.out::println);
		
	}
	public void UpdateRealeaseDate(LocalDate releaseDate,String movie) {
		try {
		List<Movie> list=repo.findByMovieTitle(movie);
		if(list.isEmpty()) {
			 System.out.println("No Movie With Given Title");
			}
		else {
			repo.UpdateReleaseDate(releaseDate,movie);
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void GetmovieByDirectorName() {
		try {
			List<Movie> list=repo.searchMovieListFromDirectorNam("Yash");
			if(list.isEmpty()) {
				System.out.println("No Movie Directed by provied Director");
			}
			else {
				list.stream().forEach(System.out::println);
				}
		    }
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
}
