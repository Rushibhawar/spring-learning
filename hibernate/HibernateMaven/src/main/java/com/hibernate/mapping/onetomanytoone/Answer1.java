package com.hibernate.mapping.onetomanytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "answeronetomany")
public class Answer1 {
	
	@Id
	@Column(name = "answer_id")
	private int answerId;
	
	private String answer;

	@ManyToOne
	@JoinColumn(name = "question_id") //The @JoinColumn annotation defines the actual physical mapping on the owning side.
	//On the other hand, the referencing side is defined using the mappedBy attribute of the @OneToMany annotation.
	private Question question;
	
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Answer1(int answerId, String answer, Question question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}



	public Answer1(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public Question getQuestion() {
		return question;
	}



	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
