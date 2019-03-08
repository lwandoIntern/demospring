package za.ac.cput.demospring;

public class Code {
    private String codeCourse;
    private Code(){}
    public Code(Builder builder) {this.codeCourse = builder.codeCourse;}
    public String getCodeCourse() {return codeCourse;}
    public static class Builder{
        private String codeCourse;
        public Builder codeCourse(String value){this.codeCourse = value;return this;}
        public Code build(){return new Code(this);}
    }

}
