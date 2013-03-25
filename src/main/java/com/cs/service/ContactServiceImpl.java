package com.cs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.domain.ContactEntity;
import com.cs.repository.ContactRepository;
import com.cs.service.ContactService;
import com.google.common.collect.Lists;

public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Transactional(readOnly=true)
    public List<ContactEntity> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }

    @Transactional(readOnly = true)
    public ContactEntity findById(Integer id) {
        return contactRepository.findOne(id);
    }

    public ContactEntity save(ContactEntity contact) {
        return contactRepository.save(contact);
    }
}
