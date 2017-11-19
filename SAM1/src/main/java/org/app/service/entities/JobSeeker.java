package org.app.service.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.DiscriminatorValue;
@Entity
//@DiscriminatorValue("JobSeeker")
public class JobSeeker extends Users{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer age;
	String  name;
	String 	surname;
	@OneToOne
	Position position;
	@OneToMany(mappedBy = "jobSeeker", cascade = ALL, orphanRemoval = true)
	List<Messages> listMessages;
	@ManyToMany(mappedBy = "listJobSeeker", cascade = ALL)
	List<JobOffer> listJobOfferAplication;
}
