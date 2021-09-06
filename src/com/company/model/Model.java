package com.company.model;


public class Model {
    public void setFullName(String name, String secondName, String futhersName){
        StringBuilder concatString = new StringBuilder();
        concatString = concatString.append(name);
        concatString = concatString.append(secondName);
        concatString = concatString.append(futhersName);
        Data_saving.FULL_NAME = String.valueOf(concatString);
    }
    public void setFullAdress(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        Data_saving.FULL_ADRESS=String.valueOf(concatString);
    }
    public void setNameUkr(String word){
        Data_saving.NAME_UKR=word;
    }
    public void setLogin(String word){
        Data_saving.LOGIN=word;
    }
    public void setSecondName(String word){
        Data_saving.SECOND_NAME=word;
    }
    public void setFuthersName(String word){
        Data_saving.FATHERS_NAME=word;
    }
    public String getNameUkr(){
        return Data_saving.NAME_UKR;
    }
    public String getSecondName(){
        return Data_saving.SECOND_NAME;
    }
    public String getFuthersName(){
        return Data_saving.FATHERS_NAME;
    }

}
