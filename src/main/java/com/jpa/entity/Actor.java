package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Actor {
 
 @Id	
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Integer aid;
 //@Column(length=20,nullable=false)
 private String actorName;
 private String category;
 //@Column(length=10,unique=true)
 private Long mobile;
 
 public Actor() {}
 
public Actor(Integer aid, String actorName, String category, Long mobile) {
	super();
	this.aid = aid;
	this.actorName = actorName;
	this.category = category;
	this.mobile = mobile;
}
public Integer getAid() {
	return aid;
}
public void setAid(Integer aid) {
	this.aid = aid;
}
public String getActorName() {
	return actorName;
}
public void setActorName(String actorName) {
	this.actorName = actorName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Actor [aid=" + aid + ", actorName=" + actorName + ", category=" + category + ", mobile=" + mobile + "]";
}
 
 
 
}
