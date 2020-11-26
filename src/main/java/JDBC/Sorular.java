package JDBC;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class Sorular {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @BeforeTest
    public void connection() throws SQLException {
        String URL = "jdbc:mysql://test.medis.mersys.io:33306/company";
        String username = "technostudy";
        String password = "zhTPis0l9#$&";
        connection = DriverManager.getConnection(URL,username,password);
        statement = connection.createStatement();
        resultSet=      statement.executeQuery("select * from countries");

    }

    // Soru 1 - ülke isimlerini yazdırın.

    @Test
    public void soru1() throws SQLException {

        while (resultSet.next()){

            String country_name = resultSet.getString("COUNTRY_NAME");
            System.out.println(country_name);
        }
    }


    // SORU 2 - ülke isimleri ve ülke id leri yazdırın.
    // Örn:    Turkey  TR

    @Test
    public void soru2() throws SQLException {

        while (resultSet.next()){

            String country_name = resultSet.getString("COUNTRY_NAME");
            String country_id = resultSet.getString("COUNTRY_ID");
            System.out.println(country_name + " " + country_id);
        }
    }

     // SORU 3: ilk 10 ülkeyi yazdır. içerisinde E harfi bulunanları büyük yazdır.

    @Test
    public void soru3() throws SQLException {

        int count = 0;

        while (count < 10){

           resultSet.next();

               String name = resultSet.getString(2);

               if (name.contains("e")){
                   System.out.println(name.toUpperCase());
               }
               else {
                   System.out.println(name);
               }
               count++;
        }
    }

    // SORU 4 : ülkelerin içerisinden son harfi A ile bitenleri bulun. Bunu yazdırın ve Assert ile test edin.
    @Test
    public void soru4() throws SQLException {
        resultSet = statement.executeQuery("select * from countries  WHERE COUNTRY_NAME LIKE '%a'");

        while (resultSet.next()) {
            String country_name = resultSet.getString("COUNTRY_NAME");
            System.out.println(country_name);
            Assert.assertEquals(country_name.substring(country_name.length() - 1), "a");
        }
    }


}
