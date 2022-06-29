package com.demo.repository;


 
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.entity.Movie;

@Repository
public  interface MovieRepository extends JpaRepository<Movie,Integer> {
    @Query(value="select * from Movie m where m.movietitle=+:movieTitle",nativeQuery=true)
	public List<Movie> findByMovieTitle(String movieTitle);
	
	
	@Query(value="select m from Movie m where m.movietitle=?1 AND m.movieid=?2",nativeQuery=true)
	public List<Movie> findMovie(String movietitle,int movieid);
	 
    @Modifying
    @Query(value="update Movie SET datereleased=+:releaseDate Where movietitle=+:movie",nativeQuery=true)
    public int UpdateReleaseDate(LocalDate releaseDate,String movie);
    
    
    @Query(value="	 SELECT m.* FROM Movie m JOIN movie_director md ON m.movieid = md.Movie_Id JOIN Director d ON d.directorid = md.Director_Id  where d.firstname=?1",nativeQuery=true)
    public List<Movie> searchMovieListFromDirectorNam(String name);
    

 
	
}
