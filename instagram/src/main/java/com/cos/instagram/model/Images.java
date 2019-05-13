package com.cos.instagram.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Images {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String location;
	private String caption;
	private String contentType;
	private String fileName;
	private String filepath;
	
//	@Lob
//	@Column(length=1024000)
//	private byte[] file;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private Users user;
	
	@OneToMany
	@JoinColumn(name="imageId")
	private List<Tags> tags;
	
	@CreationTimestamp
	private LocalDate createDdate;
	@CreationTimestamp
	private LocalDate updateDate;
	
}
