package lhind.ex1.survey;

public class Candidate {
    private String first_name;
    private String last_name;
    private String email;
    private int phone_nr;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_nr() {
        return phone_nr;
    }

    public void setPhone_nr(int phone_nr) {
        this.phone_nr = phone_nr;
    }

    public Candidate(String first_name, String last_name, String email, int phone_nr) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_nr = phone_nr;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_nr=" + phone_nr +
                '}';
    }
}