package com.example.kotlin_simple_adapter.model

class User(var profilee:Int, var fullname:String){

    fun getProfile():Int{
        return profilee;
    }
    fun getfullname():String{
        return fullname
    }
    fun setProfile(profile:Int){
        this.profilee=profile;
    }

    fun setFulnamee(fullname:String){
        this.fullname=fullname;
    }
}