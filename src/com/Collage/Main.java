package com.Collage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    static Scanner input=new Scanner(System.in);

    static ArrayList<Administrators>ADMINISTRATORS=new ArrayList<>();
    static ArrayList<Instructor>INSTRUCTORS=new ArrayList<>();
    static ArrayList<Student>STUDENTS=new ArrayList<>();
    static ArrayList<worker>WORKER=new ArrayList<>();
    static ArrayList<Technical>TECHNICALS=new ArrayList<>();

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.print( "\n                                 MAIN MENU                         \n" +
                    "                                -----------                                    \n\n\n" +
                    "                 01. To Add an new Person , click                             \" 1 \" \n\n\n" +
                    "                 02. To Delete Person , click                                 \" 2 \" \n\n\n" +
                    "                 03. To Edit The information , click                          \" 3 \" \n\n\n" +
                    "                 04. To View all accounts in Collage, click                   \" 4 \" \n\n\n" +
                    "                 05. To search in Collage about person , click                \" 5 \" \n\n\n" +
                    "                 06. To Exit the program , click                              \" 6 \" \n\n\n                 ======>  ");


            char Number_Of_Operation = input.next().charAt(0);
            System.out.println("\n");

            switch (Number_Of_Operation)
            {
                case '1':Add();   System.err.print("\n\n\n                        ✲✲✧✧✲✲   successfully Added   ✲✲✧✧✲✲\n\n\n\n"); break;
                case '2':Delete() ; break;
                case '3':Edit() ;  break;
                case '4':Display_All_Information() ; break;
                case '5':search() ; break;
                case '6': break;
                default: System.out.println("Error");
            }
        }

    }

    static void Add()     // finish
    {
        System.out.print(  "                 01. To Add Student , click                                   \" 1 \" \n\n\n" +
                "                 02. To Add Administrators , click                            \" 2 \" \n\n\n" +
                "                 03. To Add Instructor , click                                \" 3 \" \n\n\n" +
                "                 04. To Add Technical , click                                 \" 4 \" \n\n\n" +
                "                 05. To Add worker , click                                    \" 5 \" \n\n\n                 ======>  ");

        boolean done = false;

        char Number_Of_Operation=input.next().charAt(0);
        System.out.println("\n");

        switch (Number_Of_Operation)
        {
            case '1':
            {
                Student Obj;

                int check = 0;

                do {

                    Obj = new Student();

                    input_Of_Person(Obj, "Student");

                    System.out.print("                 Enter The Level of Student...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setLevel_student(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter The Grade Point Average of Student...\n                 ======>  ");

                    do {
                        done = false;
                        try
                        {
                            Obj.setGPA_student(input.nextDouble());

                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter The Department of Student...\n                 ======>  ");
                    Obj.setDepartment_Student(input.next());
                    System.out.print("                 Enter The Grope of Student...\n                 ======>  ");

                    do {
                        done = false;
                        try
                        {
                            Obj.setGrope_Student(input.nextInt());

                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);


                    System.out.print("                 Enter The Section of Student...\n                 ======>  ");

                    do {
                        done = false;
                        try
                        {
                            Obj.setSection_Student(input.nextInt());

                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    // set Grade Of student
                    Obj.setGrade();


                    System.err.print("\n\n\n               ---- Please check the information again ----\n\n\n" +
                            "                 01. correct         02. incorrect, Edit again\n                 ======>  ");
                    do {
                        done = false;
                        try {
                            check = input.nextInt();

                        } catch (InputMismatchException E) {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                }while (check!=1);

                STUDENTS.add(Obj);
            }
            ; break;
            case '2':
            {
                Administrators Obj;
                int check = 0;

                do {
                    Obj = new Administrators();

                    input_Of_Person(Obj,"Administrators");

                    System.out.print("                 Enter administrative Position...\n                 ======>  ");
                    Obj.setJob(input.next());

                    System.out.print("                 Enter The Salary of Administrators...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setSalary_Administrators(input.nextDouble());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);


                    System.out.print("\n\n\n               ---- Please check the information again ----\n\n\n" +
                            "              01. correct         02. incorrect, Edit again\n                 ======>  ");
                    do{
                        done = false;
                        try
                        {
                            check = input.nextInt();

                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                }while (check!=1);

                ADMINISTRATORS.add(Obj);
            }
            ; break;
            case '3':
            {
                Instructor Obj;

                int check = 0;

                do {
                    Obj = new Instructor();

                    input_Of_Person(Obj, "Instructor");

                    System.out.print("                 Enter The Courses of Instructor...\n                 ======>  ");
                    Obj.setCourses_Instructor(input.next());

                    System.out.print("                 Enter The Work Hours of Instructor...\n                 ======>  ");


                    do{
                        done = false;
                        try
                        {
                            Obj.setWork_Hours_Instructor(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer & greater than 0\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter Number of Year vacation days of Instructor...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setYear_Vacation_Instructor(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer & greater than 0\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);


                    System.out.print("                 Enter The  Graduation Year of Instructor...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setGraduation_Year_Instructor(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.println("                 this not Valid , please Enter the valid Value Integer & greater than 0\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter the salary of Instructor\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setSalary_Instructor(input.nextDouble());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer & greater than 0\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                        System.out.print("                 Enter Instructor Position...\n                 ======>  ");
                           Obj.setJob(input.next());

                    System.out.print("\n\n\n               ---- Please check the information again ----\n\n\n" +
                            "              01. correct         02. incorrect, Edit again\n                 ======>  ");
                    do{
                        done = false;
                        try
                        {
                            check = input.nextInt();
                            input.nextLine();
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }

                    }while (done);
                }while (check!=1);

                INSTRUCTORS.add(Obj);

            }
            ; break;
            case '4':
            {
                Technical Obj;

                int check = 0;

                do {
                    Obj = new Technical();
                    input_Of_Person(Obj,"Technical");

                    System.out.print("                 Enter The Work Hours of Technical...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setWorking_Hours_Technician(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter Number of Year vacation days of Technical...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setYear_Vacation_Technician(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter The  Graduation Year of Technical...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setGraduation_Year_Technician(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter The  Lap Number of Technical...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setLab_Number_Technician(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);


                    System.out.print("                 Enter the salary of Technical                 ======>  ");
                    do{
                        done = false;
                        try
                        {
                            Obj.setSalary_Technician(input.nextDouble());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter Technical Position...\n                 ======>  ");
                    Obj.setJob(input.next());

                    System.out.print("\n\n\n               ---- Please check the information again ----\n\n\n" +
                            "              01. correct         02. incorrect, Edit again\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            check = input.nextInt();
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);


                }while (check!=1);

                TECHNICALS.add(Obj);
            }
            ; break;
            case '5':
            {
                worker Obj;

                int check = 0;

                do {
                    Obj = new worker();

                    input_Of_Person(Obj,"worker");

                    System.out.print("                 Enter The Work Hours of Worker...\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setWorking_Hours_worker(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);


                    System.out.print("                 Enter Number of Year vacation days of Worker...\n                 ======>  ");
                    do{
                        done = false;
                        try
                        {
                            Obj.setYear_Vacation_worker(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);


                    System.out.print("                 Enter The  Lap Number of Worker...\n                 ======>  ");

                    do {
                        done = false;
                        try
                        {
                            Obj.setLab_Number_worker(input.nextInt());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter the salary of Worker\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            Obj.setSalary_worker(input.nextDouble());
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }
                    }while (done);

                    System.out.print("                 Enter Worker Position...\n                 ======>  ");
                    Obj.setJob(input.next());

                    System.out.print("\n\n\n               ---- Please check the information again ----\n\n\n" +
                            "              01. correct         02. incorrect, Edit again\n                 ======>  ");

                    do{
                        done = false;
                        try
                        {
                            check = input.nextInt();
                        }
                        catch (InputMismatchException E)
                        {
                            System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                            done = true;
                            input.nextLine();
                        }

                    }while (done);


                }while (check!=1);

                WORKER.add(Obj);
            }
            ; break;
        }
    }

    static void Delete()  // finish
    {
        System.out.print("                 01. To search for a student And Delete it, click                                   \" 1 \" \n\n\n" +
                "                 02. To search for a Administrators And Delete it, click                            \" 2 \" \n\n\n" +
                "                 03. To search for a Instructor And Delete it, click                                \" 3 \" \n\n\n" +
                "                 04. To search for a Technical And Delete it, click                                 \" 4 \" \n\n\n" +
                "                 05. To search for a worker And Delete it, click                                    \" 5 \" \n\n\n                 ======>  ");

        char Number_Of_Operation = input.next().charAt(0);

        System.out.print("                 Enter the academic number you want to delete...\n                 ======>  ");
        String Number_ID=input.next();

        switch (Number_Of_Operation)
        {
            case '1':
            {
                int Index_Of_Student = -1;

                // just To search

                for(int i=0;i<STUDENTS.size();i++)
                {
                    if(Number_ID.equals(STUDENTS.get(i).getID_Academy()));
                    {
                        Index_Of_Student = i;
                        break;
                    }
                }

                if(Index_Of_Student != -1)
                    STUDENTS.remove(Index_Of_Student);
                else
                    System.out.println("                 There is no student with this ID..!!");
            };
            break;
            case '2':
            {
                int Index_Of_Administrators = -1;

                // just To search

                for(int i=0;i<ADMINISTRATORS.size();i++)
                {
                    if(Number_ID.equals(ADMINISTRATORS.get(i).getID_Academy()));
                    {
                        Index_Of_Administrators = i;
                        break;
                    }
                }

                if(Index_Of_Administrators != -1)
                    ADMINISTRATORS.remove(Index_Of_Administrators);
                else
                    System.out.println("                 There is no Administrators with this ID..!!");
            };
            break;
            case '3':
            {

                int Index_Of_Instructor = -1;

                // just To search

                for(int i=0;i<INSTRUCTORS.size();i++)
                {
                    if(Number_ID.equals(INSTRUCTORS.get(i).getID_Academy()));
                    {
                        Index_Of_Instructor = i;
                        break;
                    }
                }

                if(Index_Of_Instructor != -1)
                    INSTRUCTORS.remove(Index_Of_Instructor);
                else
                    System.out.println("                 There is no Instructor with this ID..!!");
            };
            break;
            case '4':
            {
                int Index_Of_Technical = - 1;

                // just To search

                for(int i=0;i<TECHNICALS.size();i++)
                {
                    if(Number_ID.equals(TECHNICALS.get(i).getID_Academy()));
                    {
                        Index_Of_Technical = i;
                        break;
                    }
                }

                if(Index_Of_Technical != -1)
                    TECHNICALS.remove(Index_Of_Technical);
                else
                    System.out.println("                 There is no Technical with this ID..!!");
            };
            break;
            case '5':
            {
                int Index_Of_Worker = -1;
                // just To search

                for(int i=0;i<WORKER.size();i++)
                {
                    if(Number_ID.equals(WORKER.get(i).getID_Academy()));
                    {
                        Index_Of_Worker = i;
                        break;
                    }
                }

                if(Index_Of_Worker != -1)
                    WORKER.remove(Index_Of_Worker);
                else
                    System.out.println("                 There is no Worker with this ID..!!");

            }break;

        }
    }

    static void Edit()    //
    {
        System.out.print(
                "                 01. To search for a student And Edit it, click                                   \" 1 \" \n\n\n" +
                        "                 02. To search for a Administrators And Edit it, click                            \" 2 \" \n\n\n" +
                        "                 03. To search for a Instructor And Edit it, click                                \" 3 \" \n\n\n" +
                        "                 04. To search for a Technical And Edit it, click                                 \" 4 \" \n\n\n" +
                        "                 05. To search for a worker And Edit it, click                                    \" 5 \" \n\n\n                 ======>  ");

        char Number_Of_Operation = input.next().charAt(0);

        System.out.print("                 Enter the academic number you want to Edit...\n                 ======>  ");
        String Number_ID=input.next();

        switch (Number_Of_Operation)
        {

            case '1':
            {
                int Index_Of_Student = -1;

                // just To search

                for(int i=0;0<STUDENTS.size();i++)
                {
                    if(Number_ID.equals(STUDENTS.get(i).getID_Academy()));
                    {
                        Index_Of_Student = i;
                        break;
                    }
                }


                // Display Student Information

                if(Index_Of_Student!=-1)
                {
                    System.out.print(STUDENTS.get(Index_Of_Student).toString());

                    System.out.print(
                            "                 01. To edit the name, click                           \" 1 \" \n\n\n" +
                                    "                 02. To edit the Age, click                            \" 2 \" \n\n\n" +
                                    "                 03. To edit the Phone Number, click                   \" 3 \" \n\n\n" +
                                    "                 04. To edit the E-mail, click                         \" 4 \" \n\n\n" +
                                    "                 05. To edit the ID Academy, click                     \" 5 \" \n\n\n                 ======>  ");

                    char  Number_Of_Operation_Edit = input.next().charAt(0);

                    switch (Number_Of_Operation_Edit)
                    {
                        case '1' :
                        {
                            STUDENTS.get(Index_Of_Student).setName(input.next());
                        };break;
                        case '2':
                        {
                            STUDENTS.get(Index_Of_Student).setAge(input.next());
                        };break;
                        case '3':
                        {
                            STUDENTS.get(Index_Of_Student).setPhone(input.next());
                        }break;
                        case '4':
                        {
                            STUDENTS.get(Index_Of_Student).setE_mail(input.next());
                        };break;
                        case '5':
                        {
                            STUDENTS.get(Index_Of_Student).setID_Academy(input.next());
                        };break;
                    }
                }
                else
                    System.out.println("                 There is no student with this ID..!!");
            };break;
            case '2' :
            {
                int Index_Of_Administrators = -1;

                // just To search

                for(int i=0;0<ADMINISTRATORS.size();i++)
                {
                    if(Number_ID.equals(ADMINISTRATORS.get(i).getID_Academy()));
                    {
                        Index_Of_Administrators = i;
                        break;
                    }
                }


                // Display Administrators Information

                if(Index_Of_Administrators!=-1)
                {
                    System.out.print(ADMINISTRATORS.get(Index_Of_Administrators).toString());

                    System.out.print(
                            "                 01. To edit the name, click                           \" 1 \" \n\n\n" +
                                    "                 02. To edit the Age, click                            \" 2 \" \n\n\n" +
                                    "                 03. To edit the Phone Number, click                   \" 3 \" \n\n\n" +
                                    "                 04. To edit the E-mail, click                         \" 4 \" \n\n\n" +
                                    "                 05. To edit the Salary, click                         \" 5 \" \n\n\n" +
                                    "                 06. To edit the ID Academy, click                     \" 6 \" \n\n\n                 ======>  ");


                    char  Number_Of_Operation_Edit = input.next().charAt(0);

                    switch (Number_Of_Operation_Edit)
                    {
                        case '1' :
                        {
                            ADMINISTRATORS.get(Index_Of_Administrators).setName(input.next());
                        };break;
                        case '2':
                        {
                            ADMINISTRATORS.get(Index_Of_Administrators).setAge(input.next());
                        };break;
                        case '3':
                        {
                            ADMINISTRATORS.get(Index_Of_Administrators).setPhone(input.next());
                        }break;
                        case '4':
                        {
                            ADMINISTRATORS.get(Index_Of_Administrators).setE_mail(input.next());
                        };break;
                        case '5':
                        {
                            ADMINISTRATORS.get(Index_Of_Administrators).setID_Academy(input.next());
                        };break;
                        case '6':
                        {
                            boolean done = false;
                            do{
                                done = false;
                                try
                                {
                                    ADMINISTRATORS.get(Index_Of_Administrators).setSalary_Administrators(input.nextDouble());
                                }
                                catch (InputMismatchException E)
                                {
                                    System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                                    done = true;
                                    input.nextLine();
                                }
                            }while (done);
                        }
                    }
                }
                else
                    System.out.println("                 There is no Administrators with this ID..!!");
            }
            case '3':
            {
                int Index_Of_Instructor = -1;

                // just To search

                for(int i=0;0<INSTRUCTORS.size();i++)
                {
                    if(Number_ID.equals(INSTRUCTORS.get(i).getID_Academy()));
                    {
                        Index_Of_Instructor = i;
                        break;
                    }
                }


                // Display Student Information

                if(Index_Of_Instructor!=-1)
                {
                    System.out.print(INSTRUCTORS.get(Index_Of_Instructor).toString());

                    System.out.print(
                            "                 01. To edit the name, click                           \" 1 \" \n\n\n" +
                                    "                 02. To edit the Age, click                            \" 2 \" \n\n\n" +
                                    "                 03. To edit the Phone Number, click                   \" 3 \" \n\n\n" +
                                    "                 04. To edit the E-mail, click                         \" 4 \" \n\n\n" +
                                    "                 05. To edit the Salary, click                         \" 5 \" \n\n\n" +
                                    "                 06. To edit the ID Academy, click                     \" 6 \" \n\n\n                 ======>  ");


                    char  Number_Of_Operation_Edit = input.next().charAt(0);

                    switch (Number_Of_Operation_Edit)
                    {
                        case '1' :
                        {
                            INSTRUCTORS.get(Index_Of_Instructor).setName(input.next());
                        };break;
                        case '2':
                        {
                            INSTRUCTORS.get(Index_Of_Instructor).setAge(input.next());
                        };break;
                        case '3':
                        {
                            INSTRUCTORS.get(Index_Of_Instructor).setPhone(input.next());
                        }break;
                        case '4':
                        {
                            INSTRUCTORS.get(Index_Of_Instructor).setE_mail(input.next());
                        };break;
                        case '5':
                        {
                            INSTRUCTORS.get(Index_Of_Instructor).setID_Academy(input.next());
                        };break;
                        case '6':
                        {
                            boolean done = false;
                            do{
                                done = false;
                                try
                                {
                                    INSTRUCTORS.get(Index_Of_Instructor).setSalary_Instructor(input.nextDouble());
                                }
                                catch (InputMismatchException E)
                                {
                                    System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                                    done = true;
                                    input.nextLine();
                                }
                            }while (done);
                        }
                    }
                }
                else
                    System.out.println("                 There is no Instructor with this ID..!!");
            }
            case '4':
            {
                int Index_Of_Technical = -1;

                // just To search

                for(int i=0;0<TECHNICALS.size();i++)
                {
                    if(Number_ID.equals(TECHNICALS.get(i).getID_Academy()));
                    {
                        Index_Of_Technical = i;
                        break;
                    }
                }


                // Display Student Information

                if(Index_Of_Technical!=-1)
                {
                    System.out.print(TECHNICALS.get(Index_Of_Technical).toString());

                    System.out.print(
                            "                 01. To edit the name, click                           \" 1 \" \n\n\n" +
                                    "                 02. To edit the Age, click                            \" 2 \" \n\n\n" +
                                    "                 03. To edit the Phone Number, click                   \" 3 \" \n\n\n" +
                                    "                 04. To edit the E-mail, click                         \" 4 \" \n\n\n" +
                                    "                 05. To edit the Salary, click                         \" 5 \" \n\n\n" +
                                    "                 06. To edit the ID Academy, click                     \" 6 \" \n\n\n                 ======>  ");


                    char  Number_Of_Operation_Edit = input.next().charAt(0);

                    switch (Number_Of_Operation_Edit)
                    {
                        case '1' :
                        {
                            TECHNICALS.get(Index_Of_Technical).setName(input.next());
                        };break;
                        case '2':
                        {
                            TECHNICALS.get(Index_Of_Technical).setAge(input.next());
                        };break;
                        case '3':
                        {
                            TECHNICALS.get(Index_Of_Technical).setPhone(input.next());
                        }break;
                        case '4':
                        {
                            TECHNICALS.get(Index_Of_Technical).setE_mail(input.next());
                        };break;
                        case '5':
                        {
                            TECHNICALS.get(Index_Of_Technical).setID_Academy(input.next());
                        };break;
                        case '6':
                        {
                            boolean done = false;
                            do{
                                done = false;
                                try
                                {
                                    INSTRUCTORS.get(Index_Of_Technical).setSalary_Instructor(input.nextDouble());
                                }
                                catch (InputMismatchException E)
                                {
                                    System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                                    done = true;
                                    input.nextLine();
                                }
                            }while (done);
                        }
                    }
                }
                else
                    System.out.println("                 There is no Technical with this ID..!!");
            }
            case '5':
            {
                int Index_Of_worker = -1;

                // just To search

                for(int i=0;0<WORKER.size();i++)
                {
                    if(Number_ID.equals(WORKER.get(i).getID_Academy()));
                    {
                        Index_Of_worker = i;
                        break;
                    }
                }


                // Display Student Information

                if(Index_Of_worker!=-1)
                {
                    System.out.print(WORKER.get(Index_Of_worker).toString());

                    System.out.print(
                            "                 01. To edit the name, click                           \" 1 \" \n\n\n" +
                                    "                 02. To edit the Age, click                            \" 2 \" \n\n\n" +
                                    "                 03. To edit the Phone Number, click                   \" 3 \" \n\n\n" +
                                    "                 04. To edit the E-mail, click                         \" 4 \" \n\n\n" +
                                    "                 05. To edit the Salary, click                         \" 5 \" \n\n\n" +
                                    "                 06. To edit the ID Academy, click                     \" 6 \" \n\n\n                 ======>  ");


                    char  Number_Of_Operation_Edit = input.next().charAt(0);

                    switch (Number_Of_Operation_Edit)
                    {
                        case '1' :
                        {
                            WORKER.get(Index_Of_worker).setName(input.next());
                        };break;
                        case '2':
                        {
                            WORKER.get(Index_Of_worker).setAge(input.next());
                        };break;
                        case '3':
                        {
                            WORKER.get(Index_Of_worker).setPhone(input.next());
                        }break;
                        case '4':
                        {
                            WORKER.get(Index_Of_worker).setE_mail(input.next());
                        };break;
                        case '5':
                        {
                            WORKER.get(Index_Of_worker).setID_Academy(input.next());
                        };break;
                        case '6':
                        {
                            boolean done = false;
                            do{
                                done = false;
                                try
                                {
                                    WORKER.get(Index_Of_worker).setSalary_worker(input.nextDouble());
                                }
                                catch (InputMismatchException E)
                                {
                                    System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                                    done = true;
                                    input.nextLine();
                                }
                            }while (done);
                        }
                    }
                }
                else
                    System.out.println("                 There is no worker with this ID..!!");
            }

        }
    }

    static void search()  // finish____
    {
        System.out.print("                 01. To search for a student , click                                   \" 1 \" \n\n\n" +
                "                 02. To search for a Administrators , click                            \" 2 \" \n\n\n" +
                "                 03. To search for a Instructor , click                                \" 3 \" \n\n\n" +
                "                 04. To search for a Technical , click                                 \" 4 \" \n\n\n" +
                "                 05. To search for a worker , click                                    \" 5 \" \n\n\n                 ======>  ");

        boolean done = false;

        char Number_Of_Operation = input.next().charAt(0);

        System.out.print("Enter the academic number you want to search for...\n                 ======>  ");
        String Number_ID=input.next();

        switch (Number_Of_Operation)
        {
            case '1':
            {
                int Index_Of_Student = -1;

                if(STUDENTS.size()>0)
                {
                    Index_Of_Student = -1;

                    // just To search

                    for (int i = 0; 0 < STUDENTS.size(); i++) {
                        if (Number_ID.equals(STUDENTS.get(i).getID_Academy())) ;
                        {
                            Index_Of_Student = i;
                            break;
                        }
                    }
                    System.out.println(STUDENTS.get(Index_Of_Student).toString());

                    if(Index_Of_Student != -1)
                        System.out.println(STUDENTS.get(Index_Of_Student).toString());
                    else
                        System.out.println("There is no student with this ID..!!");
                }
                else
                {
                    System.out.println("There is no student Yet..!!");
                }

            };
            break;
            case '2':
            {
                int Index_Of_Administrators = -1;

                if(ADMINISTRATORS.size()>0)
                {
                    // just To search

                    for(int i=0;0<ADMINISTRATORS.size();i++)
                    {
                        if(Number_ID.equals(ADMINISTRATORS.get(i).getID_Academy()));
                        {
                            Index_Of_Administrators = i;
                            break;
                        }
                    }

                    System.out.println(ADMINISTRATORS.get(Index_Of_Administrators).toString());

                    if(Index_Of_Administrators != -1)
                        ADMINISTRATORS.get(Index_Of_Administrators).toString();
                    else
                        System.out.println("There is no Administrators with this ID..!!");
                }
                else
                {
                    System.out.println("There is no Administrators Yet..!!");
                }
            };
            break;
            case '3':
            {
                int Index_Of_Instructors = -1;

                if(INSTRUCTORS.size()>0)
                {
                    // just To search

                    for(int i=0;0<INSTRUCTORS.size();i++)
                    {
                        if(Number_ID.equals(INSTRUCTORS.get(i).getID_Academy()));
                        {
                            Index_Of_Instructors = i;
                            break;
                        }
                    }

                    System.out.println(INSTRUCTORS.get(Index_Of_Instructors).toString());

                    if(Index_Of_Instructors != -1)
                        INSTRUCTORS.get(Index_Of_Instructors).toString();
                    else
                        System.out.println("There is no Instructors with this ID..!!");
                }
                else
                {
                    System.out.println("There is no Instructors Yet..!!");
                }
            };
            break;
            case '4':
            {
                int Index_Of_Technical = - 1;

                if(TECHNICALS.size()>0)
                {
                    // just To search

                    for(int i=0;0<TECHNICALS.size();i++)
                    {
                        if(Number_ID.equals(TECHNICALS.get(i).getID_Academy()));
                        {
                            Index_Of_Technical = i;
                            break;
                        }
                    }

                    System.out.println(INSTRUCTORS.get(Index_Of_Technical).toString());

                    if(Index_Of_Technical != -1)
                        INSTRUCTORS.get(Index_Of_Technical).toString();
                    else
                        System.out.println("There is no Technical with this ID..!!");
                }
                else
                {
                    System.out.println("There is no Administrators Yet..!!");
                }
            };
            break;
            case '5':
            {
                int Index_Of_Worker = -1;

                if(WORKER.size()>0)
                {
                    // just To search

                    for(int i=0;0<WORKER.size();i++)
                    {
                        if(Number_ID.equals(WORKER.get(i).getID_Academy()));
                        {
                            Index_Of_Worker = i;
                            break;
                        }
                    }

                    System.out.println(WORKER.get(Index_Of_Worker).toString());

                    if(Index_Of_Worker != -1)
                        WORKER.get(Index_Of_Worker).toString();
                    else
                        System.out.println("There is no Worker with this ID..!!");
                }
                else
                {
                    System.out.println("There is no Administrators Yet..!!");
                }

            };
            break;

        }

        System.out.println("\n\n\n                 To search for another person, Click  ==>   \" 1 \"     TO Go MAIN MENU, Click  ==>   \" 2 \"");

        int Number = 0;

        do{
            done = false;
            try
            {
                Number = input.nextInt();
            }
            catch (InputMismatchException E)
            {
                System.out.print("                 this not Valid , please Enter the valid Value Integer\n                 ======>  ");
                done = true;
                input.nextLine();
            }
        }while (done);

        if(Number==1)
            search();
    }

    static void Display_All_Information()  // finish
    {
        System.out.println("\n\n                                                                    ---- All ADMINISTRATORS ----\n\n\n");

        for (int i = 0; i < ADMINISTRATORS.size(); i++)
        {
            System.out.println(ADMINISTRATORS.get(i).toString2() + "\n\n");
        }

        System.out.println("\n\n                                                                    ---- All INSTRUCTORS ----\n\n\n");

        for (int i = 0; i < INSTRUCTORS.size(); i++)
        {
            System.out.println(INSTRUCTORS.get(i).toString2() + "\n\n");
        }

        System.out.println("\n\n                                                                    ---- All TECHNICALS ----\n\n\n");

        for (int i = 0; i < TECHNICALS.size(); i++)
        {
            System.out.println(TECHNICALS.get(i).toString2() + "\n\n");
        }

        System.out.println("\n\n                                                                    ---- All STUDENTS ----\n\n\n");

        for (int i = 0; i < STUDENTS.size(); i++)
        {
            System.out.println(STUDENTS.get(i).toString2() + "\n\n");
        }

        System.out.println("\n\n                                                                    ---- All WORKER ----\n\n\n");

        for (int i = 0; i < WORKER.size(); i++)
        {
            System.out.println(WORKER.get(i).toString2() + "\n\n");
        }
    }

    static void input_Of_Person(Person Obj, String Str)  // finish
    {
        System.out.print("                 Enter The Name of " + Str + "...\n                 ======>  ");
        Obj.setName(input.next());
        System.out.println();
        System.out.print("                 Enter The Rational ID of " + Str + "...\n                 ======>  ");
        Obj.setRational_ID(input.next());
        System.out.println();
        System.out.print("                 Enter The Age of " + Str + "...\n                 ======>  ");
        Obj.setAge(input.next());
        System.out.println();

        System.out.print("                 Enter The Phone Number of " + Str + "...\n                 ======>  ");
        Obj.setPhone(input.next());
        System.out.println();
        System.out.print("                 Enter The E_mail of " + Str + "...\n                 ======>  ");
        Obj.setE_mail(input.next());
        System.out.println();
        System.out.print("                 Enter The Degree of " + Str + "...\n                 ======>  ");
        Obj.setDegree(input.next());
        System.out.println();

        System.out.print("                 Enter The Address of " + Str + "...\n");

        System.out.print("                 Enter The Country of " + Str + "...\n                 ======>  ");
        Obj.setAddress_Country(input.next());
        System.out.print("                 Enter The City of " + Str + "...\n                 ======>  ");
        Obj.setAddress_City(input.next());
        System.out.print("                 Enter The Street of " + Str + "...\n                 ======>  ");
        Obj.setAddress_Street(input.next());
        System.out.print("                 Enter The Residential_Building of " + Str + "...\n                 ======>  ");
        Obj.setResidential_Building(input.next());

        System.out.print("                 Is the " + Str + " an Resident or Not ? ...\n\n\n" +
                "                 01.true             00.false \n                 ======>  ");
        Obj.setResident(input.next());
        System.out.println();


    }
}
