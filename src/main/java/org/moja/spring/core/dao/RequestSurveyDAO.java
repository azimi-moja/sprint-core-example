package org.moja.spring.core.dao;

import org.moja.spring.core.entity.RequestSurvey;
import java.util.List;

public interface RequestSurveyDAO {

    void saveRequestSurvey(RequestSurvey requestSurvey);

    RequestSurvey editRequestSurvey(RequestSurvey requestSurvey);

    RequestSurvey getRequestSurveyById(int requestSurveyID);

    List<RequestSurvey> getAllRequestSurveys();

}
