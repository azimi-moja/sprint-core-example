package org.moja.spring.core.service.impl;

import org.moja.spring.core.dao.impl.RequestPersonDAOImplWithHibernate;
import org.moja.spring.core.entity.RequestPerson;
import org.moja.spring.core.service.RequestPersonService;

import java.util.List;

public class RequestPersonServiceImplWithHibernate implements RequestPersonService {

    private RequestPersonDAOImplWithHibernate requestPersonDao;

    public void setRequestPersonDao(RequestPersonDAOImplWithHibernate requestPersonDao) {
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
