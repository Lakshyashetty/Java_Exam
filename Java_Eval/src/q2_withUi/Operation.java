package q2_withUi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Operation {

	void InsertData( Pojo pojo) {
		// TODO Auto-generated method stub
try {
	PreparedStatement preparedStatement=GetConnection.getConnection().prepareStatement("insert into user_4 values(?,?,?)");
	preparedStatement.setString(1,pojo.getName() );
	preparedStatement.setInt(2, pojo.getId());
	preparedStatement.setString(3, pojo.getContact());
	preparedStatement.executeUpdate();
	System.out.println("DataInserted...");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	 void UpdateData(Pojo pojo){
			try {
				PreparedStatement preparedStatement=GetConnection.getConnection().prepareStatement("update  user_4 set name=? ,contact=? where id=?");
				preparedStatement.setString(1, pojo.getName());
				preparedStatement.setString(2, pojo.getContact());
				preparedStatement.setInt(3, pojo.getId());
				preparedStatement.executeUpdate();
				System.out.println("Data Updated....");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 
	}
	  void DeleteData(Pojo pojo) {
		// TODO Auto-generated method stub
			try {
				PreparedStatement preparedStatement=GetConnection.getConnection().prepareStatement("delete from user_4 where id=?");
				preparedStatement.setInt(1,pojo.getId() );
				preparedStatement.executeUpdate();
				System.out.println("Data Deleted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}
	   void ShowData(Pojo pojo) {
		// TODO Auto-generated method stub
			try {
				PreparedStatement preparedStatement=GetConnection.getConnection().prepareStatement("select * from user_4 where id=?");
				preparedStatement.setInt(1, pojo.getId());
				 ResultSet resultSet= preparedStatement.executeQuery();
				 if (resultSet.next()) {
					 System.out.println(resultSet.getString(1));
					 System.out.println(resultSet.getInt(2));
					 System.out.println(resultSet.getString(3));
					 pojo.setName(resultSet.getString(1));
					 pojo.setId(resultSet.getInt(2));
					 pojo.setContact(resultSet.getString(3));

					 
				}
				 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}
}
