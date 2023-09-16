package lk.ijse.javafxla.dao;

/*
    @author DanujaV
    @created 9/16/23 - 4:38 PM   
*/

import lk.ijse.javafxla.dao.custom.impl.ItemDaoImpl;

public class FactoryDao {
    public static <T>T getDao(DaoType type) {
        switch (type) {
            case ITEM:
                return (T) new ItemDaoImpl();
            default:
                return null;
        }
    }
}
