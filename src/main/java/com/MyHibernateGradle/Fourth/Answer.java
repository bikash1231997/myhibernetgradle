package com.MyHibernateGradle.Fourth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "answer_id")
	private int answerId;

	private String answer;

	@OneToOne(mappedBy = "answer")
	private MyOneToOne quest;

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

	public MyOneToOne getQuest() {
		return quest;
	}

	public void setQuest(MyOneToOne quest) {
		this.quest = quest;
	}

	public Answer(int answerId, String answer, MyOneToOne quest) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.quest = quest;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
