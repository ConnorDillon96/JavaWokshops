package app;

import java.util.Arrays;
import java.util.Scanner;

/**
 * StudentList
 */
public class StudentList {
    Student[] studentList;

    public StudentList(int size){
        this.studentList = new Student[size];
    }

    public int getPosition(){
        if (Arrays.asList(studentList).contains(null)){
            return Arrays.asList(studentList).indexOf(null);
        }else{
            return -1;
        }

    }    

    public void addPartTime(String name, int numberOfModules){
        if (getPosition() == -1){
            System.out.println("List is full");
        }else{
            PartTime temp = new PartTime(name, numberOfModules);
            this.studentList[getPosition()] = temp;
        }
    }

    public void addFullTime(String name){
        if(getPosition() == -1){
            System.out.println("List is full");
        }else{
            FullTime temp = new FullTime(name);
            System.out.println("is the loan issued? : (Y/N)");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            System.out.println(input);
            if(input.equals("Y")){
                temp.setLoanIssued(true);
            }

            this.studentList[getPosition()] =  temp;
        }


    }

    @Override
    public String toString() {
        String allStudents = "";
        for (int i = 0; i < studentList.length; i++) {
            if(studentList[i] == null){

            }else{
                allStudents += studentList[i] + "\n";
            }
            
        }
        return allStudents;
    }
}
