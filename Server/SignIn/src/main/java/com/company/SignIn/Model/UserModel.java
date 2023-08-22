package com.company.SignIn.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")
public class UserModel {
    @Id
    @Column(name = "name")
    String name;
    @Column(name = "email")
    String email;
    @Column(name= "password")
    String password;
    @Column(name="dob")
    String dob;

    public UserModel() {
    }

    public UserModel(String name, String email, String password, String dob) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.dob = dob;
    }

    public String getName () {
            return name;
        }

        public void setName(String name){
            this.name=name;
        }
        public String getEmail(){ return email; }

        public void setEmail(String email){
            this.email=email;
        }
        public String getPassword(){
            return password;
        }
        public void setPassword(String password){
            this.password=password;
        }
        public String getDob(){
            return dob;
        }
        public void setDob(String dob){
            this.dob=dob;
    }




}