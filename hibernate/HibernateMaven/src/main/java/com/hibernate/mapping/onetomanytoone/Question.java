package com.hibernate.mapping.onetomanytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "questiononetomany")
public class Question {
	
	@Id
	@Column(name = "question_id" , nullable = false)
	private int questionId;
	
	private String question;
	
	@OneToMany(mappedBy = "question" , fetch = FetchType.EAGER, cascade = CascadeType.ALL)//cascade from cascading example 
	//here fetch can be done using 2 fetch technique i.e LAZY and EAGER
	//by default its LAZY i.e the query will fire when its getter method is called 
	private List<Answer1> answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, List<Answer1> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer1> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}
	
	
	
}

