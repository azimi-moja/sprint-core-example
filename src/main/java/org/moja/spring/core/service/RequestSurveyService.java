package org.moja.spring.core.service;

import org.moja.spring.core.entity.RequestSurvey;

import java.util.List;

public interface RequestSurveyService {

    void saveRequestSurvey(RequestSurvey requestSurvey);

    RequestSurvey editRequestSurvey(RequestSurvey requestSurvey);

    RequestSurvey getRequestSurveyById(int requestSurveyID);

    List<RequestSurvey> getAllRequestSurveys();
}
