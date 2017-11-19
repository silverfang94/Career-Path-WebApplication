package org.app.service.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Messages implements Serializable{
	@Id @GeneratedValue
	Integer idMessage;
	String  title;
	String  text;
	@ManyToOne
	JobSeeker jobSeeker;
	@ManyToOne
	Company   company;
}
