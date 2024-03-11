package DSA;

import java.util.*;

// Creating Linked List with Node name "Student"
public class assignment_que1 {
    static Student head;

    static class Student {
        String name;
        Student next;
        int marks;

        public Student(String name, int makrs) {
            this.name = name;
            this.next = null;
            this.marks = marks;
        }
    }

    static class Stack {
        static boolean isEmpty() {
            if (head == null) {
                return true;
            } else {
                return false;
            }
        }

        // Adding Students name and Marks
        void push(String name, int marks) {
            Student newStudent = new Student(name, marks);
            if (isEmpty()) {
                head = newStudent;
                return;
            }
            newStudent.next = head;
            head = newStudent;
        }

        // Deleting Students name and Marks
        String pop() {
            if (isEmpty()) {
                return "No Records of Student";
            }
            String top = head.name;
            head = head.next;
            return top;
        }

        // Printing all Records of all Student
        String peek() {
            if (isEmpty()) {
                return "Stack Underflow";
            }
            return head.name;
        }

        // To print top 3 Students
        public void top_3_student() {
            if (head == null) {
                System.out.println("Stack is empty. No top positions to display.");
                return;
            }
            Student first = null, second = null, third = null;
            Student current = head;
            while (current != null) {
                if (first == null || current.marks > first.marks) {
                    third = second;
                    second = first;
                    first = current;
                } else if (second == null || current.marks > second.marks) {
                    third = second;
                    second = current;
                } else if (third == null || current.marks > third.marks) {
                    third = current;
                }
                current = current.next;
            }
            System.out.println("Top 3 positions:");
            if (first != null) {
                System.out.println("1st Place: " + first.name + " (Marks: " + first.marks + ")");
            }
            if (second != null) {
                System.out.println("2nd Place: " + second.name + " (Marks: " + second.marks + ")");
            }
            if (third != null) {
                System.out.println("3rd Place: " + third.name + " (Marks: " + third.marks + ")");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        int choice;
        System.out.println("1. Add a student to Stack");
        System.out.println("2. Remove a Student from the Stack");
        System.out.println("3. Display all students of Stack");
        System.out.println("4. Display the top 3 positions of students");
        System.out.println("5. Press 5 or any other key to close the program");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the name of the student: ");
                String name1 = scanner.next();
                System.out.print("Enter the marks of the student: ");
                int marks1 = scanner.nextInt();
                stack.push(name1, marks1);
                break;
            case 2:
                if (head == null) {
                    System.out.println("The Stack is Empty");
                }
                stack.pop();
                break;
            case 3:
                while (!stack.isEmpty()) {
                    System.out.println(stack.peek());
                    stack.pop();
                }
                if (head == null) {
                    System.out.println("Stack is Empty");
                }
                break;
            case 4:
                stack.top_3_student();
                break;
            case 5:
                System.out.println("Closing the program");
                break;
            default:
                System.out.println("Invalid choice");
        }
        if ((choice < 5) || (choice > 5)) {
            scanner.close();
        }
    }
}
