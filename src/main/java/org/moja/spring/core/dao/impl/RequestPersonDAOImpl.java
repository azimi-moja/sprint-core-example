package org.moja.spring.core.dao.impl;

import org.moja.spring.core.dao.RequestPersonDAO;
import org.moja.spring.core.entity.RequestPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class RequestPersonDAOImpl
        extends NamedParameterJdbcDaoSupport
        {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void init() {
        setDataSource(dataSource);
    }

    /*
     * use NamedParameterJdbcTemplate
     */
//    @Autowired
//    private NamedParameterJdbcTemplate jdbcTemplate;

    /*
     * use jdbcTemplate (please class extends JdbcDaoSupport)
     */
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @PostConstruct
//    private void init() {
//        setJdbcTemplate(jdbcTemplate);
//    }

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

//    @Override
    public void saveRequestPerson(RequestPerson requestPerson) {
        String query = "insert into request_person(first_name, last_name) VALUES(:first_name, :last_name)";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("first_name", requestPerson.getFirstName())
                .addValue("last_name", requestPerson.getLastName());
        RequestPerson person = getNamedParameterJdbcTemplate().queryForObject(query, parameterSource, new RequestPersonRowMapper());
        if (person != null) {
            System.out.println("requestPerson is added!!!");
        }
    }

//    @Override
    public RequestPerson editRequestPerson(RequestPerson requestPerson) {
        String query = "update request_person set first_name=:first_name, last_name=:last_name where id =:id";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("first_name", requestPerson.getFirstName())
                .addValue("last_name", requestPerson.getLastName())
                .addValue("id", requestPerson.getId());
        RequestPerson person = getNamedParameterJdbcTemplate().queryForObject(query, parameterSource, new RequestPersonRowMapper());
        if (person != null) {
            System.out.println("requestPerson is updated!!!");
        }
        return requestPerson;
    }

//    @Override
    public RequestPerson getRequestPersonById(int requestID) {
        String query = "select * from request_person where id = :id";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("id", requestID);
        RequestPerson person = getNamedParameterJdbcTemplate().queryForObject(query, parameterSource, new RequestPersonRowMapper());
        return person;
    }

//    @Override
    public List<RequestPerson> getAllRequestPersons() {
        String query = "select * from request_person";
        return getNamedParameterJdbcTemplate().query(query, new RequestPersonRowMapper());
    }
}
