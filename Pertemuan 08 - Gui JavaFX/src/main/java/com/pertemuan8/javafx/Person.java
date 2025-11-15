package com.pertemuan8.javafx;

import javafx.beans.property.*;

public class Person {
    private final StringProperty name = new SimpleStringProperty(this, "name", " ");
    private final IntegerProperty age = new SimpleIntegerProperty(this, "age", 0);
    private final StringProperty npm = new SimpleStringProperty(this, "npm", " ");

    public Person(String name, int age, String npm) {
        setName(name);
        setAge(age);
        setNPM(npm);}

    public String getName(){
        return name.get();}
    public int getAge(){
        return age.get();}
    public String getNPM(){
        return npm.get();}

    public void setName(String value){
        name.set(value);}
    public void setAge(int value){
        age.set(value);}
    public void setNPM(String value){
        npm.set(value);}
    
    public StringProperty nameProperty(){
        return name;}
    public IntegerProperty ageProperty(){
        return age;} 
    public StringProperty npmProperty(){
        return npm;} }