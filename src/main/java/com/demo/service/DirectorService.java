package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.DirectorDTO;
import com.demo.entity.Director;
import com.demo.repository.DirectorRepository;

 

@Service
@Transactional
public class DirectorService {
	@Autowired
	DirectorRepository drepo;
	
	public void addDirector(DirectorDTO d_dto) {
		Director dentity=new Director();
		dentity.setFirstName(d_dto.getFirstName());
		dentity.setLastName(d_dto.getLastName());
		dentity.setAddress(d_dto.getAddress());
		dentity.setContactNumber(d_dto.getContactNumber());
		dentity.setEmailId(d_dto.getEmailId());
		drepo.save(dentity);
		System.out.println("Director record inserted");
		
	}
	public void GetDirectorNameByMovie() {
		List<Director> list =drepo.SearchDirectorNameByMovie("RRR");
		list.stream().forEach(System.out::println);
	}

}
