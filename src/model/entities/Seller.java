package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private Date bithDate;
	private Double baseDalary;
	
	private Department department;
	
	public Seller() {
		
	}

	public Seller(Integer id, String name, String email, Date bithDate, Double baseDalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.bithDate = bithDate;
		this.baseDalary = baseDalary;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}

	public Double getBaseDalary() {
		return baseDalary;
	}

	public void setBaseDalary(Double baseDalary) {
		this.baseDalary = baseDalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", bithDate=" + bithDate + ", baseDalary="
				+ baseDalary + ", department=" + department + "]";
	}
	
	
}
