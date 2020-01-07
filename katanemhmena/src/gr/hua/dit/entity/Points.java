package gr.hua.dit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "points")
public class Points {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "points_id")
	private int points;

	@OneToOne(mappedBy = "points", cascade = CascadeType.ALL)
	private Student student;

	public Points() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Points [points=" + points + ", student=" + student + "]";
	}

}
