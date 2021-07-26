package Lab.FirstLab2;

import java.util.List;

public class MotherBoard extends Part{
    private String name ;
    private String company ;

    public MotherBoard(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



}
