package database;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Test {
	
	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
	
	String URL ="jdbc:mysql://localhost:3306/ecommerce";
	String Username="root";
	String Password="root";
	Db_Connection db;
	
	db=new Db_Connection(URL, Username, Password) ;
	
	Statement st =db.getConnection().createStatement();
	
	CallableStatement stmt= db.getConnection().prepareCall("{call add_Product(?,?)}");
	
//	stmt.setString(1, "speaker");
//	stmt.setInt(2, 5000);
//	stmt.executeUpdate();
	
    // st.executeUpdate("insert into eproduct (name, price, date_added) values ('Tablet', 17800.00, now())");
	//st.executeUpdate("create database mydatabase");
	//st.executeUpdate("drop database mydatabase");
	
	//st.executeUpdate("update eproduct set ID=2 where name ='Table'");
	ResultSet rs=st.executeQuery("select * from eproduct");
	
	while(rs.next()) {
		System.out.println("Id :"+ rs.getString("id"));
		System.out.println("Name :"+ rs.getString("name"));
	}

}
}
