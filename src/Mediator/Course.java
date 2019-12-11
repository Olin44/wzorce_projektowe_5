package Mediator;

public class Course {
    private boolean examPassed;
    private boolean practicalPassed;
    private boolean coursePassed;

    public Course(boolean examPassed, boolean practicalPassed, boolean coursePassed) {
        this.examPassed = examPassed;
        this.practicalPassed = practicalPassed;
        this.coursePassed = coursePassed;
    }

    public void setExamPassed(boolean examPassed) {
        this.examPassed = examPassed;
    }

    public void setPracticalPassed(boolean practicalPassed) {
        this.practicalPassed = practicalPassed;
    }

    public void setCoursePassed(boolean coursePassed) {
        this.coursePassed = coursePassed;
    }

    public boolean isExamPassed() {
        return examPassed;
    }

    public boolean isPracticalPassed() {
        return practicalPassed;
    }

    public boolean isCoursePassed() {
        return coursePassed;
    }
}
