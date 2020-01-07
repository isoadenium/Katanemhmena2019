package gr.hua.dit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "form")
public class Form {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "form_id")
	private int form_id;

	@Column(name = "income")
	private double income;

	@Column(name = "unemp_parents")
	private int unemp_parents;

	@Column(name = "familly_income")
	private double familly_income;

	@Column(name = "bro_sis")
	private int bro_sis;

	public int getForm_id() {
		return form_id;
	}

	public void setForm_id(int form_id) {
		this.form_id = form_id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check check) {
		this.check = check;
	}

	@OneToOne(mappedBy = "form", cascade = { CascadeType.ALL })
	private Student student;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "check_id")
	private Check check;

	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public int getUnemp_parents() {
		return unemp_parents;
	}

	public void setUnemp_parents(int unemp_parents) {
		this.unemp_parents = unemp_parents;
	}

	public double getFamilly_income() {
		return familly_income;
	}

	public void setFamilly_income(double familly_income) {
		this.familly_income = familly_income;
	}

	public int getBro_sis() {
		return bro_sis;
	}

	public void setBro_sis(int bro_sis) {
		this.bro_sis = bro_sis;
	}

	@Override
	public String toString() {
		return "Form [point_id=" + form_id + ", income=" + income + ", unemp_parents=" + unemp_parents
				+ ", familly_income=" + familly_income + ", bro_sis=" + bro_sis + ", student=" + student + ", check="
				+ check + "]";
	}

}
