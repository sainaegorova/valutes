package com.example.listview;

public class DataFlags {

    private int flagID;
    private int nameID;
    private int abbreviationID;

    private int stolID;

    public DataFlags (int _flagID, int _nameID, int _abbreviationID, int _stolID){
        flagID = _flagID;
        nameID = _nameID;
        abbreviationID = _abbreviationID;
        stolID = _stolID;
    }

    public int getFlagID(){
        return flagID;
    }

    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }

    public int getStol(){
        return stolID;
    }

}
