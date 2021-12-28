package com.Collage;

import java.security.PublicKey;

public class Student extends Person
{
    private String Grade_Student;
    private String Department_Student;
    private int Level_student;
    private int Grope_Student;
    private int Section_Student;
    private double GPA_student;
    static private int ID_Academy_dynamic = 1620100;

    public Student()
    {
        super();
        ID_Academy_dynamic++;
        this.ID_Academy = Integer.toString(ID_Academy_dynamic);
        Level_student = 0;
        this.GPA_student = 0;
        Grade_Student = "No grade";
        Department_Student = "No Department";
        Grope_Student = 0;
        Section_Student = 0;
        setJob("student");
    }

    // Level_student

    public int getLevel_student() {
        return Level_student;
    }

    public void setLevel_student(int level_student)
    {
        while(level_student<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            level_student=input.nextInt();
        }

        this.Level_student = level_student;
    }


    // GPA_student

    public double getGPA_student()
    {
        return GPA_student;
    }

    public void setGPA_student(double GPA_student)
    {
        while(GPA_student<0 || GPA_student>4)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0 And less than 4 or equals\n                 ======>  ");
            GPA_student=input.nextDouble();
        }
        this.GPA_student = GPA_student;
    }


    // Grade

    public String getGrade_Student()
    {
        return Grade_Student;
    }

    public void setGrade()
    {
        if(this.GPA_student<=1)
            Grade_Student = "F";
        else if(this.GPA_student<=1.7)
            Grade_Student ="D";
        else if(this.GPA_student<=2)
            Grade_Student ="C";
        else if(this.GPA_student<=3)
            Grade_Student ="B";
        else if(this.GPA_student<=4)
            Grade_Student ="A";
    }


    // Department_Student

    public String getDepartment_Student()
    {
        return Department_Student;
    }

    public void setDepartment_Student(String department_Student)
    {
        this.Department_Student = department_Student;
    }


    // Grope_Student

    public int getGrope_Student() {
        return Grope_Student;
    }

    public void setGrope_Student(int grope_Student)
    {
        while(grope_Student <=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            grope_Student =input.nextInt();
        }
        this.Grope_Student = grope_Student;
    }


    // Section_Student

    public int getSection_Student()
    {
        return Section_Student;
    }

    public void setSection_Student(int section_Student)
    {

        while(section_Student <=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            section_Student =input.nextInt();
        }
        this.Section_Student = section_Student;
    }


    public String toString2() {
        return "Student{" +
                ", Name='" + Name + '\'' +
                ", Rational_ID='" + Rational_ID + '\'' +
                ", ID_Academy='" + ID_Academy + '\'' +
                ", Phone='" + Phone + '\'' +
                ", E_mail='" + E_mail + '\'' +
                ", Age=" + Age +
                ", Job='" + Job + '\'' +
                ", Degree='" + Degree + '\'' +
                ", Resident='" + Resident + '\'' +
                ", address=" + address.toString() +
                ", Grade_Student='" + Grade_Student + '\'' +
                ", Department_Student='" + Department_Student + '\'' +
                ", Level_student=" + Level_student +
                ", Grope_Student=" + Grope_Student +
                ", Section_Student=" + Section_Student +
                ", GPA_student=" + GPA_student +
                '}';
    }

}
