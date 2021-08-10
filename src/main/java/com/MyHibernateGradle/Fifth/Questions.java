package com.MyHibernateGradle.Fifth;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_question")
public class Questions {
	@Id
	@Column(name = "question_id")
	private int questionId;

	private String questions;

	@OneToMany(mappedBy = "quest")
	private List<Answernew> answer;

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

	public List<Answernew> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answernew> answer) {
		this.answer = answer;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(int questionId, String questions, List<Answernew> answer) {
		super();
		this.questionId = questionId;
		this.questions = questions;
		this.answer = answer;
	}
	

}
