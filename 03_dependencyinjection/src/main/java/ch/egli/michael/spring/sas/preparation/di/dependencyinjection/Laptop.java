package ch.egli.michael.spring.sas.preparation.di.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Computer {

    public void do_compile() {
        System.out.println("Laptop do_compile");
    }

}
