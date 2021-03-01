package org.moja.spring.core.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.moja.spring.core.dao.RequestPersonDAO;
import org.moja.spring.core.entity.RequestPerson;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class RequestPersonDAOImplWithHibernate implements RequestPersonDAO {

    private HibernateTemplate template;

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    @Override
    public void saveRequestPerson(RequestPerson requestPerson) {
        template.save(requestPerson);
    }

    @Override
    public RequestPerson editRequestPerson(RequestPerson requestPerson) {
        template.update(requestPerson);
        return requestPerson;
    }

    @Override
    public RequestPerson getRequestPersonById(int requestID) {
        return template.get(RequestPerson.class, requestID);
    }

    @Override
    public List<RequestPerson> getAllRequestPersons() {
        DetachedCriteria criteria = DetachedCriteria.forClass(RequestPerson.class);
        return (List<RequestPerson>) template.findByCriteria(criteria);
    }
}
