package fr.scholanova.group.java.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	
	@ManyToMany
	@JoinTable(
	      name="User_Address",
		      joinColumns=@JoinColumn(name="UserId", referencedColumnName="Id"),
		      inverseJoinColumns=@JoinColumn(name="AddressId", referencedColumnName="Id"))
	private Collection<Address> addressList;
}
