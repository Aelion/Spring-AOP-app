package pl.mw.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // add all of related advices for logging

    // @Before advice

    @Before("execution(public void add*())")
    //@Before("execution(public void updateAccount())")
    //@Before("execution(public void pl.mw.aopdemo.dao.AccountDAO.addAccount())") // only the method from AccountDAO class
    public void beforeAddAccountAdvice(){  //can be any method name
        System.out.println("\n======>>> Executing @Before advice on method");
    }
}
