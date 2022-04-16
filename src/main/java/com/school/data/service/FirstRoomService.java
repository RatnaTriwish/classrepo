package com.school.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.data.model.FirstRoom;
import com.school.data.repository.FirstRoomRepository;

import antlr.collections.List;

@Service
public class FirstRoomService {
	@Autowired
	FirstRoomRepository fr;

	public void save(FirstRoom firstroom) {
		fr.save(firstroom);

	}

	public List getAll() {
		return (List) fr.findAll();
	}

	public FirstRoom getFirstRoomById(int id) {

		return fr.findById(id).get();
	}

	public void update(FirstRoom firstroom) {
		fr.save(firstroom);
	}

	public void delete(int id) {

		fr.deleteById(id);
	}
}
