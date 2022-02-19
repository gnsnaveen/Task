package in.nareshit.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long  Id;
	@Column(name="uname")
	private String uname;
	@Column(name="email")
	private String email ; 
	@Column(name="pwd")
	private String pwd  ;
	@Column(name="role")
	private String role ;
		
}
