package org.app.service.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;

@Entity
public class Position implements Serializable {
	@Id@GeneratedValue
	Integer idPosition;
	String  name;
	String  description;
	@ManyToOne
	Departament departament;
}
