package Oops_Coding;
/*Student Management System
Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.

Examples:
Input:
Create student with name="Bob", rollNo=101, section="A"
Output:
Student: Bob, Roll No: 101, Section: A
💡 Explanation:Implement a Student class with appropriate constructor and a method to display formatted student information.
*/
    class Student {
        String name;
        int rollNo;
        String section;

        // Parameterized constructor
        public Student(String name, int rollNo, String section) {
            this.name = name;
            this.rollNo = rollNo;
            this.section = section;
        }

        // Method to display formatted student information
        public void displayStudentInfo() {
            System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
            class Main {
                public static void main(String[] args) {
                    // Create student object with name="Bob", rollNo=101, section="A"
                    Student s1 = new Student("Bob", 101, "A");

                    // Output the details
                       s1.displayStudentInfo();
                 }
            }
        }
    }