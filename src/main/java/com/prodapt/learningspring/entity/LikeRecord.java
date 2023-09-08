package com.prodapt.learningspring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
 
@Entity

public class LikeRecord {
  
  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LikeId getLikeId() {
		return likeId;
	}

	public void setLikeId(LikeId likeId) {
		this.likeId = likeId;
	}

@Column(unique=true)
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  
  @EmbeddedId
  private LikeId likeId;
  
}
