package com.MyHibernateGradle.Fifth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_answer")
public class Answernew {
	@Id
	@Column(name = "answer_id")
	private int answerId;

	private String answer;

	@ManyToOne
	private Questions quest;

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

	public Questions getQuest() {
		return quest;
	}

	public void setQuest(Questions quest) {
		this.quest = quest;
	}

	public Answernew() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answernew(int answerId, String answer, Questions quest) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.quest = quest;
	}

}
