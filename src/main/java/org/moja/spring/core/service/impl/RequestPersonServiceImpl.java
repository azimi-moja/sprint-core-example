package org.moja.spring.core.service.impl;

import org.moja.spring.core.dao.impl.RequestPersonDAOImpl;
import org.moja.spring.core.entity.RequestPerson;
import org.moja.spring.core.service.RequestPersonService;

import java.util.List;

public class RequestPersonServiceImpl implements RequestPersonService {

    private RequestPersonDAOImpl requestPersonDao;

    public void setRequestPersonDao(RequestPersonDAOImpl requestPersonDao) {
        this.requestPersonDao = requestPersonDao;
    }

    @Override
    public void saveRequestPerson(RequestPerson requestPerson) {
        requestPersonDao.saveRequestPerson(requestPerson);
    }

    @Override
    public RequestPerson editRequestPerson(RequestPerson requestPerson) {
        return requestPersonDao.editRequestPerson(requestPerson);
    }


    @Override
    public RequestPerson getRequestPersonById(int requestID) {
        return requestPersonDao.getRequestPersonById(requestID);
    }

    @Override
    public List<RequestPerson> getAllRequestPersons() {
        return requestPersonDao.getAllRequestPersons();
    }
}
