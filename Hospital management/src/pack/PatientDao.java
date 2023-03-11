package pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import pack.Patient;
import pack.ConnectionProvider;

public class PatientDao {

	
	public static boolean insertPatientValue(Patient patient) {
		
		boolean f=false;
		try {
		
			Connection c=ConnectionProvider.createConnection();
			String query="insert into Patient(patient_name,disease,gender,admit_status,age)values(?,?,?,?,?)";
		    //dynamic query
			PreparedStatement stmt=c.prepareStatement(query);
			stmt.setString(1, patient.getPatient_name());
			stmt.setString(2, patient.getDisease());
			stmt.setString(3, patient.getGender());
			stmt.setString(4, patient.getAdmit_status());
			stmt.setInt(5, patient.getAge());
			stmt.executeUpdate();
			f=true;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deletePatientValue(int id) {
		boolean f1=false;
		try {
			Connection c1=ConnectionProvider.createConnection();
			String query1="delete from Patient where patient_id=?";
			PreparedStatement stmt=c1.prepareStatement(query1);
			stmt.setInt(1,id);
			stmt.executeUpdate();
			f1=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f1;
		
	}

	public static void showPatientDetails() {
		try {
			Connection c=ConnectionProvider.createConnection();
			String query="select * from Patient";
			Statement sta=c.createStatement();
			ResultSet set=sta.executeQuery(query);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String disease=set.getString(3);
				String gender=set.getString(4);
				String admit_status=set.getString(5);
				int age=set.getInt(6);
				System.out.println("Id: "+id+" Patient-Name: "+name+" Disease: "+disease+" Gender: "+gender+" Admit Status: "+admit_status+" Age: "+age);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	public static boolean UpdatePatientDetail(int id,String changed_attr) {
		boolean f1=false;
		//Patient p=new Patient();
		try {
			Connection c1=ConnectionProvider.createConnection();
			String query1="update Patient set admit_status=? where patient_id=?";
			PreparedStatement stmt=c1.prepareStatement(query1);
			stmt.setString(1,changed_attr);
			stmt.setInt(2,id);
			stmt.executeUpdate();
			f1=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f1;
	}
	public static int checkPatientDetail(int id) {
		boolean f1=false;
		//Patient p=new Patient();
		try {
			Connection c1=ConnectionProvider.createConnection();
//			Statement st = c1.createStatement();
			String query1="select * from Patient having patient_id="+id+"";
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
//				c1.close();}
			
			PreparedStatement stmt=c1.prepareStatement(query1);
			stmt.setInt(id, id);
			stmt.execute();
			f1=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return id;
	}
}
