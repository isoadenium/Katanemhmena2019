package gr.hua.dit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends InternalUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int emp_id;

	@Column(name = "is_supervisor")
	private boolean is_supervisor;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dep_id")
	private Departement departement;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Check> check;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public boolean isIs_supervisor() {
		return is_supervisor;
	}

	public void setIs_supervisor(boolean is_supervisor) {
		this.is_supervisor = is_supervisor;
	}

	public List<Check> getCheck() {
		return check;
	}

	public void setCheck(List<Check> check) {
		this.check = check;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Employee [departement=" + departement + ", check=" + check + "]";
	}

}
