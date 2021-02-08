package org.moja.spring.core.dao.impl;

import org.moja.spring.core.dao.RequestPersonDAO;
import org.moja.spring.core.entity.RequestPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class RequestPersonDAOImpl extends JdbcDaoSupport implements RequestPersonDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void init(){
        setJdbcTemplate(jdbcTemplate);
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
        int result = getJdbcTemplate().update(query, new Object[]{requestPerson.getFirstName(), requestPerson.getLastName()});
        if (result > 0) {
            System.out.println("requestPerson is added!!!");
        }
    }

    @Override
    public RequestPerson editRequestPerson(RequestPerson requestPerson) {
        String query = "update request_person set first_name=? where id =?";
        int result = getJdbcTemplate().update(query, requestPerson.getFirstName(), requestPerson.getId());
        if (result > 0) {
            System.out.println("requestPerson is updated!!!");
        }
        return requestPerson;
    }

    @Override
    public RequestPerson getRequestPersonById(int requestID) {
        String query = "select * from request_person where id = ?";
        RequestPerson person = getJdbcTemplate().queryForObject(query, new RequestPersonRowMapper(), requestID);
        return person;
    }

    @Override
    public List<RequestPerson> getAllRequestPersons() {
        String query = "select * from request_person";
        return getJdbcTemplate().query(query, new RequestPersonRowMapper());
    }
}
