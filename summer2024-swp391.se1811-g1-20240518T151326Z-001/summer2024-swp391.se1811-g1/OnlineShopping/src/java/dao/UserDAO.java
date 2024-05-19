/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author tungl
 */
public class UserDAO extends DBContext {

    public User getUserById(int id) {
        String sql = "SELECT [user_id]\n"
                + "      ,[user_name]\n"
                + "      ,[user_old]\n"
                + "      ,[user_gender]\n"
                + "      ,[user_email]\n"
                + "      ,[user_phone]\n"
                + "      ,[user_avater]\n"
                + "      ,[role_id]\n"
                + "      ,[user_account_id]\n"
                + "      ,[user_address]\n"
                + "  FROM [dbo].[User]"
                + "  WHERE user_id = ?";
        User user = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    user = new User();
                    user.setUser_id(rs.getInt("user_id"));
                    user.setUser_name(rs.getString("user_name"));
                    user.setOld(rs.getInt("user_old"));
                    user.setGender(rs.getBoolean("user_gender"));
                    user.setEmail(rs.getString("user_email"));
                    user.setPhone(rs.getString("user_phone"));
                    user.setAvata(rs.getString("user_avater"));
                    user.setRole_id(rs.getInt("role_id"));
                    user.setUser_account_id(rs.getInt("user_account_id"));
                    user.setUser_address(rs.getString("user_address"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT [user_id], [user_name], [user_old], [user_gender], [user_email], [user_phone], [user_avater], [role_id], [user_account_id], [user_address] "
                + "FROM [dbo].[User]";

        try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setOld(rs.getInt("user_old"));
                user.setGender(rs.getBoolean("user_gender"));
                user.setEmail(rs.getString("user_email"));
                user.setPhone(rs.getString("user_phone"));
                user.setAvata(rs.getString("user_avater"));
                user.setRole_id(rs.getInt("role_id"));
                user.setUser_account_id(rs.getInt("user_account_id"));
                user.setUser_address(rs.getString("user_address"));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void main(String[] args) {
        UserDAO uDao = new UserDAO();
        System.out.println(uDao.getUserById(1));
    }

}
