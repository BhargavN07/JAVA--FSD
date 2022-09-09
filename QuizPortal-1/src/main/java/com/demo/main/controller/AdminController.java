package com.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.entity.Question;
import com.demo.main.entity.Result;
import com.demo.main.service.QuestionService;
import com.demo.main.service.QuizService;



@RestController
@RequestMapping("/api/questions")
public class AdminController {
	
	@Autowired
	private QuestionService service;
	
	@Autowired
	private QuizService service2;
	
	
	@PostMapping("/addQuestions")
	public ResponseEntity<Question> addUser(@RequestBody Question u){
		Question user= service.addQuestion(u);
		if(user!=null)  
			return new ResponseEntity<Question>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<Question>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@GetMapping("/")
	public  List<Question> getAllQues(){
		return service.getAllQuestions();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Question> getQuesById(@PathVariable int id){
		  Question user= service.getQuestionsById(id);
		  
		  if(user!=null)
			  return new ResponseEntity<Question>(user,HttpStatus.FOUND);
		  else
			  return new  ResponseEntity<Question>(user,HttpStatus.NOT_FOUND);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateQues(@RequestBody Question user,@PathVariable int id){
		Question data= service.updateQues(user, id);
		
		if(data!=null)
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("User is Not Available",HttpStatus.NOT_FOUND);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteQues(@PathVariable  int id ){
		
		if(service.deleteQues(id))
			return new ResponseEntity<Object>("User Deleted", HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No User Found",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/users")
	public List<Result> getAllUser(){
		return service2.getTopScore();
	}
	
	
	
	

}
