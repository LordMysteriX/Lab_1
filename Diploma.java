public class Diploma {
        private int number;
        public String institutionOfHigherEducation;
        public int yearOfIssue;
        private int numberOfBlank;
        private String speciality;
        protected String educationalLevel;
        protected String qualification;

        public Diploma() {

        }

        public Diploma(String institutionOfHigherEducation, String speciality, String educationalLevel, String qualification, int number, int yearOfIssue, int numberOfBlank) {

            this.number = number;
            this.institutionOfHigherEducation = institutionOfHigherEducation;
            this.yearOfIssue = yearOfIssue;
            this.numberOfBlank = numberOfBlank;
            this.speciality = speciality;
            this.educationalLevel = educationalLevel;
            this.qualification = qualification;

        }

        public Diploma(int number, String institutionOfHigherEducation, int yearOfIssue, int numberOfBlank,  String speciality) {

            this.number = number;
            this.institutionOfHigherEducation = institutionOfHigherEducation;
            this.yearOfIssue = yearOfIssue;
            this.numberOfBlank = numberOfBlank;
            this.speciality = speciality;

        }


        public int printNumberOfBlank() {
            return numberOfBlank;
        }

        public String toString() {
            return "Diploma: " + "Number: " + number + ", institution of higher education: " +
                    institutionOfHigherEducation + ", Year of issue: " + yearOfIssue + ", Number of blank: " +
                    ", Speciality: " + speciality + ", Educational level: " + educationalLevel + ", Qualification: " +
                    qualification;
        }

        public void resetValues(String institutionOfHigherEducation, String speciality, String educationalLevel, String qualification, int number, int yearOfIssue, int numberOfBlank){

            this.number = number;
            this.institutionOfHigherEducation = institutionOfHigherEducation;
            this.yearOfIssue = yearOfIssue;
            this.numberOfBlank = numberOfBlank;
            this.speciality = speciality;
            this.educationalLevel = educationalLevel;
            this.qualification = qualification;

        }

        public void setNumber(int newNumber) {
            this.number = newNumber;
        }

        public void setInstitutionOfHigherEducation(String newInstitutionOfHigherEducation) {
            this.institutionOfHigherEducation = newInstitutionOfHigherEducation;
         }

        public void setYearOfIssue(int newYearOfIssue) {
            this.yearOfIssue = newYearOfIssue;
        }

        public void setNumberOfBlank(int newNumberOfBlank) {
            this.numberOfBlank = newNumberOfBlank;
        }

        public void setSpeciality(String newSpeciality) {
            this.speciality = newSpeciality;
        }

        public void setEducationalLevel(String newEducationalLevel) {
            this.educationalLevel = newEducationalLevel;
        }

        public void setQualification(String newQualification) {
            this.qualification = newQualification;
        }
    }

