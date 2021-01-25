package org.moja.spring.core.entity;

import java.util.Date;

public class RequestSurvey {

    private Integer id;
    private Date surveyDate;
    private Byte status;
    private Request request;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "RequestSurvey{" +
                "id=" + id +
                ", surveyDate=" + surveyDate +
                ", status=" + status +
                ", request=" + request +
                '}';
    }
}
