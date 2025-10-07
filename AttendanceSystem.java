import java.util.Scanner;

public class AttendanceSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rollNumbers = {
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,
            51,52,53,54,55,56,57,58,59,60,
            61,62,63,64,65,66,67,68,69,70,
            71,72,73,74,75,76,77,78,79
        };

        String[] studentNames = {
            "Abdul Shahabaz","Abhay Chandel","Aditya Kumar","Aditya Raj","Aman Kumar","Aman Meena","Aman Raj","Anjali Kumari","Ankit Prajapati","Anshedeep",
            "Arjun Kumar","Arpita Kumari","Aryan Kaushik","Ayushman Kulshreshtha","Bhuwan Singh Rajawat","Daksha Choudhary","Gaurav Parashar","Hansraj Yadav","Himanshu","Himanshu Sharma",
            "Indrajeet Kumar","Jatin Yadav","Jyoti Kumari","Kabita Bai Rajput","Kajal Kumari","Kanishk Saini","Karan Bhargav","Khushbu Kumari","Kishan Kumar","Lakhan Meena",
            "Lalan Kumar Mandal","Lokesh Meena","Lucky Jarwal","Manish Sharma","Md Shahnawaz","Mohd Kaif","MS. Pooja Choudhary","Namah Sharma","Nilam Kumari","Nitish Kumar",
            "Nitish Kumar","Palak Sharma","Prakash Kumar","Pranjal Pareek","Pravin Kumar","Prince Choudhary","Prince Kumar","Priyanshu Kumar","Rahul Choudhary","Rahul Kumar",
            "Rahul Raj Gupta","Rajnandani Kumari","Rajnish Kumar Tiwary","Ravi Kumar Singh","Ravi Raj Gupta","Ravindra Singh","Ritesh Kumar","Rishabh Ratan Kumar","Riya Kumari","Rizwan Alam",
            "Rudra Pratap Singh","Rupali Kumari","Rushmita Sharma","Satyam Kumar","Saurabh Singh","Shamil Akhtar","Sharma Manoj Kumar","Shourya Singh","Shubham Kumar","Siya Acharya",
            "Sumit Yadav","Sumit Yadav","Suraj Kumar","Tanisha Acharya","Tushar Agarwal","Upadhyay Sumit","Vardan Grover","Vikash Kherwa","Vivek Kumar"
        };

        int[] studentIDs = {
            2452868,2450727,2452339,2448950,2448956,2456646,2454456,2448952,2448792,2454192,
            2447029,2454903,2448292,2446830,2453640,2447226,2452033,2455861,2455868,2452527,
            2448947,2453240,2448933,2449983,2455841,2451418,2452771,2452345,2448677,2455783,
            2452874,2456647,2449290,2451571,2452420,2452691,2451373,2450449,2452750,2447009,
            2447169,2454550,2448878,2448356,2451901,2449741,2453274,2449815,2454989,2450474,
            2452960,2455281,2454453,2455733,2452270,2453280,2453731,2448764,2447976,2447176,
            2453713,2452727,2451534,2456224,2454225,2452080,2454396,2451276,2452745,2447343,
            2455206,2455867,2452875,2455209,2449534,2455177,2453366,2455220,2455816
        };

        boolean[] isPresent = new boolean[studentIDs.length];

        System.out.println("\nBCA Class SEM - (III) Attendance Management System");
        System.out.println("Enter Roll No / Name / SID to mark attendance.");
        System.out.println("Type '0' to stop marking.\n");

        while (true) {
            System.out.print("Enter Roll No / Name / SID: ");
            String input = sc.nextLine().trim();

            if (input.equals("0")) break; 

            boolean found = false;

            for (int i = 0; i < studentIDs.length; i++) {
                String sid = String.valueOf(studentIDs[i]).trim();
                String roll = String.valueOf(rollNumbers[i]).trim();
                String name = studentNames[i].trim();

                if (input.equalsIgnoreCase(name) || input.equals(sid) || input.equals(roll)) {
                    found = true;

                    if (!isPresent[i]) {
                        isPresent[i] = true;
                        System.out.println(" Attendance marked for " + name + " (SID: " + sid + ")");
                    } else {
                        System.out.println("Already marked present for " + name);
                    }
                    break; // stop loop after match
                }
            }

            if (!found) {
                System.out.println("Is Name Ka Student Nahi hei Please check Roll No / Name / SID.");
            }
        }

        // Attendance Summary
        System.out.println("\n BCA Class Attendance List");
        for (int i = 0; i < studentIDs.length; i++) {
            String status = isPresent[i] ? "P" : "A";
            System.out.println(rollNumbers[i] + ". " + studentNames[i] + " (SID: " + studentIDs[i] + ") => " + status);
        }

        sc.close();
    }
}
