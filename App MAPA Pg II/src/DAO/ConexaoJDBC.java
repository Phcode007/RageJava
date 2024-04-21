/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author phbs1
 */
public class ConexaoJDBC {
    
    private static final String Url = "jdbc:mysql//localhost:3306/BDMapa?user=root&password= ";
    private static final String User = "root";
    private static final String Password = "root";
            
public static Connection conn;
 
 public static Connection getConexao(){

    
    try {
        if(conn == null){
            conn = DriverManager.getConnection(Url, User, Password);
            return conn;
        }else{
       return conn;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Houve um erro ao acessar o banco de dados");
    }
        return null;
 }    

}