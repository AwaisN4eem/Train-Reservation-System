package BusinessLayer;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class GenerateReport {
    public static void main(String[] args) {
        try {
            // Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwayschema", "root", "PASSWORD-123");

            // Fetch tables and generate CSV files
            generateCSV(con, "admin");
            generateCSV(con, "customer");
            generateCSV(con, "trains");
            generateCSV(con, "complaints");

            // Close the database connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void generateCSV(Connection con, String tableName) throws IOException {
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName)) {

            // Get metadata
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Create CSV file
            try (FileWriter writer = new FileWriter(tableName + ".csv")) {
                // Write header
                for (int i = 1; i <= columnCount; i++) {
                    writer.append(metaData.getColumnName(i));
                    if (i < columnCount) {
                        writer.append(',');
                    }
                }
                writer.append('\n');

                // Write data
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        writer.append(rs.getString(i));
                        if (i < columnCount) {
                            writer.append(',');
                        }
                    }
                    writer.append('\n');
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
