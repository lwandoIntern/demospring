package za.ac.cput.demospring;

public class Duration {
    private String duration;

    private Duration(){}
    public Duration(Builder builder){
        this.duration = builder.duration;
    }

    public String getDuration() {
        return duration;
    }

    public static class Builder{
        private String duration;

        public Builder duration(String value){
            this.duration = value;
            return this;
        }
        public Duration build(){
            return new Duration(this);
        }
    }
}
