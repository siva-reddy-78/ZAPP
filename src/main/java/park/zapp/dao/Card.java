package park.zapp.dao;

import java.sql.SQLOutput;

public class Card {
    private int card_id;
    private String guest_name;
    private int luxary_rating;
    private int credits;
    private int points;
    public Card()
    {
       super();
    }
    public Card(int card_id, String guest_name, int luxary_rating, int credits)
    {
         this.card_id = card_id;
         this.guest_name = guest_name;
         this.luxary_rating = luxary_rating;
         this.credits = credits;
         points = 0;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public int getLuxary_rating() {
        return luxary_rating;
    }

    public void setLuxary_rating(int luxary_rating) {
        this.luxary_rating = luxary_rating;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isMove()
    {
        return true;
    }
    public void move()
    {
        if(isMove())
        {
            credits -= 4;
            points++;
        }
    }
    public void pointsConversion()
    {
        if(points >=3)
        {
           credits++;
           points -= 3;
        }
        else
        {
            System.out.println("Not enough points to convert credits");
        }
    }
    public void topUp(int deposit)
    {
        credits += deposit;
    }
}
