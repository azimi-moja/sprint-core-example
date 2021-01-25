package org.moja.spring.core.dao;

import org.moja.spring.core.dao.impl.RequestPersonDAO;
import org.moja.spring.core.entity.RequestPerson;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RequestPersonDAOImpl implements RequestPersonDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void saveRequestPerson(RequestPerson requestPerson) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = dataSource.getConnection();
            String query = "insert into request_person(first_name, last_name) VALUES(?, ?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, requestPerson.getFirstName());
            ps.setString(2, requestPerson.getLastName());
            int result = ps.executeUpdate();
            if(result > 0){
                System.out.println("requestPerson is added!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public RequestPerson editRequestPerson(RequestPerson requestPerson) {
        return null;
    }

    @Override
    public RequestPerson getRequestPersonById(int requestID) {
        return null;
    }

    @Override
    public List<RequestPerson> getAllRequestPersons() {
        return null;
    }
}
