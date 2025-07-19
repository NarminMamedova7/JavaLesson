import java.util.Scanner;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.print("Enter the amount of days: ");
        int days = scanner.nextInt();

        String[] students = new String[numberOfStudents];
        System.out.println("Enter the names of students: ");
        for(int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = scanner.next();
        }

        String[][] attendanceList = new String[numberOfStudents][days+1];
        System.out.println("Now enter attendance for each student:");
        for(int i = 0; i < days; i++) {
            System.out.println("Day "+ (i+1)+" Attendance (P=Present, A=Absent):");
            for (int j = 0; j < numberOfStudents; j++) {
                while(true) {
                    System.out.print(students[j]+": ");
                    String attendance = scanner.next();
                    if(attendance.equalsIgnoreCase("P") || attendance.equalsIgnoreCase("A")) {
                        attendanceList[i][j] = attendance;
                        break;
                    }
                    else{
                        System.out.println("Invalid input (Enter P or A).");
                    }
                }
            }
        }

        System.out.println("--- Attendance Summary ---");
        for(int i = 0; i < numberOfStudents; i++) {
            int presentCount=0;
            System.out.print(students[i]+": ");
            for(int j = 0; j < days; j++) {
                System.out.print(attendanceList[i][j]+" ");
                if(attendanceList[i][j].equalsIgnoreCase("P")){
                    presentCount++;
                }
            }
            System.out.println(" | Present "+presentCount+" out of "+days+" days");
        }

    }
}

