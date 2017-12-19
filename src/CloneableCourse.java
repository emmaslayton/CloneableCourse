/**"CloneableCourse"
 *
 * @author emmaslayton
 * Created 2017
 *
 * Project 13, CSC201-004N
 * Assignment 13.13
 */

public class CloneableCourse implements Cloneable, Comparable<CloneableCourse> {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    private CloneableCourse(String courseName) {
        this.courseName = courseName;
        this.students = new String[100];
    }

    private void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    private String[] getStudents() {
        return students;
    }

    private int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Exercise 10.9
    }

    public static void main(String[] args) throws CloneNotSupportedException {
            // Courses
            CloneableCourse course1 = new CloneableCourse("Data Structures");
            CloneableCourse course2 = new CloneableCourse("Database Systems");
            CloneableCourse course3 = new CloneableCourse("Computer Graphics");

            // Students in each course
            course1.addStudent("Peter Jones");
            course1.addStudent("Brian Smith");
            course1.addStudent("Anne Kennedy");
            course2.addStudent("Peter Jones");
            course2.addStudent("Deborah Lee");
            course1.addStudent("Rita Dillon");

            // Cloning students from course1 over to course3.
            course3.students = course1.students.clone();
            course3.numberOfStudents = course1.numberOfStudents;

            // print title
            System.out.println("======================================================");
            System.out.println("=====                                            =====");
            System.out.println("=====              CloneableCourse               =====");
            System.out.println("=====              By @emmaslayton               =====");
            System.out.println("=====                                            =====");
            System.out.println("======================================================");
            System.out.println("");
            System.out.println("");


            // print course info
            System.out.println(course1.getCourseName());
            System.out.println("|| Number enrolled:  " + course1.getNumberOfStudents());
            String[] studentsC1 = course1.getStudents();
            System.out.print("|| Student names:");
            for (int i = 0; i < course1.getNumberOfStudents(); ++i) {
                System.out.print(" " + studentsC1[i] + ",");
            }

            System.out.println("");
            System.out.println("");
            System.out.println(course2.getCourseName());
            System.out.println("|| Number enrolled:  " + course2.getNumberOfStudents());
            System.out.print("|| Student names:");
            String[] studentsC2 = course2.getStudents();
            for (int i = 0; i < course2.getNumberOfStudents(); ++i) {
                System.out.print(" " + studentsC2[i] + ",");
            }

            System.out.println("");
            System.out.println("");
            System.out.println(course3.getCourseName());
            System.out.println("|| Number enrolled:  " + course3.getNumberOfStudents());
            String[] studentsC3 = course3.getStudents();
            System.out.print("|| Student names:");
            for (int i = 0; i < course3.getNumberOfStudents(); ++i) {
                System.out.print(" " + studentsC3[i] + ",");
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("======================================================");
        }

        @Override /* Override the protected clone method defined in
         the Object class, and strengthen its accessibility */
        public Object clone () {
            try {
                return super.clone();
            } catch (CloneNotSupportedException ex) {
                return null;
            }
        }

        @Override
        public int compareTo (CloneableCourse o){
            return 0;

        }
    }
