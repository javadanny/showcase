package com.cs.dao;

import com.cs.domain.PartnersEntity;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/17/13
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PartnersDao {
    public List<PartnersEntity> findAll();
    public PartnersEntity findByOnepass(String onepassId);
    public PartnersEntity save(PartnersEntity partner);
    public void delete(PartnersEntity partner);
}
