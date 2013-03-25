package com.cs.dao;

import com.cs.domain.PartnersEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/17/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository("partnersDao")
@Transactional
public class PartnersDaoImpl implements PartnersDao {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<PartnersEntity> findAll() {
        return sessionFactory.getCurrentSession().createQuery(" from PartnersEntity p").list();
    }

    @Override
    public PartnersEntity findByOnepass(String onepassId) {
        return (PartnersEntity) sessionFactory.getCurrentSession().getNamedQuery("PartnersEntity.findByOnepass").setParameter("id",onepassId).uniqueResult();
    }

    @Override
    public PartnersEntity save(PartnersEntity partner) {
        sessionFactory.getCurrentSession().saveOrUpdate(partner);
        return partner;
    }

    @Override
    public void delete(PartnersEntity partner) {
        sessionFactory.getCurrentSession().delete(partner);
    }
}
