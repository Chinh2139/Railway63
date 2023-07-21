package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Account", catalog = "TestingSystem")
public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "AccountID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "Email", length = 50, nullable = false, unique = true, updatable = false)
	private String email;

	@Column(name = "Username", length = 50, nullable = false, unique = true, updatable = false)
	private String username;

	@Column(name = "FullName", length = 50, nullable = false)
	private String fullname;

	@ManyToOne
	@JoinColumn(name = " DepartmentID", nullable = false)
	private Department department;

	@ManyToOne
	@JoinColumn(name = "PositionID", nullable = false)
	private Position position;

	@Column(name = "CreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate;

	@Column(name = "password", length = 800)
	private String password;

	public Account() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullname
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + "]";
	}

}
//import java.io.Serializable;
//import java.util.Date;
//
//import org.hibernate.annotations.Cascade;
//import org.hibernate.annotations.CascadeType;
//import org.hibernate.annotations.CreationTimestamp;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "`Account`", catalog = "TestingSystem")
//
//public class Account implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	@Column(name = "AccountID")
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private short id;
//
//	@Column(name = "Email", length = 50, nullable = false, unique = true, updatable = false)
//	private String email;
//
//	@Column(name = "Username", length = 50, nullable = false, unique = true, updatable = false)
//	private String username;
//
//	@Column(name = "FullName", length = 50, nullable = false)
//	private String fullname;
//
//	@ManyToOne
//	@JoinColumn(name = "DepartmentID", nullable = false)
//	@Cascade(value = { CascadeType.REMOVE, CascadeType.SAVE_UPDATE })
//	private Department department;
//
//	@ManyToOne
//	@JoinColumn(name = "PositionID", nullable = false)
//	private Position position;
//
//	@Column(name = "CreateDate")
//	@jakarta.persistence.Temporal(jakarta.persistence.TemporalType.TIMESTAMP)
//	@CreationTimestamp
//	private Date createDate;
//
//	public Account() {
//		super();
//	}
//
//	/**
//	 * @return the id
//	 */
//	public short getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(short id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the email
//	 */
//	public String getEmail() {
//		return email;
//	}
//
//	/**
//	 * @param email the email to set
//	 */
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	/**
//	 * @return the username
//	 */
//	public String getUsername() {
//		return username;
//	}
//
//	/**
//	 * @param username the username to set
//	 */
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	/**
//	 * @return the fullname
//	 */
//	public String getFullname() {
//		return fullname;
//	}
//
//	/**
//	 * @param fullname the fullname to set
//	 */
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
//
//	/**
//	 * @return the department
//	 */
//	public Department getDepartment() {
//		return department;
//	}
//
//	/**
//	 * @param department the department to set
//	 */
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//
//	/**
//	 * @return the createDate
//	 */
//	public Date getCreateDate() {
//		return createDate;
//	}
//
//	/**
//	 * @param createDate the createDate to set
//	 */
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
//
//	/**
//	 * @return the position
//	 */
//	public Position getPosition() {
//		return position;
//	}
//
//	/**
//	 * @param position the position to set
//	 */
//	public void setPosition(Position position) {
//		this.position = position;
//	}
//
//	@Override
//	public String toString() {
//		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullname
//				+ ", department=" + department + ", createDate=" + createDate + "]";
//	}
//
//}
