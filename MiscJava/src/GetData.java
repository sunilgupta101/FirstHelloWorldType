import java.sql.*;

public class GetData
{
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "net.sourceforge.jtds.jdbc.Driver"; // "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:jtds:sqlserver://SGUPTA:1905;instance=SQL2014STANDARD;DatabaseName=uma_97_sdkCopy18R1;"; // "jdbc:mysql://localhost/EMP";
        //"jdbc:sqlserver://SGUPTA:1905;databaseName=SQL2014STANDARD/uma_97_sdkCopy18R1;integratedSecurity=true;";
    //"jdbc:jtds:sqlserver://SGUPTA:1905;instance=SQL2014STANDARD;DatabaseName=uma_97_sdkCopy18R1;"; // "jdbc:mysql://localhost/EMP";

    // Database credentials
    static final String USER = "TM_DEV";

    static final String PASS = "tm_dev";

    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 2: Register JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //"com.mysql.jdbc.Driver");

            // STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM TS_PROPOSED_ORDER_ALLOC";
            ResultSet rs = stmt.executeQuery(sql);
            
            ResultSetMetaData md = rs.getMetaData();
//            for (int i = 1; i <= md.getColumnCount(); i++) {
//                String colName = md.getColumnName(i);
//                System.out.println("ColName: " + colName);
//            }

            // STEP 5: Extract data from result set
            while (rs.next()) {
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    String colName = md.getColumnName(i);
                    Object obj = rs.getObject(i);
                    if (obj != null) {
                        System.out.print(colName + ", " );
                    }
                }
                break;
            }
            
            System.out.println();
            // STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        System.out.println("Goodbye!");
    }// end main

}
