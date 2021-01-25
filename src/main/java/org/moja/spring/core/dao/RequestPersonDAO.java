package org.moja.spring.core.dao;

import org.moja.spring.core.entity.RequestPerson;
import java.util.List;

public interface RequestPersonDAO {

    void saveRequestPerson(RequestPerson requestPerson);

    RequestPerson editRequestPerson(RequestPerson requestPerson);

    RequestPerson getRequestPersonById(int requestID);

    List<RequestPerson> getAllRequestPersons();
}
