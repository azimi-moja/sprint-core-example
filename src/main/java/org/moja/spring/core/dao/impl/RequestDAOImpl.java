package org.moja.spring.core.dao.impl;

import org.moja.spring.core.dao.RequestDAO;
import org.moja.spring.core.entity.Request;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RequestDAOImpl implements RequestDAO {

    private DataSource dataSource;

    @Override
    public void saveRequest(Request request) {
        Connection connection = null;
        PreparedStatement ps;
        try {
            connection = dataSource.getConnection();
            String query = "insert into ";

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Request editRequest(Request request) {
        return null;
    }

    @Override
    public Request getRequestById(int requestID) {
        return null;
    }

    @Override
    public List<Request> getAllRequests() {
        return null;
    }
}
