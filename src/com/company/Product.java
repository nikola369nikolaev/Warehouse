package com.company;

public class Product{
    private String name;
    private String description;
    private String expiryDate;
    private String EntryDate;
    private String NameOfMaker;
    private String Weight;
    private String Location;
    private int MaxCount;
    public Product(String name,String description,String expiryDate,String EntryDate,String NameOfMaker,String Weight,String Location,int MaxCount){
        this.SetName(name);
        this.SetDescription(description);
        this.SetExpiryDate(expiryDate);
        this.SetEntryDate(EntryDate);
        this.SetNameOfMaker(NameOfMaker);
        this.SetWeight(Weight);
        this.SetMaxCount(MaxCount);
    }
    public Product(){
        this.SetName("1");
        this.SetDescription("2");
        this.SetExpiryDate("expiryDate");
        this.SetEntryDate("EntryDate");
        this.SetNameOfMaker("NameOfMaker");
        this.SetWeight("Weight");
        this.SetMaxCount(10);

    }
    public void SetName(String val){
        this.name = val;
    }
    public String GetName(){
        return this.name;
    }
    public void SetDescription(String val){
        this.description = val;
    }
    public String GetDescription(){
        return this.description;
    }
    public void SetExpiryDate(String val){
        this.expiryDate = val;
    }
    public String GetExpiryDate(){
        return this.expiryDate;
    }
    public void SetEntryDate(String val){
        this.EntryDate = val;
    }
    public String GetEntryDate(){
        return this.EntryDate;
    }
    public void SetNameOfMaker(String val){
        this.NameOfMaker = val;
    }
    public String GetNameOfMaker(){
        return this.NameOfMaker;
    }
    public void SetWeight(String val){
        this.Weight = val;
    }
    public String GetWeight(){
        return this.Weight;
    }
    public void SetLocation(String val){
        this.Location = val;
    }
    public String GetLocation(){
        return this.Location;
    }
    public void SetMaxCount(int val){
        this.MaxCount = val;
    }
    public int GetMaxCount(){
        return this.MaxCount;
    }

}
