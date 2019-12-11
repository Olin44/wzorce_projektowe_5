package Mediator;

public class Menu {
    private Course course;

    public Menu(Course course) {
        this.course = course;
    }

    private String practicalPassed(boolean examPassed){
        if(examPassed){
            return "\n1. Ćwiczenia zaliczone. X";
        }
        else{
            return "\n1. Ćwiczenia zaliczone.";
        }
    }

    private String examPassed(boolean examPassed){
        if(examPassed){
            return "\n2. Wykład (egzamin) zaliczony. X";
        }
        else{
            return "\n2. Wykład (egzamin) zaliczony.";
        }
    }

    private String coursePassed(boolean examPassed){
        if(examPassed){
            return "\n3. Ćwiczenia zaliczone. X";
        }
        else{
            return "\n3. Ćwiczenia zaliczone.";
        }
    }

    public String printMenu(Course course){
        return practicalPassed(course.isPracticalPassed()) +
               examPassed(course.isExamPassed()) +
                coursePassed(course.isCoursePassed()) +
                "\n4. Wyjście z programu. ";
    }
}
