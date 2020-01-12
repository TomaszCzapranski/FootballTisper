package com.TMT.model.matches;

public class RequestFactory {



    public static String createRequest (int league_id, int round){
             return "https://api-football-v1.p.rapidapi.com/v2/fixtures/league/" + league_id + "/Regular_Season_-_" + round +"?timezone=Europe/London";
    }


}
