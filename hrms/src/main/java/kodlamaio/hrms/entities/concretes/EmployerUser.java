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
@Table(name = "employers")
public class EmployerUser {
	
	@Id
	@GeneratedValue
	@Column(name = "employer_id")
	private int employerUserId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "phone_number")
	private String phonenumber;
	
	@Column(name = "website")
	private String website;
	
}
