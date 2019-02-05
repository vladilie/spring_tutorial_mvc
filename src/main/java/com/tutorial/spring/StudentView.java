package com.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@Scope("prototype")
public class StudentView {

    @Autowired
    private Properties countries;

    @Autowired
    private Properties languages;

    @Autowired
    private Properties operatingSystems;

    private Student student;

    public StudentView() {

    }

    public StudentView(Student student){
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent(){
        return this.student;
    }

    public String getFirstName() {
        return student.getFirstName();
    }

    public String getLastName() {
        return student.getLastName();
    }

    public String getCountry() {
        return student.getCountry();
    }

    public String getFavouriteLanguage() {
        return student.getFavouriteLanguage();
    }

    public String getCountryName() {
        return countries.getProperty(getCountry());
    }

    public String getFavouriteLanguageName() {
        return languages.getProperty(getFavouriteLanguage());
    }

    public Properties getCountries(){
        return countries;
    }

    public Properties getLanguages() {
        return languages;
    }

    public Properties getOperatingSystems() {
        return operatingSystems;
    }

    public String[] getOperatingSystemList() {
        return student.getOperatingSystemList();
    }

    public String[] getOperatingSystemNames() {
        String[] names = new String[getOperatingSystemList().length];
        int i = 0;
        for(String system: getOperatingSystemList()) {
            names[i++] = getOperatingSystems().getProperty(system);
        }
        return names;
    }

}
