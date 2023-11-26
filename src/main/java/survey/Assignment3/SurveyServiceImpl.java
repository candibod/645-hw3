package survey.Assignment3;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SurveyServiceImpl implements SurveyService {
    public SurveyRepository surveyRepository;

    public SurveyServiceImpl(SurveyRepository surveyRepository) {
        super();
        this.surveyRepository = surveyRepository;
    }

    @Override
    public Survey insertSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    @Override
    public List<Survey> fetchAllSurveys() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey getSurveyById(long id) {
        Optional<Survey> survey = surveyRepository.findById(id);
        if (survey.isPresent()) {
            return survey.get();
        } else {
            throw new ResourceNotFoundException("Survey", "Id", id);
        }
    }

    @Override
    public Survey updateSurvey(Survey survey, long id) {
        Survey survey1 = surveyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Survey", "Id", id));

        survey1.setFirstname(survey.getFirstname());
        survey1.setLastname(survey.getLastname());
        survey1.setStreetAddress(survey.getStreetAddress());
        survey1.setCity(survey.getCity());
        survey1.setState(survey.getState());
        survey1.setZip(survey.getZip());
        survey1.setTelephone(survey.getTelephone());
        survey1.setEmail(survey.getEmail());
        survey1.setDateOfSurvey(survey.getDateOfSurvey());
        survey1.setLikedAboutCampus(survey.getLikedAboutCampus());
        survey1.setInterestedIn(survey.getInterestedIn());
        survey1.setRecommendingLikeliness(survey.getRecommendingLikeliness());

        surveyRepository.save(survey1);
        return survey1;
    }

    @Override
    public void deleteSurvey(long id) {
        surveyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Survey", "Id", id));
        surveyRepository.deleteById(id);
    }
}
