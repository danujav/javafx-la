package lk.ijse.javafxla.business.custom;

/*
    @author DanujaV
    @created 9/16/23 - 4:17 PM   
*/

import lk.ijse.javafxla.dto.ItemDto;

public interface ItemBo {
    boolean saveItem(ItemDto dto) throws Exception;
}
