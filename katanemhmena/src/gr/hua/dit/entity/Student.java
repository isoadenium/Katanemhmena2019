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
@Table(name = "student")
public class Student extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "std_id")
	private int student_id;

	@Column(name = "town")
	private String town;

	@Column(name = "date_of_birth")
	private String date_of_birth;

	@Column(name = "year_of_enrollment")
	private int year_of_enrollment;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "std_dep_id")
	private Departement dep;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "std_points_id")
	private Points points;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "std_form_id")
	private Form form;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "std_food_id")
	private Food food;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getYear_of_enrollment() {
		return year_of_enrollment;
	}

	public void setYear_of_enrollment(int year_of_enrollment) {
		this.year_of_enrollment = year_of_enrollment;
	}

	public Departement getDep() {
		return dep;
	}

	public void setDep(Departement dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", town=" + town + ", date_of_birth=" + date_of_birth
				+ ", year_of_enrollment=" + year_of_enrollment + ", dep=" + dep + ", points=" + points + ", form="
				+ form + "]";
	}

}
