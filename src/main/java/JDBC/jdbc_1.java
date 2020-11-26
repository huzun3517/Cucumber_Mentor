package JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class jdbc_1 {

    @Test
    public void jdbc_Test() throws SQLException {

        //Java Data Base Connectivity

        String url = "jdbc:mysql://test.medis.mersys.io:33306/company";
        //Selenium'daki Path mantığı gibi

        String username = "technostudy";
        String password = "zhTPis0l9#$&";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from employees");

        //Başlangıçta başlıkların olduğu row'da olduğu için .next ile ilerletmeliyiz.
        //Row'larda ilerlemeye yapıyor.
        for (int i = 1; i < 10; i++) {
            resultSet.next();
        }

        //Spesifik column seçmemize yarıyor.
        String employee_id = resultSet.getString("EMPLOYEE_ID");
        String firstname = resultSet.getString("FIRST_NAME");
        String lastname = resultSet.getString("LAST_NAME");
        String salary = resultSet.getString("SALARY");

        System.out.println(employee_id + " " + "Numaralı Çalışan: " + firstname + " " + lastname + " ve Maaşı: " + salary);

        //Direkt sayı vererek kaçıncı column'u almak istiyorsak alıyoruz.
        String email = resultSet.getString(4);
        System.out.println("Çalışanın Email'i: " + email);

    }


//<!-- JDBC -->
//        <dependency>
//            <groupId>mysql</groupId>
//            <artifactId>mysql-connector-java</artifactId>
//            <version>8.0.18</version>
//        </dependency>



}
