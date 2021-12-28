package com.Collage;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Person implements PrintDetails
{
    Scanner input = new Scanner(System.in);

    protected String Name;
    protected String Rational_ID;
    protected String ID_Academy;
    protected String Phone;
    protected String E_mail;
    protected String Age;
    protected String Job;
    protected String Degree;
    protected String Resident;
    Address address;


    public Person()
    {
        Name = "No Name";
        Rational_ID = "No ID";
        ID_Academy = "No ID Academy";
        Phone = "No Phone";
        E_mail = "No E_mail";
        Age = "0";
        Job = "NO Job";
        Resident = "false";
        Degree = "No Degree";
        address = new Address();
    }

    // Name

    public String getName()
    {
        return Name;
    }

    public void setName(String name) {this.Name = name;}


    // Rational_ID

    public String getRational_ID() {
        return Rational_ID;
    }

    public void setRational_ID(String rational_ID)
    {
        while(rational_ID.length() != 14)
        {
            System.out.print("                 this not Valid , please Enter 14 Numbers\n                 ======>  ");
            rational_ID = input.next();
        }

        this.Rational_ID = rational_ID;
    }


    // ID_Academy

    public String getID_Academy() {
        return ID_Academy;
    }

    public void setID_Academy(String ID_Academy) {
        this.ID_Academy = ID_Academy;
    }



    // Phone

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone)
    {
        while(phone.length() != 11)
        {
            System.out.print("                 this not Valid , please Enter 11 Numbers\n                 ======>  ");
            phone = input.next();
        }

        this.Phone = phone;
    }


    // E_mail

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String e_mail)
    {
        while(e_mail.charAt(e_mail.length()-1)!='m' || e_mail.charAt(e_mail.length()-2)!='o' || e_mail.charAt(e_mail.length()-3)!='c' || e_mail.charAt(e_mail.length()-4)!='.')
        {
            System.out.print("                 this not Valid , please Enter the valid E_mail ==> EX :  A@B.com\n                 ======>  ");
            e_mail = input.next();
        }

        this.E_mail = e_mail;
    }


    // Age

    public String  getAge() {return Age;}

    public void setAge(String  age)
    {
        while(true)
        {
            boolean test = false;

            for(int i = 0;i<age.length();i++) {
                if(age.charAt(i)<'0' || age.charAt(i)>'9') {
                    test=true;
                    break;
                }
            }

            if(test || age.charAt(0) == '0' || age.length() == 1) {
                System.out.print("                 this not Valid , please Enter the valid Value greater than 0 & Integer\n                 ======>  ");
                age=input.next();
            }
            else
                break;
        }

        this.Age = age;
    }


    // Job

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        this.Job = job;
    }


    // Degree

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        this.Degree = degree;
    }


    // Address

    public void setAddress_Country(String country) {
        address.setCountry(country);
    }

    public void setAddress_City(String city) {
        address.setCity(city);
    }

    public void setAddress_Street(String street) {
        address.setStreet(street);
    }

    public void setResidential_Building(String residential_Building)
    {
        address.setResidential_Building(residential_Building);
    }


    // Resident_Input_Test

    public String getResident() {
        return Resident;
    }

    public void setResident(String resident)
    {
        while(!resident.equals("true") && !resident.equals("false"))
        {
            if (resident.equals("True")  || resident.equals("true")  || resident.equals("T") || resident.equals("t") || resident.equals("1"))
                resident="true";
            else if (resident.equals("False") || resident.equals("false") || resident.equals("F") || resident.equals("f") || resident.equals("0"))
                resident="false";
            else
            {
                System.out.print("                 Data type error, Please Enter Correct Input \" true   OR   false \" \n                 ======>  ");
                resident = input.next();
            }
        }

        this.Resident = resident;
    }

}
