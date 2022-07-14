package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.FoodieModel;
import com.demo.repository.FoodieInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class FoodieController 
{
	@Autowired
	private FoodieInterface frep;
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insert")
	public FoodieModel insert(@RequestBody FoodieModel fm)
	{
		return this.frep.save(fm);
	}
	
	@GetMapping("/view")
	@CrossOrigin(origins="http://localhost:4200")
	
	public List<FoodieModel> view()
	{
		return  this.frep.findAll();	
	}
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/update")
	public FoodieModel update(@RequestBody FoodieModel fm)
	{
		return frep.save(fm);
	}
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/delete")
	public void delete(@RequestBody FoodieModel fm)
	{
		this.frep.delete(fm);
	}
	
	

}
