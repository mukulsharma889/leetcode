import java.sql.*;
import java.util.*;

class DataBaseConnection
{
public static void main(String...a1)
{
try
{

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","MUKUL123_sharma");
Statement s=c.createStatement();
System.out.println(c);

}
catch(Exception e1)
{System.out.println(e1);}
}}
