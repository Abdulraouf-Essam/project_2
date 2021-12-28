package com.Collage;

public class worker extends Person
{
    private int Working_Hours_worker;
    private int Year_Vacation_worker;
    private int Lab_Number_worker;
    private double Salary_worker;


    public worker()
    {
        super();
        Salary_worker = 0.0;
        Working_Hours_worker = 0;
        Year_Vacation_worker = 0;
        Lab_Number_worker = 0;
    }


    // Working_Hours_worker

    public int getWorking_Hours_worker() {
        return Working_Hours_worker;
    }

    public void setWorking_Hours_worker(int working_Hours_worker)
    {

        while(working_Hours_worker<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            working_Hours_worker = input.nextInt();
        }

        this.Working_Hours_worker = working_Hours_worker;
    }


    // Year_Vacation_worker

    public int getYear_Vacation_worker() {
        return Year_Vacation_worker;
    }

    public void setYear_Vacation_worker(int year_Vacation_worker)
    {
        while(year_Vacation_worker<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            year_Vacation_worker = input.nextInt();
        }

        this.Year_Vacation_worker = year_Vacation_worker;
    }


    // Lab_Number_worker

    public int getLab_Number_worker() {
        return Lab_Number_worker;
    }

    public void setLab_Number_worker(int lab_Number_worker)
    {
        while(lab_Number_worker<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");

            lab_Number_worker = input.nextInt();
        }
        this.Lab_Number_worker = lab_Number_worker;
    }


    // Salary_worker

    public double getSalary_worker() {
        return Salary_worker;
    }

    public void setSalary_worker(double salary_worker)
    {
        while(salary_worker <= 0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            salary_worker=input.nextDouble();
        }
        this.Salary_worker = salary_worker;
    }


    @Override
    public String toString() {
        return  "Information Of worker : " +
                " , Name = ' " + Name + " \n" +
                " , Rational_ID = ' " + Rational_ID + " \n" +
                " , ID_Academy = ' " + ID_Academy + " \n" +
                " , Phone = ' " + Phone + " \n" +
                " , E_mail = ' " + E_mail + " \n" +
                " , Age = "  + Age + " \n" +
                " , Job = ' " + Job + " \n"+
                " , Resident = " + Resident + " \n" +
                " , Degree = ' " + Degree + " \n" +
                " , address = " + address + " \n" +
                " , Technician_Salary = " + Salary_worker + " \n" +
                " , Technician_Working_Hours = " + Working_Hours_worker + " \n" +
                " , Technician_Year_Vacation = " + Year_Vacation_worker + " \n" +
                " , Technician_Lab_Number = " + Lab_Number_worker;
    }


    public String toString2() {
        return "worker{" +
                ", Name='" + Name + '\'' +
                ", Rational_ID='" + Rational_ID + '\'' +
                ", ID_Academy='" + ID_Academy + '\'' +
                ", Phone='" + Phone + '\'' +
                ", E_mail='" + E_mail + '\'' +
                ", Age=" + Age + '\'' +
                ", Job='" + Job + '\'' +
                ", Degree='" + Degree + '\'' +
                ", Resident='" + Resident + '\'' +
                ", address=" + address +
                ", Working_Hours_worker=" + Working_Hours_worker +
                ", Year_Vacation_worker=" + Year_Vacation_worker +
                ", Lab_Number_worker=" + Lab_Number_worker +
                ", Salary_worker=" + Salary_worker +
                '}';
    }
}
