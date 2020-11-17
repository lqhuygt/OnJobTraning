package Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassB {
    @Autowired
    private ClassC c;
    @Autowired
    private ClassD d;

    public ClassC getC() {
        return c;
    }

    public ClassD getD() {
        return d;
    }
}
