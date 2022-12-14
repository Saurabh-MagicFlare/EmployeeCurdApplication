package com.app.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Employee {

	 @Id
	 @GeneratedValue
	 private int id;
	 private String name;
	 private String department;
	 private double salary;
}
