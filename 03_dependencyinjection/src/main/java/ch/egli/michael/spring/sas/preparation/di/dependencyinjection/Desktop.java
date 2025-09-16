package ch.egli.michael.spring.sas.preparation.di.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void do_compile() {
        System.out.println("Desktop do_compile faster");
    }

}
