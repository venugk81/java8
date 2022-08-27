package datasupplier;

public class Student {
    private String firstname;

    private String lname;
    private int stdId;
    private String standard;

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }


    public Student(String firstname, String lname, int stdId, String standard) {
        this.firstname = firstname;
        this.lname = lname;
        this.stdId = stdId;
        this.standard = standard;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lname='" + lname + '\'' +
                ", stdId=" + stdId +
                ", standard='" + standard + '\'' +
                '}';
    }
}
