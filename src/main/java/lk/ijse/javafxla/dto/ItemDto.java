package lk.ijse.javafxla.dto;

/*
    @author DanujaV
    @created 9/16/23 - 3:56 PM   
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDto {
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}
