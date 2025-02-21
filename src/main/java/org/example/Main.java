package org.example;

import org.example.persistance.config.ConnectionConfig;
import org.example.persistance.migration.MigrationStrategy;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException{

        try(var connection = ConnectionConfig.getConnection())
        {
            new MigrationStrategy(connection).executeMigration();
        }
    }
}