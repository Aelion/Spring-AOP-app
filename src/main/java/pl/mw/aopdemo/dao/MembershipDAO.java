package pl.mw.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAccount(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING MEMBERSHIP ACCOUNT");
    }


    public void addPremiumMember(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING PREMIUM MEMBERSHIP ACCOUNT");
    }

}
