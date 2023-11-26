package survey.Assignment3;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/survey")
public class SurveyController {
    public SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        super();
        this.surveyService = surveyService;
    }

    @PostMapping
    public ResponseEntity<Survey> insertSurvey(@RequestBody Survey survey) {
        return new ResponseEntity<Survey>(surveyService.insertSurvey(survey),
                HttpStatus.CREATED);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @GetMapping
    public List<Survey> fetchAllStudents() {
        return surveyService.fetchAllSurveys();
    }

    @GetMapping("{id}")
    public ResponseEntity<Survey> getSurveyById(@PathVariable("id") long id) {
        return new ResponseEntity<Survey>(surveyService.getSurveyById(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Survey> updateSurvey(@PathVariable("id") long id, @RequestBody Survey survey) {
        return new ResponseEntity<Survey>(surveyService.updateSurvey(survey, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteSurvey(@PathVariable("id") long id) {

        surveyService.deleteSurvey(id);
        return new ResponseEntity<String>("Survey deleted successfully.", HttpStatus.OK);
    }
}
