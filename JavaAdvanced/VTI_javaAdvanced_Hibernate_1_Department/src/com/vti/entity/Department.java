package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Khai báo POJO
@Entity
@Table(name = "department", catalog = "testingsystem")
public class Department implements Serializable {
	@Column(name = "DepartmentID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	@Column(name = "DepartmentName", nullable = false, unique = true)
	private String name;

	// Hàm tạo không tham số
	public Department() {

	}
	// Hàm getter setter tương ứng

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
