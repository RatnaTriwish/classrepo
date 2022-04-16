package com.school.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.data.model.FirstRoom;
import com.school.data.service.FirstRoomService;

import antlr.collections.List;

@RestController
public class FirstRoomController {
	@Autowired
	FirstRoomService frs;

	@PostMapping("/firstroom")
	private int save(@RequestBody FirstRoom firstroom) {
		frs.save(firstroom);
		// System.out.println("data entered");
		return firstroom.getId();

	}

	@GetMapping("/firstroom")
	private List getAll() {
		return frs.getAll();
	}

	@GetMapping("/firstroom/{id}")
	private FirstRoom getById(@PathVariable("Id") int id) 
	{
		return frs.getFirstRoomById(id);
	}

	@DeleteMapping("firstroom/{id}")
	private String deleteFirstRoom(@PathVariable("id") int id) {
		frs.delete(id);
		return "deleted ";
	}

	@PutMapping("/firstroom")
	private FirstRoom update(@RequestBody FirstRoom firstroom) {
		frs.update(firstroom);
		return firstroom;
	}
}
