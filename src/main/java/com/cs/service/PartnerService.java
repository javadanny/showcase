package com.cs.service;

import com.cs.domain.PartnersEntity;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/19/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PartnerService {

    public void createPartner(PartnersEntity partner);
    public void updatePartner(PartnersEntity partner);
    public void deletePartner(PartnersEntity partner);
    public List<PartnersEntity> retrieveAllPartners();
    public PartnersEntity retrievePartnerByOnepass(PartnersEntity partner);

}
