package lk.ijse.javafxla.entity;

/*
    @author DanujaV
    @created 9/16/23 - 4:56 PM   
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    private String id;
    private String name;
    private String address;
    private String tel;
}
