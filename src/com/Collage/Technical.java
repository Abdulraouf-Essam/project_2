package com.Collage;

public class Technical extends Person
{
    private int Working_Hours_Technician;
    private int Year_Vacation_Technician;
    private int Graduation_Year_Technician;
    private int Lab_Number_Technician;
    private double Salary_Technician;
    static private int ID_Academy_dynamic = 1118899101;

    Address Address_Technical;


    public Technical()
    {
        super();
        Salary_Technician = 0.0;
        Working_Hours_Technician = 0;
        Year_Vacation_Technician = 0;
        Graduation_Year_Technician = 0;
        Lab_Number_Technician = 0;
        ID_Academy_dynamic++;
        this.ID_Academy = Integer.toString(ID_Academy_dynamic);
    }


    // Working_Hours_Technician

    public int getWorking_Hours_Technician() {
        return Working_Hours_Technician;
    }

    public void setWorking_Hours_Technician(int working_Hours_technician)
    {
        while(working_Hours_technician<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");

            working_Hours_technician = input.nextInt();
        }
        this.Working_Hours_Technician = working_Hours_technician;
    }


    // Year_Vacation_Technician

    public int getYear_Vacation_Technician()
    {
        return Year_Vacation_Technician;
    }

    public void setYear_Vacation_Technician(int Year_Vacation_Technician)
    {
        while(Year_Vacation_Technician<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            Year_Vacation_Technician = input.nextInt();
        }
        this.Year_Vacation_Technician = Year_Vacation_Technician;
    }


    // Graduation_Year_Technician

    public int getGraduation_Year_Technician() {
        return Graduation_Year_Technician;
    }

    public void setGraduation_Year_Technician(int Graduation_Year_Technician)
    {
        while(Graduation_Year_Technician <= 1900 & Graduation_Year_Technician >= 2022)
        {
            System.out.print("                 this not Valid , please Enter the valid Value between 1900 And 2022\n                 ======>  ");
            Graduation_Year_Technician = input.nextInt();
        }
        this.Graduation_Year_Technician = Graduation_Year_Technician;
    }


    // Lab_Number_Technician

    public int getLab_Number_Technician() {
        return Lab_Number_Technician;
    }

    public void setLab_Number_Technician(int lab_Number_Technician)
    {
        while(lab_Number_Technician<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");

            lab_Number_Technician = input.nextInt();
        }

        this.Lab_Number_Technician = lab_Number_Technician;
    }


    // Salary_Technician

    public double getSalary_Technician() {
        return Salary_Technician;
    }

    public void setSalary_Technician(double salary_Technician)
    {
        while(salary_Technician<=0)
        {
            System.out.print("                 this not Valid , please Enter the valid Value greater than 0\n                 ======>  ");
            salary_Technician=input.nextDouble();
        }

        this.Salary_Technician = salary_Technician;
    }


    // Address_Technical

    public Address getAddress_Technical() {
        return Address_Technical;
    }

    public void setAddress_Technical(Address address_Technical) {
        this.Address_Technical = address_Technical;
    }


    @Override
    public String toString() {
        return  "Information Of Technical : \n" +
                " , Name = ' " + Name + " \n" +
                " , Rational_ID = ' " + Rational_ID + " \n" +
                " , ID_Academy = ' " + ID_Academy + " \n" +
                " , Phone = ' " + Phone + " \n" +
                " , E_mail = ' " + E_mail + " \n" +
                " , Age = " + Age + " \n" +
                " , Job = ' " + Job + " \n" +
                " , Resident = " + Resident  + " \n" +
                " , Degree = ' " + Degree + " \n" +
                " , address = " + address  + " \n" +
                " , Graduation_University_Technician = ' " + Graduation_Year_Technician + " \n" +
                " , Working_Hours_Technician = " + Working_Hours_Technician  + " \n" +
                " , Year_Vacation_Technician ="  + Year_Vacation_Technician  + " \n" +
                " , Graduation_Year_Technician = " + Graduation_Year_Technician  + " \n" +
                " , Lab_Number_Technician = " + Lab_Number_Technician  + " \n" +
                " , address_Technician = " + Address_Technical  + " \n" +
                " , Salary_Technician = " + Salary_Technician;
    }

    public String toString2() {
        return "Technical{" +
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
                ", Working_Hours_Technician=" + Working_Hours_Technician +
                ", Year_Vacation_Technician=" + Year_Vacation_Technician +
                ", Graduation_Year_Technician=" + Graduation_Year_Technician +
                ", Lab_Number_Technician=" + Lab_Number_Technician +
                ", Salary_Technician=" + Salary_Technician +
                ", Address_Technical=" + Address_Technical +
                '}';
    }
}

