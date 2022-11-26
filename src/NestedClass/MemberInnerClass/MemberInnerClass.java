package NestedClass.MemberInnerClass;
import java.math.BigDecimal;

public class MemberInnerClass {

    public void DoSomething(BigDecimal aaa){

        class InnerMemberClass{
            BigDecimal bbb = aaa;
        }
    }
}
