/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.godev.dal;

import java.sql.*;

/**
 *
 * @author allan
 */
public class ModuloConexao {
    //método responsavel com estabelecer a conexão com o banco

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver que eu importei para a biblioteca
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/dbgodev";
        String user = "root";
        String password = "996633975";
        //Estabelecendo a Conexão com o Banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // a linha abaixo serve de apoio para descobrir o erro
           // System.out.println(e);
            return null;
        }
    }
}
