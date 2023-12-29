package resumebuilder;
import java.util.Scanner;
public class resumebuilder {

	public static void main(String[] args) {
		Resume resume = new Resume();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Resume Builder!");
        System.out.println("Please enter your personal information:");

        System.out.print("Full Name: ");
        resume.setFullName(scanner.nextLine());

        System.out.print("Address: ");
        resume.setAddress(scanner.nextLine());

        System.out.print("Phone Number: ");
        resume.setPhoneNumber(scanner.nextLine());

        System.out.print("Email: ");
        resume.setEmail(scanner.nextLine());

        System.out.println("Please enter your education information:");

        System.out.print("Degree: ");
        resume.setDegree(scanner.nextLine());

        System.out.print("Major: ");
        resume.setMajor(scanner.nextLine());

        System.out.print("University: ");
        resume.setUniversity(scanner.nextLine());

        System.out.print("Graduation Year: ");
        resume.setGraduationYear(scanner.nextLine());

        System.out.println("Please enter your work experience:");

        System.out.print("Job Title: ");
        resume.setJobTitle(scanner.nextLine());

        System.out.print("Company: ");
        resume.setCompany(scanner.nextLine());

        System.out.print("Job Description: ");
        resume.setJobDescription(scanner.nextLine());

        System.out.print("Start Date: ");
        resume.setStartDate(scanner.nextLine());

        System.out.print("End Date: ");
        resume.setEndDate(scanner.nextLine());

        System.out.println("Resume Successfully Built!");
        System.out.println(resume);
    }
}

class Resume {
    private String fullName;
    private String address;
    private String phoneNumber;
    private String email;
    private String degree;
    private String major;
    private String university;
    private String graduationYear;
    private String jobTitle;
    private String company;
    private String jobDescription;
    private String startDate;
    private String endDate;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", degree='" + degree + '\'' +  // Add the missing + sign here
                ", major='" + major + '\'' +
                ", university='" + university + '\'' +
                ", graduationYear='" + graduationYear + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}   





