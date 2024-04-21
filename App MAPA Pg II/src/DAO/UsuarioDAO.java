/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Usuáriodto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {
    public void inserir(Usuáriodto usuario) {

        String sql = "INSERT INTO PRODUTO (NOME, SENHA, LOGIN, EMAIL) VALUES (?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, sql);
            ps.setString(2, sql);
            ps.setString(3, sql);
            ps.setString(4, sql);
            
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();            
        }finally{            
            try {            
                ps.close();
            } catch (SQLException ex) {
                
            }
        }
    }
}
