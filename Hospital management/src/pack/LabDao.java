package pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import pack.Lab;
import pack.ConnectionProvider;

public class LabDao {
	private static final String lab_name = null;

	public static boolean insertLabValue(Lab dc) {
		boolean f=false;
		try {
			//JDBC connection
			Connection c=ConnectionProvider.createConnection();
			String query="insert into Lab(lab_name,room_no,lab_timing)values(?,?,?)";
		    //dynamic query
			PreparedStatement stmt=c.prepareStatement(query);
			stmt.setString(1, dc.getlab_name());
			stmt.setInt(2, dc.getroom_no());
			stmt.setString(3, dc.getlab_timing());
			stmt.executeUpdate();
			f=true;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteLabValue(int id) {
		boolean f1=false;
		try {
			Connection c1=ConnectionProvider.createConnection();
			String query1="delete from Lab where lab_id=?";
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

	public static void showLabValue() {
		try {
			Connection c=ConnectionProvider.createConnection();
			String query="select * from Lab";
			Statement sta=c.createStatement();
			ResultSet set=sta.executeQuery(query);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				int room_no=set.getInt(3);
				String timing=set.getString(4);
				System.out.println("Id: "+id+", Name: "+name+", Room_no: "+room_no+", Timing: "+timing);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	}