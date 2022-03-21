package com.example.demo.Dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.demo.Dto.CicdDto;

@Repository
public class CicdDao {
	
	
	public List<CicdDto> getOrders() {
		return Stream.of(new CicdDto(1,"kiran","26"),
				new CicdDto(2,"vasanth","13")).collect(Collectors.toList());
	}
}
