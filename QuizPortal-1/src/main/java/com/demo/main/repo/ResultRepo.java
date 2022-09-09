package com.demo.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.entity.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer>{

}
