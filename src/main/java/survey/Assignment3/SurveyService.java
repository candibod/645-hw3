package survey.Assignment3;

import java.util.List;

public interface SurveyService {
    Survey insertSurvey(Survey survey);

    List<Survey> fetchAllSurveys();

    Survey getSurveyById(long id);

    Survey updateSurvey(Survey survey, long id);

    void deleteSurvey(long id);
}
