package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Mothusi Molorane
 */
public class DbUpdatableResultSet {

	public static void editableResultSet() throws SQLException {
		try (
				Connection connection = DbConnector.connectToDb();
				Statement statement = 
						connection.createStatement(
								ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement.executeQuery("SELECT * FROM course WHERE name='Medicine1'")) {
			
			System.out.println("Before the update");
			System.out.println("id \t Name");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name"));
			}
			// now update the resultset and display the modified data
			
			
			resultSet.absolute(1);
			resultSet.updateString("name", "Medicine");
			// reflect those changes back to the database
			// by calling updateRow() method
			resultSet.updateRow();
			System.out.println("After the update");
			System.out.println("id \t Name");
			resultSet.beforeFirst();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name"));
			}
		}
	}
	
	public static void main(String[] args) throws SQLException {
		editableResultSet();
	}

}
