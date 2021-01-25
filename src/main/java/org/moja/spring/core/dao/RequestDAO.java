package org.moja.spring.core.dao;

import org.moja.spring.core.entity.Request;

import java.util.List;

public interface RequestDAO {

    void saveRequest(Request request);

    Request editRequest(Request request);

    Request getRequestById(int requestID);

    List<Request> getAllRequests();

}
