package com.TMT.model.matches;

import java.time.LocalDate;

public class RequestFactory {



    public static String createRequestByRound (int league_id, int round){
             return "https://api-football-v1.p.rapidapi.com/v2/fixtures/league/" + league_id + "/Regular_Season_-_" + round +"?timezone=Europe/London";
    }
    public static String createRequestByDate(int league_id, LocalDate date){
        return "https://api-football-v1.p.rapidapi.com/v2/fixtures/league/" + league_id + "/" + date;
    }


}
