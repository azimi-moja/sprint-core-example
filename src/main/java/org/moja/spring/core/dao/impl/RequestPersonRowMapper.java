package org.moja.spring.core.dao.impl;

import org.moja.spring.core.entity.RequestPerson;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestPersonRowMapper implements RowMapper<RequestPerson> {
    @Override
    public RequestPerson mapRow(ResultSet resultSet, int i) throws SQLException {
        RequestPerson person = new RequestPerson();
        person.setId(resultSet.getInt("id"));
        person.setFirstName(resultSet.getString("first_name"));
        person.setLastName(resultSet.getString("last_name"));
        return person;
    }
}
