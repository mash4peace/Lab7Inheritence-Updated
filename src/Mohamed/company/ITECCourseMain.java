package Mohamed.company;

public class ITECCourseMain {

    public static void main(String[] args) {
// Here I am accessing course information
	ITECHCOURSE concepts = new ITECHCOURSE(" info Itech Concepts",
            1100, 30, "T3050");
	// Adding studenrs
	concepts.addStudent(" Max");
	concepts.addStudent(" Nancy ");
	concepts.addStudent(" Orsan ");
	concepts.writeCourseInfo(); // Displays data
	concepts.availableSeats();


	}
}
