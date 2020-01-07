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
@Table(name = "food")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "food_id")
	private int food_id;

	@Column(name = "has_food")
	private boolean has_food;

	@OneToOne(mappedBy = "food", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private Student student;

	public boolean isHas_food() {
		return has_food;
	}

	public void setHas_acc(boolean has_food) {
		this.has_food = has_food;
	}

	public Food() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Food [has_food=" + has_food + "]";
	}

}
