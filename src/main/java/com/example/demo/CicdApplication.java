package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.CicdDao;
import com.example.demo.Dto.CicdDto;

@SpringBootApplication
@RestController
public class CicdApplication {
	@Autowired
	private CicdDao cicdDao;
	
	/*
	 * @GetMapping public List<CicdDto> fetchOrders() { return cicdDao.getOrders();
	 * }
	 */
	
	@GetMapping("/orders")
	public String show() {
		return "yes";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
