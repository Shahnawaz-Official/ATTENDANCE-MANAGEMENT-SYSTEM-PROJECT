import java.util.*;

public class AttendanceSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Student data store in arrays
        int[] studentIDs = {101, 102, 103, 104, 105,106,109};
        String[] studentNames = {"Shahnawaz", "Aditya Raj", "inderjeet", "Priyanshu", "kishan","Parkash Kumar","jhon"};
  
        // Step 2: Attendance record array
        boolean[] isPresent = new boolean[studentIDs.length]; // false by default

        System.out.println(" BCA Class Attendance Management System ");
        System.out.println("Enter 0 Present And Absent List.\n");


        while (true) {
            System.out.print("Enter Student ID (SID): ");
            int sid = sc.nextInt();

            if (sid == 0) {
                break; // Stop attendance marking
            }

            // Step 3: Check if SID exists
            boolean found = false;
            for (int i = 0; i < studentIDs.length; i++) {
                if (studentIDs[i] == sid) {
                    found = true;
                    if (!isPresent[i]) {
                        isPresent[i] = true;
                        System.out.println(" Attendance marked for " + studentNames[i] + " (SID: " + sid + ")");
                    } else {
                        System.out.println("Attendance already marked for " + studentNames[i]);
                    }
                    break;
                }
            }

            if (!found) {
                System.out.println(" Student with SID "+ studentNames + sid + " not present in class.");
            }
        }

        // Step 4: Display attendance summary
        System.out.println("\n BCA Class Present or Absent List  ");
        for (int i = 0; i < studentIDs.length; i++) {
            String status = isPresent[i] ? "Present" : "Absent";
            System.out.println(studentNames[i] + " (SID: " + studentIDs[i] + ") => " + status);
        }

        sc.close();
    }
}
