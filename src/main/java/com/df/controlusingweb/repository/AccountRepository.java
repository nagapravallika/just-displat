package com.df.controlusingweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.df.controlusingweb.model.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

}
