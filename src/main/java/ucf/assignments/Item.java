package ucf.assignments;

public class Item {

    private static String description;
    private static String duedate;
    private static String check;

    public static String readdescription() {

        return description;

    }

    public void newdescription(String newdescrption) {

        this.description = newdescrption;

    }

    public static String readduedate() {

        return duedate;

    }

    public void newduedate(String newduedate) {

        this.duedate = newduedate;

    }

    public static String readcheck() {

        return check;

    }

    public void newcheck(String newcheck) {

        this.check = newcheck;

    }

}
