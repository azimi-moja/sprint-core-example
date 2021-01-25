package org.moja.spring.core.entity;

import java.util.Date;

public class Request {

    private Integer id;
    private Integer requestCode;
    private Date requestDate;
    private Byte status;
    private RequestPerson requestPerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(Integer requestCode) {
        this.requestCode = requestCode;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public RequestPerson getRequestPerson() {
        return requestPerson;
    }

    public void setRequestPerson(RequestPerson requestPerson) {
        this.requestPerson = requestPerson;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", requestCode=" + requestCode +
                ", requestDate=" + requestDate +
                ", status=" + status +
                ", requestPerson=" + requestPerson +
                '}';
    }
}
