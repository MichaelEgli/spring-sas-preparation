package ch.egli.michael.spring.sas.preparation.di.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Autowired // field injection
    @Qualifier("laptop")
    private Computer comp;

/*    public Developer(Laptop laptop) {  // konstruktor injection
        this.laptop = laptop;
    }*/

    // Setter injection
/*    @Autowired
    private Laptop laptop;
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public void do_build() {
        comp.do_compile();
        System.out.println("devs do build");
    }
}
