package com.sidos32.cardfacts;

public class cards {
    private String cardId;
    private String text;

    public cards (String cardId,String text){
        this.cardId = cardId;
        this.text = text;
    }

    public String getCardId(){
        return cardId;
    }

    public void setCardId (String cardId){
        this.cardId = cardId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


}
