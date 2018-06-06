package com.example.thiagosoares.carteiradeclientes.database;

public class ScriptDLL {

    public static String getCreateTableCliente(){
        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE ( ");
        sql.append(" CODIGO INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, ");
        sql.append(" NOME VARCHAR(250) NOT NULL DEFAULT (''), ");
        sql.append(" ENDERECO VARCHAR(255) NOT NULL DEFAULT (''), ");
        sql.append(" EMAIL VARCHAR(200) NOT NULL DEFAULT (''), ");
        sql.append(" TELEFONE VARCHAR(20) NOT NULL DEFAULT ('') ");
        sql.append(") ");

        return sql.toString();

    }
}
