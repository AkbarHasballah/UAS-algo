import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;

public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private void gerak(){
    try{
    String sql = "UPDATE arah SET kunci";
         java.sql.Connection conn = (Connection)koneksi.configDB();
         java.sql.Statement stm = conn.createStatement();
         java.sql.ResultSet res = stm.executeQuery(sql);}
        catch (SQLException e){
            System.out.println("error :" + e.getMessage());
        }}
   public void act() 

    { 
        move(4); 
    
       if (Greenfoot.isKeyDown("w"))
       {
         setRotation(270);
         move(3);
          
       }
       if (Greenfoot.isKeyDown("s"))
       {
           setRotation(90);
           move(3);
        
       }  
       if (Greenfoot.isKeyDown("a")){
           setRotation(180);
           move(3);
       }
       if (Greenfoot.isKeyDown("d")){
           setRotation(0);
           move(3);
       }

    }
      private static Connection MYSQLConfig;
  
  public static Connection configDB()throws SQLException{
      try{
          Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/arah","root","");
      }catch (SQLException e){
          System.out.println("sambugan koneksi ke database gagal!");
      }
      return MYSQLConfig;
  }
}

