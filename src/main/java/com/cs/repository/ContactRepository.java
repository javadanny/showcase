package com.cs.repository;

import org.springframework.data.repository.CrudRepository;
import com.cs.domain.ContactEntity;

public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {


}
