package survey.Assignment3;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "survey")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Survey implements Serializable {

    public Survey() {
    }

    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstname;

    @Column(name = "last_name", nullable = false)
    private String lastname;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "zip", nullable = false)
    private String zip;

    @Column(name = "telephone", nullable = false)
    private String telephone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "date_of_survey", nullable = false)
    private String dateOfSurvey;

    @Column(name = "liked_about_campus", nullable = false)
    private String likedAboutCampus;

    @Column(name = "interested_in", nullable = false)
    private String interestedIn;

    @Column(name = "likeliness", nullable = false)
    private String recommendingLikeliness;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(String dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public String getLikedAboutCampus() {
        return likedAboutCampus;
    }

    public void setLikedAboutCampus(String likedAboutCampus) {
        this.likedAboutCampus = likedAboutCampus;
    }

    public String getInterestedIn() {
        return interestedIn;
    }

    public void setInterestedIn(String interestedIn) {
        this.interestedIn = interestedIn;
    }

    public String getRecommendingLikeliness() {
        return recommendingLikeliness;
    }

    public void setRecommendingLikeliness(String recommendingLikeliness) {
        this.recommendingLikeliness = recommendingLikeliness;
    }

    @Override
    public String toString() {
        return "Survey [id=" + id + ",firstname=" + firstname + ", lastname=" + lastname + ", streetAddress="
                + streetAddress
                + ", city=" + city + ", state=" + state + ", zip=" + zip + ", telephone=" + telephone + ", email="
                + email + ", dateOfSurvey=" + dateOfSurvey + ", likedAboutCampus=" + likedAboutCampus
                + ", interestedIn=" + interestedIn + ", recommendingLikeliness=" + recommendingLikeliness + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Survey temp = (Survey) obj;
        return Objects.equals(firstname, temp.firstname)
                && Objects.equals(lastname, temp.lastname)
                && Objects.equals(streetAddress, temp.streetAddress)
                && Objects.equals(city, temp.city)
                && Objects.equals(state, temp.state)
                && Objects.equals(zip, temp.zip)
                && Objects.equals(telephone, temp.telephone)
                && Objects.equals(email, temp.email)
                && Objects.equals(dateOfSurvey, temp.dateOfSurvey)
                && Objects.equals(likedAboutCampus, temp.likedAboutCampus)
                && Objects.equals(interestedIn, temp.interestedIn)
                && Objects.equals(recommendingLikeliness, temp.recommendingLikeliness)
                && Objects.equals(id, temp.id);
    }

}
