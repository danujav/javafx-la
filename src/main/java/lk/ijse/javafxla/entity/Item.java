package lk.ijse.javafxla.entity;

/*
    @author DanujaV
    @created 9/16/23 - 4:08 PM   
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}
