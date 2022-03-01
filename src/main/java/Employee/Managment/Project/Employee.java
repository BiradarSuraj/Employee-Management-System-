package Employee.Managment.Project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String Emp_name;
	private String Emp_DOB;
	private String emp_email;
	private String designation;
	
	
	
	public Employee() {
		super();
	}
	public Employee(int emp_id, String emp_name, String emp_DOB, String emp_email, String designation) {
		super();
		this.emp_id = emp_id;
		this.Emp_name = emp_name;
		this.Emp_DOB = emp_DOB;
		this.emp_email = emp_email;
		this.designation = designation;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.Emp_name = emp_name;
	}
	public String getEmp_DOB() {
		return Emp_DOB;
	}
	public void setEmp_DOB(String emp_DOB) {
		this.Emp_DOB = emp_DOB;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
