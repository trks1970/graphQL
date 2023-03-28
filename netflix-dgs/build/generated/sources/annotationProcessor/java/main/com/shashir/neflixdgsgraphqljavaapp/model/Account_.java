package com.shashir.neflixdgsgraphqljavaapp.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static volatile SingularAttribute<Account, String> accountStatus;
	public static volatile SingularAttribute<Account, String> accountId;
	public static volatile SingularAttribute<Account, Long> accountNumber;
	public static volatile SingularAttribute<Account, Double> accountBalance;

	public static final String ACCOUNT_STATUS = "accountStatus";
	public static final String ACCOUNT_ID = "accountId";
	public static final String ACCOUNT_NUMBER = "accountNumber";
	public static final String ACCOUNT_BALANCE = "accountBalance";

}

