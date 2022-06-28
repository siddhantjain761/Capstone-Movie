package com.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Movie {
	@Id
	@Column(name="movieid")
	@GeneratedValue(strategy=GenerationType.AUTO)   //Auto increment 
	private int movieId;
	@Column(name="movietitle")
	private String movieTitle;
    @Column(name="datereleased")
    private LocalDate dateReleased;
	@Column(name="movierunningtime")
	private LocalDateTime movieRunningTime;
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name="movie_director",joinColumns=@JoinColumn(name="movie_Id",referencedColumnName="movieid"),
	inverseJoinColumns=@JoinColumn(name="Director_Id",referencedColumnName="directorid"))
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
	public LocalDateTime getMovieRunningTime() {
		return movieRunningTime;
	}
	public void setMovieRunningTime(LocalDateTime movieRunningTime) {
		this.movieRunningTime = movieRunningTime;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieTitle + ",   movieRunningTime=" +   movieRunningTime  +"]";
	}
	

}
