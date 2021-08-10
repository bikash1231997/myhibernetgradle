package com.MyHibernateGradle.Fourth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MyOneToOne {
	@Id
	@Column(name = "question_id")
	private int questionId;

	private String questions;
	
	@OneToOne
	@JoinColumn(name = "ans_id")
	private Answer answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public MyOneToOne(int questionId, String questions, Answer answer) {
		super();
		this.questionId = questionId;
		this.questions = questions;
		this.answer = answer;
	}

	public MyOneToOne() {
		super();
		// TODO Auto-generated constructor stub
	}


}
