package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;

import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;

public class DeliverRevisionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private DeliverStatus status;
	private String feedBack;
	private Integer correctCount;
	
	public DeliverRevisionDTO() {
	}

	public DeliverRevisionDTO(DeliverStatus status, String feedBack, Integer correctCount) {
		super();
		this.status = status;
		this.feedBack = feedBack;
		this.correctCount = correctCount;
	}

	public DeliverStatus getStatus() {
		return status;
	}

	public void setStatus(DeliverStatus status) {
		this.status = status;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	public Integer getCorrectCount() {
		return correctCount;
	}

	public void setCorrectCount(Integer correctCount) {
		this.correctCount = correctCount;
	}
	
	
}
