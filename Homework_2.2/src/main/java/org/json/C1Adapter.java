package org.json;

public class C1Adapter extends C1 {

    public C1Adapter(C2 c2) {
        super(c2.getNum1(), c2.getNum2());
    }
}