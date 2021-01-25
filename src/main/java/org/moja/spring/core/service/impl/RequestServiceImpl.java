package org.moja.spring.core.service.impl;

import org.moja.spring.core.dao.RequestDAO;
import org.moja.spring.core.entity.Request;
import org.moja.spring.core.service.RequestService;

import java.util.List;

public class RequestServiceImpl implements RequestService {

    private RequestDAO requestDao;

    public void setRequestDAO(RequestDAO requestDAO) {
        this.requestDao = requestDAO;
    }

    @Override
    public void saveRequest(Request request) {
        requestDao.saveRequest(request);
    }

    @Override
    public Request editRequest(Request request) {
        return requestDao.editRequest(request);
    }

    @Override
    public Request getRequestById(int requestID) {
        return requestDao.getRequestById(requestID);
    }

    @Override
    public List<Request> getAllRequests() {
        return requestDao.getAllRequests();
    }
}
