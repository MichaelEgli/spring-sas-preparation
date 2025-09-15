package ch.egli.michael.spring.sas.preparation.di.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Developer {

    public void do_compile() {
        System.out.println("devs do compile");
    }
}
