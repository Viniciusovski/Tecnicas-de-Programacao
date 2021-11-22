package exemplo1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlunoDAO {
    public String gravarAluno(Aluno aluno){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO dados(rgm, nome, nota1, nota2) ";
            sql += "VALUES ('"+aluno.getRGM()+"', '"+aluno.getNome()+"',";
            sql += aluno.getNota1()+", "+aluno.getNoat2()+")";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
        }catch(Exception e){
            resp = e.toString();
        }
        return resp;
    }
    
    public String alterarAluno(Aluno aluno){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "UPDATE dados SET rgm='"+aluno.getRGM()+
                    "', nome='"+aluno.getNome()+
                    "', nota1="+aluno.getNota1()+
                    ", nota2="+aluno.getNoat2()+
                    "WHERE  rgm='"+aluno.getRGM()+"'";
            
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
        }catch(Exception e){
            resp = e.toString();
        }
        return resp;
    }
}
