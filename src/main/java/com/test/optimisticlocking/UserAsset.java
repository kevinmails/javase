package com.test.optimisticlocking;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 陈彬
 *         Date 2017/11/26
 *         Time 16:40
 */
public class UserAsset {

    private int userId;
    private BigDecimal asset;
    private int version;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigDecimal getAsset() {
        return asset;
    }

    public void setAsset(BigDecimal asset) {
        this.asset = asset;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean updateUserAssert(UserAsset asset) {

        Connection connection = JdbcConn.getConn();

        String sqlUpdate = "update T_USER_ASSET t set t.assert = ? , t.version = t.version + 1 where t.user_id=? and t.version=?";

        try {

            PreparedStatement statement = connection.prepareStatement(sqlUpdate);
            statement.setBigDecimal(1, asset.getAsset());
            statement.setInt(2, asset.getUserId());
            statement.setInt(3, asset.getVersion());
            return statement.executeUpdate() > 0 ? true : false;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public UserAsset getAssert(int userId) {

        Connection connection = JdbcConn.getConn();

        String sql = "select * from T_USER_ASSET t where t.user_id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet set = statement.executeQuery();
            UserAsset asset = new UserAsset();
            while (set.next()) {
                asset.setUserId(set.getInt(1));
                asset.setAsset(set.getBigDecimal(2));
                asset.setVersion(set.getInt(5));
            }
            return asset;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
