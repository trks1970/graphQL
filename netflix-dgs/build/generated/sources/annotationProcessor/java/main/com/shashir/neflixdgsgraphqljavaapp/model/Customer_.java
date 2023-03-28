package com.shashir.neflixdgsgraphqljavaapp.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> gender;
	public static volatile SingularAttribute<Customer, String> mail;
	public static volatile SingularAttribute<Customer, Long> contact;
	public static volatile SingularAttribute<Customer, String> name;
	public static volatile ListAttribute<Customer, Account> accounts;
	public static volatile SingularAttribute<Customer, String> customerNumber;

	public static final String GENDER = "gender";
	public static final String MAIL = "mail";
	public static final String CONTACT = "contact";
	public static final String NAME = "name";
	public static final String ACCOUNTS = "accounts";
	public static final String CUSTOMER_NUMBER = "customerNumber";

}

