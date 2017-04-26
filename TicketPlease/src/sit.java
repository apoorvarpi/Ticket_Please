import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class sit{
    public static void main(String a[])
    {
        String p,p1=" ";
        PKP2 a1=new PKP2();
        Shaandar a2=new Shaandar();
        Spectre a3=new Spectre();
        Goosebumps a4=new Goosebumps();
        MockingJay a5=new MockingJay();
        SinghIsBling a6=new SinghIsBling();
       if(a1.text!=null)
           p=a1.text;
       if(a2.text!=null)
           p=a2.text;
       if(a3.text!=null)
           p=a3.text;
       if(a4.text!=null)
           p=a4.text;
       if(a5.text!=null)
           p=a5.text;
       if(a6.text!=null)
           p=a6.text;
       if(a1.text1!=null)
           p1=a1.text1;
       if(a2.text1!=null)
           p1=a2.text1;
       if(a3.text1!=null)
           p1=a3.text1;
       if(a4.text1!=null)
           p1=a4.text1;
       if(a5.text1!=null)
           p1=a5.text1;
       if(a6.text1!=null)
           p1=a6.text1;
       
       //System.out.println("p="+);
     //System.out.println("fdhouhgsoh");   
        try{
          //  System.out.println("fdhouhgsoh"); 
        Class.forName(
                "com.mysql.jdbc.Driver");
        //System.out.println("fdhouhgsoh"); 
        System.out.println("Connecting to a selected database...");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sapphire","root","1234");
        System.out.println("Connected database successfully...");
        System.out.println("Inserting records into the table...");
        Statement st=con.createStatement();
        String sql = "INSERT INTO  ticket " +
                   "VALUES (100, 'jhjh', " + p1 + ", 18)";
      st.executeUpdate(sql);
      System.out.println("Inserted records into the table...");
        st.close();
        con.close();
         }catch(Exception e)
        
        {}
    }
}

