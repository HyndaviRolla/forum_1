package com.prodapt.learningspring.model;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.Min;
@Component
public class Student {
  private int id;
  private String name;
  @Min(value = 0) private int score;
  private int rank;  
  
  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public int getRank() {
	return rank;
}

public void setRank(int rank) {
	this.rank = rank;
}

public Student() {    
  }
  
  public Student(int id, String name, int score) {
    this.id = id;
    this.name = name;
    this.score = score;
  }
}
