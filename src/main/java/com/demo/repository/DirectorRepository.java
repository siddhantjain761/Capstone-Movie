package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Director;
 
 

public  interface DirectorRepository extends JpaRepository<Director,Integer>{
	
	@Query(value="	 SELECT d.* FROM Director d JOIN movie_director md ON d.directorid = md.director_Id JOIN Movie m ON m.movieid = md.movie_Id  where m.movietitle=?1",nativeQuery=true)
	public List<Director>  SearchDirectorNameByMovie(String name);
	
	@Query(value="Select * From Director d where  d.firstname=?1 and d.lastname=?2",nativeQuery=true)
	public List<Director> SearchDirectorDeatailsByName(String fn,String ln);
	
	 @Modifying
	 @Query(value="UPDATE Director SET address=+:addrs,contactnumber=+:no Where firstname=+:fn AND lastname=+:ln",nativeQuery=true)
	public int UpdateDirectorDeatils(String fn,String ln,String addrs,int no);
	

}
