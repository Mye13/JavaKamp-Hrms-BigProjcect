package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_positions")
public class JobPositions {
	
	@Id
	@GeneratedValue
	@Column(name = "job_id")
	private int jobPositionId;
	
	@Column(name = "position_name")
	private String positionName;
	
}
