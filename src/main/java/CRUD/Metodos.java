package CRUD;

import java.sql.*;

public class Metodos extends Conexao{

    public ResultSet buscarAws(){
        conectar();
        try{
            pstmt= conn.prepareStatement("SELECT * FROM Informacao WHERE data >= (current_date - 30) and nome_api = 'aws' ");
            rs = pstmt.executeQuery();
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        finally {
            desconectar();
            return rs;
        }

    }

    public ResultSet buscarOracle(){
        conectar();
        try{
            pstmt= conn.prepareStatement("SELECT * FROM Informacao WHERE data >= (current_date - 15) and nome_api = 'oracle' ");
            rs = pstmt.executeQuery();
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        finally {
            desconectar();
            return rs;
        }

    }

    public ResultSet buscarJira(){
        conectar();
        try{
            pstmt= conn.prepareStatement("SELECT * FROM Informacao WHERE data >= (current_date - 15) and nome_api = 'jira' ");
            rs = pstmt.executeQuery();
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        finally {
            desconectar();
            return rs;
        }

    }



    public int inserir(Informacao informacao){
        conectar();
        try {
            pstmt = conn.prepareStatement("insert into informacao(nome_api, data, status, problema, localizacao) values (?,?,?,?,?)");

            //setabdo o valor dos parâmetros
            pstmt.setString(1, informacao.getApi());
            Date data = (Date) informacao.getData();
            pstmt.setDate(2, data);
            pstmt.setString(3, informacao.getStatus());
            pstmt.setString(4, informacao.getProblema());
            pstmt.setString(5, informacao.getLocalizacao());

            return pstmt.executeUpdate();//executando o comando sql do preparedStatement

        }catch (SQLException sqle) {
            System.out.println(sqle);
            return -1;
        }
        finally {
            desconectar();//fechando a conexão com o banco
        }
    }
}
