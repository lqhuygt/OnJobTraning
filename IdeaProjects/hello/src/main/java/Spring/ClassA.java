package Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassA {
    @Autowired

    private ClassB b;

    public ClassB getB() {
        return b;
    }
}
