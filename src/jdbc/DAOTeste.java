package jdbc;

public class DAOTeste {

	public static void main(String[] args) {

		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES(?)";
		System.out.println( dao.incluir(sql, "Henri Norston") );
		System.out.println( dao.incluir(sql, "Bob Dilan") );
		System.out.println( dao.incluir(sql, "Nataly Marsom") );
		
		dao.close();
	}

}
