package com.tts.UsersAPI.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.UsersAPI.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public List<User> findAllByState(String state);
}
