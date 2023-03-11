package pack;

import java.util.Scanner;

//import pack.DoctorDao;
//import pack.MedicineDao;
//import pack.PatientDao;
//import pack.Doctor;
//import pack.Medicine;
//import pack.Patient;

public class main {

	private static String changed_att;
	private static int id;
	private static int query1;
	private static char[] rs;
	private static String pname;

	public static void main(String[] args) {
		int s1,c1;
	
		Scanner sc=new Scanner(System.in);
		System.out.println(" *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Please Login ");
        System.out.println("Enter Username");
        String username=sc.next();
        System.out.println("Enter Password");
        String password=sc.next();
        if(username.equalsIgnoreCase("staff") & password.equals("s@info")){
        System.out.println("Press keys according to values");	
        
        while(true) {
			
			
			System.out.println("Press 1  For Doctor");
			System.out.println("Press 2  for Patient");
			System.out.println("Press 3  for Medicine");
			System.out.println("Press 4  for Lab");
			System.out.println("Press 5  Exit");
			
			int optional=sc.nextInt();
			
		switch(optional) {

		
            case 1:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1)
                    {
                    	System.out.println("Press the number to perform");
                        System.out.println("1.Add New Entry\n2.Delete the Doctor Detail\n3.Existing Doctors List\n4.Update Doctor Detail");
                        c1 = sc.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                	System.out.println("Enter the name");
                                	String dname=sc.next();
                                	System.out.println("Enter the specilization");
                                	String dspecilization=sc.next();
                                	System.out.println("Enter the timing");
                                	String dtiming=sc.next();
                                	System.out.println("Enter the qualification");
                                	String dspec=sc.next();
                                	System.out.println("Enter the roomno");
                                	int droom=sc.nextInt();
                                	Doctor doctor=new Doctor(dname,dspecilization,dtiming,dspec,droom);
                                	boolean b=DoctorDao.insertDoctorValue(doctor);
                                	if(b) {
                                		System.out.println("Inserted Successfuly");
                                	}
                                	else {
                                		System.out.println("Something went wrong in insertion!");
                                	}
                                	break;
                                    
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    
                                    System.out.println("Enter the id you want to delete");
                                    int id=sc.nextInt();
                                    boolean b=DoctorDao.deleteDoctorValue(id);
                                    if(b) {
                                		System.out.println("deleted Successfuly");
                                	}
                                	else {
                                		System.out.println("Something went wrong in deletion!");
                                	}
                                    break;                       
                                }
                            case 3:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                
                                DoctorDao.showDoctorValue();
                                
                                break;                   
                            }
                            case 4:
                            {
                         	   System.out.println("--------------------------------");
                         	   System.out.println("Enter the doctor id you want to update");
                               int id=sc.nextInt();
                         	   System.out.println("Enter the changed timing");
                         	   String changed_att=sc.next();
                         	   boolean b= DoctorDao.UpdateDoctorDetail(id,changed_att);
                         	   if(b) {
                               		System.out.println("Updated Successfuly");
                               	}
                               	else {
                               		System.out.println("Something went wrong in Updation!");
                               	}
                               break;
                            }
                        
                        }
                        System.out.println("\nPress 1 for doctor menu and Press 0 for Main Menu");
                        s1 = sc.nextInt();

                    }
                        break;
                }
                	
            case 2: {
            	System.out.println("--------------------------------------------------------------------------------");
            	   System.out.println("                      **Patient SECTION**");
                   System.out.println("--------------------------------------------------------------------------------");
                   s1 = 1;
                   while (s1 == 1)
                   {
                	   System.out.println("Press the number to perform");
                       System.out.println("1.Add New Entry\n2.Delete the patient Detail\n3.Existing Patients List\n4.Update Patient\n5.Check the patient if already registered");
                       c1 = sc.nextInt();
                       switch (c1)
                       {
                           case 1:
                               {
                               	System.out.println("Enter the name");
                               	String pname=sc.next();
                               	System.out.println("Enter the disease");
                               	String disease=sc.next();
                               	System.out.println("Enter the gender");
                               	String gender=sc.next();
                               	System.out.println("Enter the status");
                               	String status=sc.next();
                               	System.out.println("Enter the age");
                               	int age=sc.nextInt();
                               	Patient patient=new Patient(pname,disease,gender,status,age);
                       
                               	boolean b=PatientDao.insertPatientValue(patient);
                               	if(b) {
                               		System.out.println("Inserted Successfuly");
                               	}
                               	else {
                               		System.out.println("Something went wrong in insertion!");
                               	}
                               	break;
                                   
                               }
                           case 2:
                               {
                                   System.out.println("--------------------------------------------------------------------------------");
                                   
                                   System.out.println("Enter the patient id you want to delete");
                                   int id=sc.nextInt();
                                   boolean b=PatientDao.deletePatientValue(id);
                                   if(b) {
                               		System.out.println("deleted Successfuly");
                               	}
                               	else {
                               		System.out.println("Something went wrong in deletion!");
                               	}
                                  break; 
                      
                               }
                           case 3:
                           {
                               System.out.println("--------------------------------------------------------------------------------");
                               PatientDao.showPatientDetails();
                               
                               break;                
                           }
                           case 4:
                           {
                        	   System.out.println("--------------------------------");
                        	   System.out.println("Enter the patient id you want to update");
                        	   int id=sc.nextInt();
            
                        	   System.out.println("Enter the changed value");
                        	   String changed_att=sc.next();
                    
                        	   boolean b= PatientDao.UpdatePatientDetail(id,changed_att);
                        	   if(b) {
                              		System.out.println("Updated Successfuly");
                              	}
                              	else {
                              		System.out.println("Something went wrong in Updation!");
                              	}                                           
                               break;
                           }
                           case 5:
                           {
                               System.out.println("--------------------------------------------------------------------------------");
               
                               System.out.println("Enter your patient name: ");
                        	   int a=sc.nextInt();
                        	   
                           	   int b=PatientDao.checkPatientDetail(id);
                        	   if(a==b) {
                        		   System.out.println(rs);
                        	   }
                        	   else {
                        		   System.out.println("Not Register");
                        	   }
                         
                               break;                   
                           }
                       }
                           System.out.println("\nPress 1 for Patient menu and Press 0 for Main Menu");
                           s1 = sc.nextInt();                  
                       }
                          break;                          
                       } 
            
            
                case 3:
                      {
                           System.out.println("--------------------------------------------------------------------------------");
                           System.out.println("                      **Medicine SECTION**");
                           System.out.println("--------------------------------------------------------------------------------");
                           s1 = 1;
                           while (s1 == 1)
                           {
                        	   System.out.println("Press the number to perform");
                               System.out.println("1.Expiry date of Medicine\n2.List of Medicine out of stock\n3.Add Medicine");
                               c1 = sc.nextInt();
                               switch (c1)
                               {
                                   case 1:
                                       {
                                    	   MedicineDao.ExpiryDateMedicine();
                                       	break;
                                           
                                       }
                                   case 2:
                                       {
                                           System.out.println("--------------------------------------------------------------------------------");
                                           
                                           MedicineDao.outOfStockMedicine();
                                           break;
                              
                                       }
                                   case 3:
                                   {
                                   	System.out.println("Enter the name of medicine");
                                   	String mname=sc.next();
                                   	System.out.println("Enter the composition");
                                   	String mcomp=sc.next();
                                   	System.out.println("Enter the expiry-date");
                                   	String exp_date=sc.next();
                                   	System.out.println("Enter the quantity");
                                   	int quan=sc.nextInt();
                  
                                   	Medicine med=new Medicine(mname,mcomp,exp_date,quan);
                           
                                   	boolean b=MedicineDao.addMedicine(med);
                                   	if(b) {
                                   		System.out.println("Inserted Successfuly");
                                   	}
                                   	else {
                                   		System.out.println("Something went wrong in insertion!");
                                   	}
                                   	break;                                      
                                   }                   
                               }
                               
                       System.out.println("\nPress 1 for Medicine menu and Press 0 for Main Menu");
                       s1 = sc.nextInt();                      
                   }    
                      }
        case 4:
        {
             System.out.println("--------------------------------------------------------------------------------");
             System.out.println("                      **Lab SECTION**");
             System.out.println("--------------------------------------------------------------------------------");
             s1 = 1;
             while (s1 == 1)
             {
            	 System.out.println("Press the number to perform");
                 System.out.println("1.Add Labarotory Details\n2.Existing Lab Details\n3.Delete Lab Details");
                 c1 = sc.nextInt();
                 switch (c1)
                 {
                 case 1:
                 {
                 	System.out.println("Enter Lab name: ");
                 	String lname=sc.next();
                 	System.out.println("Enter Room Number: ");
                 	int lroom_no=sc.nextInt();
                 	System.out.println("Enter Lab timing");
                 	String ltiming=sc.next();
                 	Lab lab=new Lab(lname,lroom_no,ltiming);
                 	boolean b=LabDao.insertLabValue(lab);
                 	if(b) {
                 		System.out.println("Inserted Successfuly");
                 	}
                 	else {
                 		System.out.println("Something went wrong in insertion!");
                 	}
                 	break;                    
                 }
                 
                 
                 case 2:
                 {
                     System.out.println("--------------------------------------------------------------------------------");
 
                     LabDao.showLabValue();
                     
                     break;        
                 }
                 
             case 3:
             {
                 System.out.println("--------------------------------------------------------------------------------");
                 
                 System.out.println("Enter the id you want to delete: ");
                 int id=sc.nextInt();
                 boolean b=LabDao.deleteLabValue(id);
                 if(b) {
             		System.out.println("deleted Successfuly");
             	}
             	else {
             		System.out.println("Something went wrong in deletion!");
             	}
                 break;                       
             }
                 }
         
         System.out.println("\nPress 1 for Lab menu and Press 0 for Main Menu");
         s1 = sc.nextInt();
        }
        }
		}
        }
        }
		
        else if(username.equalsIgnoreCase("Doctor") & password.equals("d@info")){
        	while(true) {
    			
    			
    			System.out.println("Press 1  for Doctor list");
    			System.out.println("Press 2  Exit");
    			
    			int optional=sc.nextInt();
    			
    		switch(optional) {

    		
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR VIEW**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                        	System.out.println("Press the number to perform");
                            System.out.println("1.Existing patient list\n2.out of medicine list");
                            c1 = sc.nextInt();
                            switch (c1)
                            {
                            case 1:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                PatientDao.showPatientDetails();
                            }
                                break;                
                            
                               
                        case 2:
                        {
                            System.out.println("--------------------------------------------------------------------------------");
                            
                            MedicineDao.outOfStockMedicine();
                            break;
               
                        }
                            }
                            
                            System.out.println("\nPress 1 for menu");
                            s1 = sc.nextInt();
        	
        }
                    }
                    }
        	}
        }
        
        else {
        	
        	System.out.println("Sorry! Enter Correct username and password");
        }
}
        }    	

        