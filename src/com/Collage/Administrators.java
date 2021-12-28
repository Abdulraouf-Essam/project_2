package com.Collage;

public class Administrators extends Person
{
    private int Work_Hours_Administrators;
    private int Year_Vacation_Administrators;
    private int Graduation_Year_Administrators;
    private double Salary_Administrators;
    static private int ID_Academy_dynamic = 2030118000;

    public Administrators()
    {
        super();
        Salary_Administrators = 0.0;
        ID_Academy_dynamic++;
        this.ID_Academy = Integer.toString(ID_Academy_dynamic);
    }


    // Work_Hours_Administrators

    public int getWork_Hours_Administrators()
    {
        return Work_Hours_Administrators;
    }

    public void setWork_Hours_Administrators(int work_Hours_Administrators)
    {
        while(work_Hours_Administrators<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            work_Hours_Administrators = input.nextInt();
        }

        this.Work_Hours_Administrators = work_Hours_Administrators;
    }


    // Year_Vacation_Administrators

    public int getYear_Vacation_Administrators()
    {
        return Year_Vacation_Administrators;
    }

    public void setYear_Vacation_Administrators(int year_Vacation_Administrators)
    {
        while(year_Vacation_Administrators<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            year_Vacation_Administrators = input.nextInt();
        }

        this.Year_Vacation_Administrators = year_Vacation_Administrators;
    }


    // Graduation_Year_Administrators

    public int getGraduation_Year_Administrators()
    {
        return Graduation_Year_Administrators;
    }

    public void setGraduation_Year_Administrators(int graduation_Year_Administrators)
    {
        while(graduation_Year_Administrators <= 1900 & graduation_Year_Administrators >= 2022)
        {
            System.out.print("                 this not Valid , please Enter the valid Value between 1900 And 2022\n                 ======>  ");
            graduation_Year_Administrators = input.nextInt();
        }
        this.Graduation_Year_Administrators = graduation_Year_Administrators;
    }



    // Salary_Administrators

    public double getSalary_Administrators() {
        return Salary_Administrators;
    }

    public void setSalary_Administrators(double salary_Administrators)
    {
        while(salary_Administrators <= 0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            salary_Administrators=input.nextDouble();
        }

        Salary_Administrators = salary_Administrators;
    }


    @Override
    public String toString() {
        return  "Information Of Administrators : \n" +
                " , Name = ' " + Name + " \n" +
                " , Rational_ID = ' " + Rational_ID + " \n" +
                " , ID_Academy = ' " + ID_Academy + " \n" +
                " , Phone = ' " + Phone + " \n" +
                " , E_mail = ' " + E_mail + " \n" +
                " , Age = " + Age +  " \n" +
                " , Job = ' " + Job + " \n" +
                " , Resident = " + Resident +  " \n" +
                " , Degree = ' " + Degree + " \n" +
                " , address = " + address + " \n" +
                " , Salary_Administrators = " + Salary_Administrators;
    }

    public String toString2() {
        return "Administrators{" +
                "Work_Hours_Administrators=" + Work_Hours_Administrators +
                ", Year_Vacation_Administrators=" + Year_Vacation_Administrators +
                ", Graduation_Year_Administrators=" + Graduation_Year_Administrators +
                ", Salary_Administrators=" + Salary_Administrators +
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
