package services;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbtable.reponse;

public class Dreponse {
		static Connection cnx = null;
		public static void   startConnection() {
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_qcm", "root", "");
		  }catch(Exception e) {
			System.out.println(e);
		  }
		}
		
		public static List<reponse> getReponseFor(int questionId) {
			List<reponse> listreponse = new ArrayList<reponse>();
			try {
				startConnection();
				String sql = "select * from reponse where questionId=?";
				PreparedStatement s =  cnx.prepareStatement(sql);
				s.setInt(1, questionId);
				ResultSet rs =s.executeQuery();
				while(rs.next()) {
					reponse r = new reponse();
					
					r.setReponseId(rs.getInt(1));
					r.setQuestionId(rs.getInt(2));
				      r.setReponseLib(rs.getString(3));
				      listreponse.add(r);
				}
				cnx.close();
			}catch(Exception e1) {System.out.println(e1);}
			return listreponse;
		}
		
	}

