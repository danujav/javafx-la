package lk.ijse.javafxla.business;

/*
    @author DanujaV
    @created 9/16/23 - 4:24 PM   
*/

import lk.ijse.javafxla.business.custom.impl.ItemBoImpl;

public class FactoryBo {
    public static <T>T getBo(BoType type) {
        switch (type) {
            case ITEM:
                return (T) new ItemBoImpl();
            default:
                return null;
        }
    }
}
