package lk.ijse.javafxla.business.custom.impl;

/*
    @author DanujaV
    @created 9/16/23 - 4:18 PM   
*/

import lk.ijse.javafxla.business.custom.ItemBo;
import lk.ijse.javafxla.dao.DaoType;
import lk.ijse.javafxla.dao.FactoryDao;
import lk.ijse.javafxla.dao.custom.ItemDao;
import lk.ijse.javafxla.dao.custom.impl.ItemDaoImpl;
import lk.ijse.javafxla.dto.ItemDto;
import lk.ijse.javafxla.entity.Item;

public class ItemBoImpl implements ItemBo {
    private ItemDao dao = FactoryDao.getDao(DaoType.ITEM);
    @Override
    public boolean saveItem(ItemDto dto) throws Exception {
        var item = new Item(
                dto.getCode(),
                dto.getDescription(),
                dto.getUnitPrice(),
                dto.getQtyOnHand()
        );

        return dao.save(item);
    }
}
