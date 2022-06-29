package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dto.DirectorDTO;
import com.demo.dto.MovieDTO;
import com.demo.service.DirectorService;
import com.demo.service.MovieService;

@SpringBootApplication
public class CapstoneApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=(ApplicationContext)SpringApplication.run(CapstoneApplication.class, args);
	    MovieService service=(MovieService) ctx.getBean("movieService");
	    DirectorService dservice=(DirectorService) ctx.getBean("directorService");
	    
	    MovieDTO dto=new MovieDTO();
	    dto.setMovieTitle("Major");
	    dto.setDateReleased(LocalDate.now());
	    dto.setMovieRunnungTime(LocalDateTime.now());
	    //service.addMovie(dto);
	    //service.getRecord();
	    //service.UpdateRealeaseDate(LocalDate.of(2022,04,23),"RRR");
	    //service.GetmovieByDirectorName();
	    
	    
	    //****************************DIRECTOR CLASSS***********************//////
	    DirectorDTO d_dto=new DirectorDTO();
	    d_dto.setFirstName("Yash");
	    d_dto.setLastName("Raj");
	    d_dto.setAddress("Marine drive,Mumbai");
	    d_dto.setContactNumber(958974123);
	    d_dto.setEmailId("yasjraj@filmproduction.com");
	    //dservice.addDirector(d_dto);
	    //dservice.GetDirectorNameByMovie();
	    dservice.UpdateDirctorDeatails("Yash","Raj","Marine Drive",659321478);
	    
	    
	}

}
