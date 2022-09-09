package com.demo.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.entity.Question;



@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}