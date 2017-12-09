package pl.mw.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.mw.aopdemo.config.DemoConfig;
import pl.mw.aopdemo.dao.AccountDAO;
import pl.mw.aopdemo.dao.MembershipDAO;

public class MainDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        // call the business method
        theAccountDAO.addAccount();

        // calling once again to check how the aspect works
        theAccountDAO.addAccount();

        theMembershipDAO.addAccount();
        theMembershipDAO.addPremiumMember();

        // close the context
        context.close();
    }
}
