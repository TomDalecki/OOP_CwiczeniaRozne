package Lambda.Examples.Example1;

import Lambda.Examples.Example1.Animal;
import Lambda.Examples.Example1.Checkable;

public class CheckIfCanBark implements Checkable {

    @Override
    public boolean test(Animal a) {
        return a.isCanBark();
    }
}
