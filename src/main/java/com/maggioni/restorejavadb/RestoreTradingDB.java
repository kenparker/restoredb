package com.maggioni.restorejavadb;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.derby.client.am.Connection;

/**
 * http://stackoverflow.com/questions/15750768/restore-java-derby-database-backup?rq=1
 *
 * @author angelomaggioni
 */
public class RestoreTradingDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        {
            try {
                String dbURL = "jdbc:derby://localhost:1527/NSS_DB;restoreFrom="
                        + "c:/mybackups/2013-03-31/NSS_DB";
                Connection conn = null;
                Properties props = new Properties();
                props.put("user", "Demo");
                props.put("password", "demo");
                conn = (Connection) DriverManager.getConnection(dbURL, props);
                conn.commit();
            } catch (SQLException ex) {
                System.out.println("error");;
            }
        }

    }
