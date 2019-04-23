package ogorek;

import sun.rmi.runtime.Log;

public class Logowanie {

    private String currentname;
    private String currentpassword;
    private String msg;

    private boolean LogIn;
    public void setUserInDataBase(String username,String password){
            this.currentname = username;
            this.currentpassword=password;
    }

    public boolean  logIn(String username,String password){

        if(username.equals(currentname) && currentpassword.equals(password))
        {
            this.msg = "Udalo sie zalogowac";
            this.LogIn = true;
        }


        else
            this.msg = "Nie udalo sie zalogowac";
            this.LogIn = false;
            return LogIn;

    }

    public String getMsg(){
        return msg;
    }

    public boolean isLogIn(){
        return isLogIn();
    }
}
