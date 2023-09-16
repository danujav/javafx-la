package lk.ijse.javafxla.controller;

/*
    @author DanujaV
    @created 9/2/23 - 1:27 PM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import lk.ijse.javafxla.business.BoType;
import lk.ijse.javafxla.business.FactoryBo;
import lk.ijse.javafxla.business.custom.ItemBo;
import lk.ijse.javafxla.business.custom.impl.ItemBoImpl;
import lk.ijse.javafxla.dto.ItemDto;

import java.io.IOException;
import java.sql.*;

public class ItemFormController {
    public AnchorPane root;
    public ComboBox cmbSupplierId;
    public TextField txtSupplierName;
    public TextField txtShop;
    public TextField txtSupplierTel;
    @FXML
    private TextField txtCode;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtQuantityOnHand;

    @FXML
    private TextField txtUnitPrice;

    @FXML
    private TableColumn<?, ?> colCode;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colQtyOnHand;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableView<?> tblItem;

    private ItemBo boImpl = FactoryBo.getBo(BoType.ITEM);

    public void initialize() throws SQLException {
        System.out.println("Item Form Just Loaded!");

    }


    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String code = txtCode.getText();
        String description = txtDescription.getText();
        double unitPrice = Double.parseDouble(txtUnitPrice.getText());
        int qtyOnHand = Integer.parseInt(txtQuantityOnHand.getText());

        var itemDto = new ItemDto(code, description, unitPrice, qtyOnHand);

//        ItemBoImpl boImpl = new ItemBoImpl();
        try {
            boolean isSaved = boImpl.saveItem(itemDto);
            if(isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "item saved!").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }

    }

    @FXML
    void txtCodeOnAction(ActionEvent event) {
        String code = txtCode.getText();


    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {

    }

    @FXML
    void cmbSupplierIdOnAction(ActionEvent event) {
        String supplierId = String.valueOf(cmbSupplierId.getValue());

    }
}
