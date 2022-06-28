package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Director;
 
 

public  interface DirectorRepository extends JpaRepository<Director,Integer>{
	
	@Query(value="	 SELECT d.* FROM Director d JOIN movie_director md ON d.directorid = md.director_Id JOIN Movie m ON m.movieid = md.movie_Id  where m.movietitle=?1",nativeQuery=true)
	public List<Director>  SearchDirectorNameByMovie(String name);
	

}
