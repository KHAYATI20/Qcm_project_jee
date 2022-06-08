package services;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbtable.question;

public class Dquestion {
	
	

	
		static Connection cnx = null;
		public static void   startConnection() {
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_qcm", "root", "");
		  }catch(Exception e) {
			System.out.println(e);
		  }
		}
		
		public static List<question> getQuestions(int formeId) {
			List<question> listquestion= new ArrayList<question>();
			try {
				startConnection();
				String sql = "select * from question where formeId =?";
				PreparedStatement s =  cnx.prepareStatement(sql);
				s.setInt(1, formeId);
				ResultSet rs =s.executeQuery();
				while(rs.next()) {
					question q = new question();
				      q.setQuestionId(rs.getInt(1));
				      q.setFormeId(rs.getInt(2));
				      q.setQuestionLib(rs.getString(3));
				      
				    listquestion.add(q);
				}
				cnx.close();
			}catch(Exception e1) {System.out.println(e1);}
			return listquestion;
		}
		
		
		}

