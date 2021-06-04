package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seekers")
public class JobSeekerUser extends User{
	
//	@Column(name = "job_seeker_id")
//	private int jobSeekerUserId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_id")
	private String nationalityId;
	
	@Column(name = "birth_day")
	private Date birthDay;
	
}
