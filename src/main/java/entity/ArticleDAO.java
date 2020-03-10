package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO extends BaseDAO {

	private Connection connection;
	private TypeArticleDAO typeArticleDAO;
	
	public ArticleDAO(Connection connection) throws SQLException {
		this.connection = connection;
	}

	public List<Article> getAllArticles() throws SQLException {
		try {
			Statement state = connection.createStatement();

			String query = "SELECT * FROM Article";

			PreparedStatement prepare = connection.prepareStatement(query);

			ResultSet result = prepare.executeQuery();

			List<Article> articles = new ArrayList<>();
			while (result.next()) {
				Article article = new Article(result.getInt("idArticle"), 
						result.getString("refArticle"), 
						result.getString("libelleArticle"),
						result.getDouble("prixArticle"));
				TypeArticleDAO typeArticleDAO = new TypeArticleDAO(connection);
				article.setTypeArticle(typeArticleDAO.getTypeArticleById(result.getInt("idTypeArticle")));

			}

			return articles;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
