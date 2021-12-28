package com.Collage;

public class Instructor extends Person
{
    private String courses_Instructor ;
    private int Work_Hours_Instructor;
    private int Year_Vacation_Instructor;
    private int Graduation_Year_Instructor;
    private double Salary_Instructor;
    static private int ID_Academy_dynamic = 1125101101;


    public Instructor()
    {
        super();
        courses_Instructor = "No Courses Instructor";
        Work_Hours_Instructor = 0;
        Year_Vacation_Instructor = 0;
        Graduation_Year_Instructor = 0;
        Salary_Instructor = 0.0;
        ID_Academy_dynamic++;
        this.ID_Academy = Integer.toString(ID_Academy_dynamic);
    }


    // Courses_Instructor

    public String getCourses_Instructor()
    {
        return courses_Instructor;
    }

    public void setCourses_Instructor(String courses_Instructor) {this.courses_Instructor = courses_Instructor;}


    // Work_Hours_Instructor

    public int getWork_Hours_Instructor() {return Work_Hours_Instructor;}

    public void setWork_Hours_Instructor(int work_Hours_Instructor)
    {
        while(work_Hours_Instructor<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            work_Hours_Instructor = input.nextInt();
        }
        this.Work_Hours_Instructor = work_Hours_Instructor;
    }


    // Year_Vacation_Instructor

    public int getYear_Vacation_Instructor() {
        return Year_Vacation_Instructor;
    }

    public void setYear_Vacation_Instructor(int year_Vacation_Instructor)
    {
        while(year_Vacation_Instructor<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            year_Vacation_Instructor = input.nextInt();
        }
        this.Year_Vacation_Instructor = year_Vacation_Instructor;
    }


    // Graduation_Year_Instructor

    public int getGraduation_Year_Instructor() {
        return Graduation_Year_Instructor;
    }

    public void setGraduation_Year_Instructor(int graduation_Year_Instructor)
    {
        while(graduation_Year_Instructor <= 1900 & graduation_Year_Instructor >= 2022)
        {
            System.out.print("                 this not Valid , please Enter the valid Value between 1900 And 2022\n                 ======>  ");
            graduation_Year_Instructor = input.nextInt();
        }
        this.Graduation_Year_Instructor = graduation_Year_Instructor;
    }


    // Salary_Instructor

    public double getSalary_Instructor()
    {
        return Salary_Instructor;
    }

    public void setSalary_Instructor(double salary_Instructor)
    {
        while(salary_Instructor<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            salary_Instructor=input.nextDouble();
        }
        this.Salary_Instructor = salary_Instructor;
    }



    @Override
    public String toString() {
        return  "Information Of Instructor : \n" +
                " , courses_Instructor = ' " + courses_Instructor + " \n" +
                " , WorkHours_Instructor = " + Work_Hours_Instructor + " \n" +
                " , Year_Vacation_Instructor = " + Year_Vacation_Instructor + " \n" +
                " , Graduation_Year_Instructor = " + Graduation_Year_Instructor + " \n" +
                " , Name = ' " + Name + " \n" +
                " , Rational_ID = ' " + Rational_ID + " \n" +
                " , ID_Academy = ' " + ID_Academy + " \n" +
                " , Phone = ' " + Phone + " \n" +
                " , E_mail = ' " + E_mail + " \n" +
                " , Age = " + Age + " \n" +
                " , Job = ' " + Job + " \n" +
                " , Resident = " + Resident + " \n" +
                " , Degree = ' " + Degree + " \n" +
                " , address = " + address + " \n" +
                " , Salary_Instructor = ' " + Salary_Instructor;
    }

    public String toString2() {
        return "Instructor{" +
                "courses_Instructor='" + courses_Instructor + '\'' +
                ", Work_Hours_Instructor=" + Work_Hours_Instructor +
                ", Year_Vacation_Instructor=" + Year_Vacation_Instructor +
                ", Graduation_Year_Instructor=" + Graduation_Year_Instructor +
                ", Salary_Instructor=" + Salary_Instructor +
                ", Name='" + Name + '\'' +
                ", Rational_ID='" + Rational_ID + '\'' +
                ", ID_Academy='" + ID_Academy + '\'' +
                ", Phone='" + Phone + '\'' +
                ", E_mail='" + E_mail + '\'' +
                ", Age=" + Age +
                ", Job='" + Job + '\'' +
                ", Degree='" + Degree + '\'' +
                ", Resident='" + Resident + '\'' +
                ", address=" + address +
                '}';
    }
}
