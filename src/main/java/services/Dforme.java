package services;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbtable.forme;


public class Dforme {
		static Connection cnx = null;
		public static void   startConnection() {
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_qcm", "root", "");
		  }catch(Exception e) {
			System.out.println(e);
		  }
		}
		public static List<forme> getReponse(int questionId) {
			List<forme> listforme = new ArrayList<forme>();
			try {
				startConnection();
				String sql = "select * from forme";
				PreparedStatement s =  cnx.prepareStatement(sql);
				s.setInt(1, questionId);
				ResultSet rs =s.executeQuery();
				while(rs.next()) {
					forme f = new forme();
					
					f.setFormeId(rs.getInt(1));
					f.setFormeLib(rs.getString(2));
					listforme.add(f);
				}
				cnx.close();
			}catch(Exception e1) {System.out.println(e1);}
			return listforme;
		}
	}



