package org.moja.spring.core.service;

import org.moja.spring.core.entity.RequestPerson;

import java.util.List;

public interface RequestPersonService {

    void saveRequestPerson(RequestPerson requestPerson);

    RequestPerson editRequestPerson(RequestPerson requestPerson);

    RequestPerson getRequestPersonById(int requestID);

    List<RequestPerson> getAllRequestPersons();
}
