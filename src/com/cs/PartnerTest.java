package com.cs;

import com.cs.dao.PartnersDao;
import com.cs.domain.CollegesEntity;
import com.cs.domain.PartnersEntity;
import com.cs.domain.TeamsEntity;
import com.cs.domain.TitlesEntity;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: c161635
 * Date: 3/16/13
 * Time: 12:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class PartnerTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.load("classpath:spring-config.xml");
        ctx.refresh();

        PartnersDao partnersDao = ctx.getBean("partnersDao", PartnersDao.class);

        // save one
        System.out.println("Adding one");
        PartnersEntity partner = new PartnersEntity();
        partner.setOnepassId("c161635");
        partner.setFirstName("Danny");
        partner.setLastName("Carroll");
        partner.setTeamRank(1);

        CollegesEntity ce = new CollegesEntity();
        ce.setCollegeId(1);
        partner.setCollegesByCollegeId(ce);

        TeamsEntity te = new TeamsEntity();
        te.setTeamId(1);
        partner.setTeamsBySadcTeamId(te);

        TitlesEntity tle = new TitlesEntity();
        tle.setTitleId(2);
        partner.setTitlesByTitleId(tle);

        partnersDao.save(partner);

        System.out.println("Find by ID");
        partner = partnersDao.findByOnepass("c161635");
        displayPartners(partner);

        System.out.println("Display all partners");
        List<PartnersEntity> partners = partnersDao.findAll();
        listPartners(partners);

        System.out.println("Delete a partner: " + partner.getOnepassId());
        partnersDao.delete(partner);

    }

    private static void listPartners(List<PartnersEntity> partners) {
        System.out.println("");
        System.out.println("Listing partners without details");
        for (PartnersEntity partner: partners) displayPartners(partner);
    }

    private static void displayPartners(PartnersEntity partner) {
        System.out.println("Partner ID: " + partner.getOnepassId());
        System.out.println(partner.getFirstName() + " " + partner.getLastName());
        System.out.println(partner.getCollegesByCollegeId().getCollegeNm());
        System.out.println(partner.getTeamsBySadcTeamId().getTeamId() + " " + partner.getTeamsBySadcTeamId().getTeamName());
        System.out.println(partner.getTitlesByTitleId().getTitleDesc());
        System.out.println();
    }
}
