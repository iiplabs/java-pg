package com.iiplabs.javapg.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "app_user")
public class AppUser {

	@Id
	@GeneratedValue(generator = "app_user_generator")
	@SequenceGenerator(
					name = "app_user_generator",
					sequenceName = "app_user_sequence",
					initialValue = 1000
	)
	private Long id;

	@EqualsAndHashCode.Include
	@Column(name = "name")
	private String name;

	@EqualsAndHashCode.Include
	@Column(name = "email")
	private String email;

}
