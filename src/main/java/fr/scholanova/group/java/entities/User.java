package fr.scholanova.group.java.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import fr.scholanova.group.java.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("user")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="user")
public class User extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4272267420327262128L;

	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "S-")
	@Column
	private Date birthDay;
	
	@Enumerated
	private GenderEnum gender;
	
	@ManyToOne
	@JoinColumn(name="fatherId")
	private User father;
	
	@ManyToOne
	@JoinColumn(name="motherId")
	private User mother;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	      name="User_Address",
		      joinColumns=@JoinColumn(name="UserId", referencedColumnName="Id"),
		      inverseJoinColumns=@JoinColumn(name="AddressId", referencedColumnName="Id"))
	private Collection<Address> addressList;
}
