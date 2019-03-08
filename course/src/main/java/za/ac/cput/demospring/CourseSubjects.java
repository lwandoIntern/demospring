package za.ac.cput.demospring;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class CourseSubjects {
    private ArrayList<String> courseSubject;


    private CourseSubjects(){}
    public CourseSubjects(Builder builder){
        this.courseSubject = builder.courseSubject;
    }
    public ArrayList<String> getSubjects(){
        return courseSubject;
    }
    public static class Builder{
        private ArrayList<String> courseSubject;

        public Builder courseSubject(ArrayList<String> subjectsList){
            this.courseSubject = subjectsList;
            return this;
        }
        public CourseSubjects build(){
            return new CourseSubjects(this);
        }
    }

}
