package org.moja.spring.core.dao.impl;

import org.moja.spring.core.dao.RequestPersonDAO;
import org.moja.spring.core.entity.RequestPerson;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class RequestPersonDAOImpl implements RequestPersonDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /*
     *JDBC connection example
     */
//    @Override
//    public void saveRequestPerson(RequestPerson requestPerson) {
//        Connection connection = null;
//        PreparedStatement ps = null;
//        try {
//            connection = dataSource.getConnection();
//            String query = "insert into request_person(first_name, last_name) VALUES(?, ?)";
//            ps = connection.prepareStatement(query);
//            ps.setString(1, requestPerson.getFirstName());
//            ps.setString(2, requestPerson.getLastName());
//            int result = ps.executeUpdate();
//            if(result > 0){
//                System.out.println("requestPerson is added!!!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                ps.close();
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    @Override
    public void saveRequestPerson(RequestPerson requestPerson) {
        String query = "insert into request_person(first_name, last_name) VALUES(?, ?)";
        int result = jdbcTemplate.update(query, new Object[]{requestPerson.getFirstName(), requestPerson.getLastName()});
        if (result > 0) {
            System.out.println("requestPerson is added!!!");
        }
    }

    @Override
    public RequestPerson editRequestPerson(RequestPerson requestPerson) {
        return null;
    }

    @Override
    public RequestPerson getRequestPersonById(int requestID) {
        String query = "select * from request_person where id = ?";
        RequestPerson person = jdbcTemplate.queryForObject(query, new RequestPersonRowMapper(), requestID);
        return person;
    }

    @Override
    public List<RequestPerson> getAllRequestPersons() {
        return null;
    }
}
