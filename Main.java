public class Main {

    public static void main(String[] args){
        Diploma programmer = new Diploma("Lviv polytechnical University", "Computer science","Bachelor","Programmer of software", 0045465, 2002, 54755565);
        Diploma jurist = new Diploma(989879,"Oxford University", 2005,8765754,"Jurist");
        Diploma architect = new Diploma();

        System.out.println(programmer.toString());
        System.out.println(jurist.toString());
        System.out.println(architect.toString());

        architect.setNumber(57758475);
        architect.setInstitutionOfHigherEducation("Harvard University");
        architect.setYearOfIssue(2007);
        architect.setNumberOfBlank(006757656);
        architect.setSpeciality("architect of skyscrapers");

        System.out.println(architect.toString());

        System.out.println("Static Number_of_blank: " + programmer.printNumberOfBlank());
        System.out.println("Static Number_of_blank: " + jurist.printNumberOfBlank());
        System.out.println("Static Number_of_blank: " + architect.printNumberOfBlank());


    }
}
