package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TypeArticleDAO extends BaseDAO {

	private Connection connection;

	public TypeArticleDAO(Connection connection) throws SQLException {
		this.connection = connection;
	}

	public TypeArticle getTypeArticleById(int idTypeArticle) throws SQLException {
		try {
			Statement state = connection.createStatement();

			String query = "SELECT * FROM TypeArticle WHERE idTypeArticle = ?";
			PreparedStatement prepare = connection.prepareStatement(query);
			prepare.setInt(1, idTypeArticle);

			ResultSet result = prepare.executeQuery();
			
			TypeArticle typeArticle = new TypeArticle(result.getInt(0), result.getString(1));
		
			result.close();
			state.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			connection.close();
		}
	}
}
