
package student_registration_class;

import Student_Registration_system.classpackage.*;

/**
 *
 * @author Tanmoy paul
 */
public class user {
private int id;
private String stdName;
private String stdFatherName;
private String stdBlood;
private String stdAdress;
private String stdPhone;
private String Batch;  

private int adminid;
private String adminName;
private String adminemil;
private String adminpassword;

  

private int dirertorid;
private String dirertoremil;
private String dirertorpassword;

    

    public user(int id, String stdName, String stdFatherName, String stdBlood, String stdAdress, String stdPhone, String Batch) {
        this.id = id;
        this.stdName = stdName;
        this.stdFatherName = stdFatherName;
        this.stdBlood = stdBlood;
        this.stdAdress = stdAdress;
        this.stdPhone = stdPhone;
        this.Batch = Batch;
    }
    public void Edit(int id, String stdName, String stdFatherName, String stdBlood, String stdAdress, String stdPhone, String Batch) {
        this.id = id;
        this.stdName = stdName;
        this.stdFatherName = stdFatherName;
        this.stdBlood = stdBlood;
        this.stdAdress = stdAdress;
        this.stdPhone = stdPhone;
        this.Batch = Batch;
}
    public void Add_admin(int adminid, String adminName, String adminemil, String adminpassword, int dirertorid, String dirertoremil, String dirertorpassword) {
        this.adminid = adminid;
        this.adminName = adminName;
        this.adminemil = adminemil;
        this.adminpassword = adminpassword;
        this.dirertorid = dirertorid;
        this.dirertoremil = dirertoremil;
        this.dirertorpassword = dirertorpassword;
    }

    public void Dirertor(int dirertorid, String dirertoremil, String dirertorpassword) {
        this.dirertorid = dirertorid;
        this.dirertoremil = dirertoremil;
        this.dirertorpassword = dirertorpassword;
    }


    
    public int getId() {
        return id;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdFatherName() {
        return stdFatherName;
    }

    public String getStdBlood() {
        return stdBlood;
    }

    public String getStdAdress() {
        return stdAdress;
    }

    public String getStdPhone() {
        return stdPhone;
    }

    public String getBatch() {
        return Batch;
    }

    public int getAdminid() {
        return adminid;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminemil() {
        return adminemil;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public int getDirertorid() {
        return dirertorid;
    }

    public String getDirertoremil() {
        return dirertoremil;
    }

    public String getDirertorpassword() {
        return dirertorpassword;
    }
    
    public boolean Login(String username,String password){
   
     if(username.equals(username) && password.equals(password))
 
         return true;
       
       else
       return false;
 } 

public boolean Edit(String password){
   
       if(password.equals(password)){
      return true;
       }
       else{
       return false;
}
}
}