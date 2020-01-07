package gr.hua.dit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "formcheck")
public class Check {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "check_id")
	private int check_id;

	@Column(name = "is_approved")
	private boolean is_approved;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "form_id")
	private Form form;

	public Check() {
		// TODO Auto-generated constructor stub
	}

	public boolean isIs_approved() {
		return is_approved;
	}

	public void setIs_approved(boolean is_approved) {
		this.is_approved = is_approved;
	}

	@Override
	public String toString() {
		return "Check [check_id=" + check_id + ", is_approved=" + is_approved + ", employee=" + employee + ", form="
				+ form + "]";
	}

}
