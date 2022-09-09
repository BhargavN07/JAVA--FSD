package com.demo.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.entity.Question;
import com.demo.main.repo.QuestionRepo;


@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepo repo;
	

	public Question addQuestion(Question u) {
		return repo.save(u);
	}
	
	
	
	public List<Question> getAllQuestions(){
		return repo.findAll();
	}
	
	
	public Question getQuestionsById(int id) {
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();
		else 
			return null;
		
	}
	
	public  Question updateQues(Question user, int id) {
		
		if(repo.findById(id).isPresent())
		{
			Question old= repo.findById(id).get();
			old.setQuestion(user.getQuestion());
			old.setOptionA(user.getOptionA());
			old.setOptionB(user.getOptionB());
			old.setOptionC(user.getOptionC());
			old.setOptionD(user.getOptionD());
			old.setAns(user.getAns());
			old.setChose(user.getChose());
			
			
			return repo.save(old);
		}
		else
		{
			return null;
		}
		
	}
	
	
	public boolean deleteQues(int id) {
		
		if(repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			return true;
		}
		else
			return false;
	}

}