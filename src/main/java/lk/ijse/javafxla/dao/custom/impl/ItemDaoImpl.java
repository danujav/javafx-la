package lk.ijse.javafxla.dao.custom.impl;

/*
    @author DanujaV
    @created 9/16/23 - 4:36 PM   
*/

import lk.ijse.javafxla.dao.custom.ItemDao;
import lk.ijse.javafxla.db.DbConnection;
import lk.ijse.javafxla.entity.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean save(Item entity) throws Exception {
        Connection con = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?, ?, ?, ?)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, entity.getCode());
        pstm.setString(2, entity.getDescription());
        pstm.setDouble(3, entity.getUnitPrice());
        pstm.setInt(4, entity.getQtyOnHand());

        return pstm.executeUpdate() > 0;
    }

    @Override
    public boolean update(Item entity) throws Exception {
        return false;
    }

    @Override
    public Item search(String s) throws Exception {
        return null;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public List<Item> getAll() throws Exception {
        return null;
    }
}
