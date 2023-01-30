import java.sql.*;

public class TestingCode {

    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Karen/Desktop/Devoir-AD-1.accdb");
            Statement st = conn.createStatement();
            String sql = "Select * from Student";
            ResultSet resultat = st.executeQuery(sql);
            while(resultat.next()){
                int id = resultat.getInt(1);
                String FirstName = resultat.getString(2);
                String LastName = resultat.getString(3);
                System.out.println(id +"\t"+FirstName+"\t"+LastName);
            }
            resultat.close();
            st.close();
            conn.close();
        } catch (Exception erreur) {
            System.out.println(erreur.getMessage());
        }
    }
}