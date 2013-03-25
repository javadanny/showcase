package com.cs.service;

import java.util.List;
import com.cs.domain.ContactEntity;
/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/24/13
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ContactService {
    public List<ContactEntity> findAll();
    public ContactEntity findById(Integer id);
    public ContactEntity save(ContactEntity contact);
}
