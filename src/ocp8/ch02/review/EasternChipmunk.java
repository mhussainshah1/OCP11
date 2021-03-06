package ocp8.ch02.review;

interface CanClimb {

    public abstract void climb();
}

interface CanClimbTrees extends CanClimb {
}

abstract class Chipmunk implements CanClimbTrees {

    public abstract void chew();
}

public class EasternChipmunk extends Chipmunk {

    public void chew() {
        System.out.println("Eastern Chipmunk is Chewing");
    }
}
