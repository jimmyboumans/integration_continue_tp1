package integration_continue_tp1;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import entity.Article;
import entity.ArticleDAO;
import entity.BaseDAO;

@Path("/clients")
public class Client {
	
	BaseDAO baseDAO = new BaseDAO();
	Connection connection;
	ArticleDAO articleDAO;
	
	@GET
	public List<Article> getAllArticle() throws SQLException {
		connection = DriverManager.getConnection(baseDAO.getUrlDataBase(),baseDAO.getUserName(),baseDAO.getPassword());
		articleDAO = new ArticleDAO(connection);
		
		return articleDAO.getAllArticles();
	}

}
