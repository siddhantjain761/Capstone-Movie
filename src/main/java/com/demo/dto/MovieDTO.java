package com.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MovieDTO {
	private int movieId;
	private String movieTitle;
	private LocalDate dateReleased;
	private LocalDateTime movieRunnungTime;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public LocalDate getDateReleased() {
		return dateReleased;
	}
	public void setDateReleased(LocalDate dateReleased) {
		this.dateReleased = dateReleased;
	}
	public LocalDateTime getMovieRunnungTime() {
		return movieRunnungTime;
	}
	public void setMovieRunnungTime(LocalDateTime movieRunnungTime) {
		this.movieRunnungTime = movieRunnungTime;
	}
	


}
