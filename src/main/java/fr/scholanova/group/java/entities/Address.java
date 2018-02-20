package fr.scholanova.group.java.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address extends AbstractEntity {
	private Integer number;
	private String street;
	private String zipCode;
	private String city;
}
