package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.INewDao;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.model.NewModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewDao implements INewDao {
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url       = "jdbc:mysql://localhost:3306/newservlet12month2018";
            String user      = "root";
            String password  = "12345678";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }

    }

    @Override
    public List<NewModel> findByCategoryId(long categoryId) {
        List<NewModel>  results = new ArrayList<>();
        String sql = "SELECT * from news where categoryId = ? ";
        //open connection
        Connection connection = getConnection();
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        if (connection != null){
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, categoryId);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()){
                    CategoryModel categoryModel = new CategoryModel();
                    categoryModel.setId(resultSet.getLong("id"));
                    categoryModel.setCode(resultSet.getString("code"));
                    categoryModel.setName(resultSet.getString("name"));
                    results.add(categoryModel);
                }

                return results;
            } catch (SQLException e) {
                return null;
            }finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (resultSet != null) {
                        resultSet.close();
                    }
                }catch (SQLException e){
                    return null;
                }
            }
        }
        return null;
    }

    }

