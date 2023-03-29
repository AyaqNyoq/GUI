
public class Name {

    String Fname;
    String Lname;
    
    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public Name(String string, String string2) {
        Lname = string;
        Fname = string2;
    }



}
