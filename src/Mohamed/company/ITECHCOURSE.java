package Mohamed.company;

import java.util.ArrayList;

/**
 * Created by mash4 on 3/14/2017.
 */
public class ITECHCOURSE {

    // I am initiating a private varibale to store
    // their data in ITECH object
    private String name;
    private int code;
    private int maxStudents;
    private String room;
    private ArrayList<String> students;

// Getters and seters
    public int getCode() {
        return code;

    }

    public void setCode(int code) {
        this.code = code;

    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;

    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents() {
        this.maxStudents = maxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
// A constrctor of the object
    public ITECHCOURSE(String courseName, int courseCode, int coursemaxStudents, String room) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<>();
        this.maxStudents = coursemaxStudents;
    }
    // This methods allows to add students

    public void addStudent(String studentName) {
        // Checking if there are available seats for the students.
        if (students.size() == maxStudents) {
            System.out.println("Course is full - can't add " + studentName);
            System.out.println("The maximum numbers of students is " + maxStudents);
        } else {
            students.add(studentName);
        }
    }
// A mothod to display information

    public void writeCourseInfo() {
        System.out.println("Course name : " + name);
        System.out.println("Course code : " + code);
        System.out.println("Students enrolled !!!!");
        int counter = 0;

        for (String student : students) {
            counter++;
            System.out.println("Student number " + counter + " :" + student);



        }

        System.out.println("There are " + getNumberOfStudents() + " students are enrolled in this course ");
        System.out.println("The max number of students for this course is " + maxStudents);


    }
//To get number of students enrolled for the course
    public int getNumberOfStudents() {
        return this.students.size();

    }

    public void availableSeats(){
        int aviableSeats = 0;
        int i = 0;
        for ( i = 0; i < students.size() ; i++) {
            aviableSeats =maxStudents- students.size();



        }
        System.out.println("Available seats : "+aviableSeats + " seats are waiting for enrollments !!!");



    }



}
