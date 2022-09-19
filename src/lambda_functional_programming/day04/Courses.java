package lambda_functional_programming.day04;

public class Courses {
    private String season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;
    public Courses() {
    }
    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getAverageScore() {
        return averageScore;
    }
    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    @Override
    public String toString() {
        return "Course: Season=" + season + ", courseName=" + courseName + ", averageScore=" + averageScore
                + ", numberOfStudents=" + numberOfStudents;
    }
}
