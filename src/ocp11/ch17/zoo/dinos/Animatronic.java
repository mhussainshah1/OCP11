package ocp11.ch17.zoo.dinos;

import java.time.LocalDate;
import java.util.List;
import sun.misc.Unsafe;

public class Animatronic {
    private List<String> names;
    private LocalDate visitDate;

    public Animatronic(List<String> names, LocalDate visitDate) {
        this.names = names;
        this.visitDate = visitDate;
    }
    
    public void unsafeMethod(){
        Unsafe unsafe = Unsafe.getUnsafe();
    }
}
