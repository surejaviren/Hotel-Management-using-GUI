/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementoop;

import java.io.Serializable;

/**
 *
 * @author shiva
 */
class SignInObjectmaker implements Serializable
{
        private String ObjName;
        private String ObjPassword;
        public void setName(String N)
        {
            this.ObjName = N;
        }
        public String getName(){
            return this.ObjName;
        }
        public void setPassword(String P){
            this.ObjPassword = P;
        }
        public String getPassword(){
            return this.ObjPassword;
        }
}
