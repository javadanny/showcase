package com.cs.service;

import com.cs.dao.PartnersDao;
import com.cs.domain.PartnersEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/19/13
 * Time: 9:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
@Service("partnerService")
public class PartnerServiceImpl implements PartnerService {
    //dependencies
    private SessionFactory sessionFactory;
    private PartnersDao partnersDao;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    public void setPartnersDao(PartnersDao partnersDao) {
        this.partnersDao = partnersDao;
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public PartnersDao getPartnersDao() {
        return this.partnersDao;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void createPartner(PartnersEntity partner) {
        partnersDao.save(partner);
    }

    @Override
    public void updatePartner(PartnersEntity partner) {
        partnersDao.save(partner);
    }

    @Override
    public void deletePartner(PartnersEntity partner) {
        partnersDao.delete(partner);
    }

    @Override
    public List<PartnersEntity> retrieveAllPartners() {
        return partnersDao.findAll();
    }

    @Override
    public PartnersEntity retrievePartnerByOnepass(PartnersEntity partner) {
        return partnersDao.findByOnepass(partner.getOnepassId());
    }

    public PartnerServiceImpl() {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.load("classpath:spring-config.xml");
        ctx.refresh();
    }
}
