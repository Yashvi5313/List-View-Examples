package com.example.listview;

public class NumbersView {
    private int ivNumbersImageId;
    private String mNumberInDigit;
    private String mNumbersInText;
    private boolean ivStarImageId;
    private int aNumberOfDigit;

    public NumbersView(int NumbersImageId, String NumberInDigit, String NumbersInText, boolean StarImageId, int NumberOfDigit){
        ivNumbersImageId = NumbersImageId;
        mNumberInDigit = NumberInDigit;
        mNumbersInText = NumbersInText;
        ivStarImageId = StarImageId;
        aNumberOfDigit = NumberOfDigit;
    }

    public int getNumbersImageId(){
        return ivNumbersImageId;
    }

    public String getNumberInDigit() {
        return mNumberInDigit;
    }

    public String getmNumbersInText(){
        return mNumbersInText;
    }

    public boolean getivStarImageId() {
        return ivStarImageId;
    }

    public void setIvStarImageId(boolean ivStarImageId) {
        this.ivStarImageId = ivStarImageId;
    }

    public int getaNumberOfDigit() {
        return aNumberOfDigit;
    }

    public void addToNumber(){
        this.aNumberOfDigit += 1;
    }

    public void removeFromNumber(){
        if(this.aNumberOfDigit >= 1){
            this.aNumberOfDigit -=1;
        }
    }
}

