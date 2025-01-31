package com.hyd.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hyd.hotel.entity.Hotel;
import com.hyd.hotel.service.HotelService;

@RestController
public class HotelController {
	
	//HotelService hSer = new HotelService();
	
	@Autowired
	HotelService hSer;
	
	
	@PostMapping("/myhotel/hotel/add")
	public String createNewHotel(@RequestBody Hotel hotel) {
		
		System.out.println("from browser hotel data--->"+hotel);
		return "";
	}

}