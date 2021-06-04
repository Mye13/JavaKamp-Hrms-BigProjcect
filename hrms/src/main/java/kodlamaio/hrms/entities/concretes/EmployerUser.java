package kodlamaio.hrms.entities.concretes;

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
@Table(name = "employers")
public class EmployerUser extends User{
	
//	@Column(name = "employer_id")
//	private int employerUserId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "phone_number")
	private String phonenumber;
	
	@Column(name = "website")
	private String website;
	
}
