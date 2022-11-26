package NestedClass.LocalInnerClass;

import java.math.BigDecimal;

public class LocalInnerClass {
    public void DoSomething() {
        InnerLocalClass innerLocalClass = new InnerLocalClass();
        BigDecimal bbb = innerLocalClass.aaa;

    }

    private class InnerLocalClass{
        BigDecimal aaa = BigDecimal.valueOf(12);
    }
}
