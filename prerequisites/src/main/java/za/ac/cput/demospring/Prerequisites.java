package za.ac.cput.demospring;

public class Prerequisites {
    private String prereqs;

    private Prerequisites(){}
    public Prerequisites(Builder builder){
        this.prereqs = builder.prereqs;
    }
    public String getPrereqs(){return prereqs;}
    public static class Builder{
        private String prereqs;
        public Builder prereqs(String value){this.prereqs = value;return this;}
        public Prerequisites build(){return new Prerequisites(this);}
    }
}
