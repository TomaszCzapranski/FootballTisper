package com.TMT.model.game;

import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;

import java.util.List;

public class PointCounter {

    int goodScoreBonus;
    int goodDiferenceBonus;
    int goodWinnerBonus;

    public PointCounter(int goodScoreBonus, int goodDiferenceBonus, int goodWinnreBonus) {
        this.goodScoreBonus = goodScoreBonus;
        this.goodDiferenceBonus = goodDiferenceBonus;
        this.goodWinnerBonus = goodWinnreBonus;
    }

    public void countPoints(Profile profile) {

        List<UserBet> bets = profile.getBets();
        for (UserBet bet :
                bets) {
            Fixture fixture = bet.getFixture();


//przywrocic pobieranie
//            int betedHome = bet.getHomeGoalsBet();
//            int betedAway = bet.getAwayGoalsBet();
//            int realHome = fixture.getGoalsHomeTeam();
//            int realeAway = fixture.getGoalsAwayTeam();

            int betedHome = 1;
            int betedAway = 2;
            int realHome = fixture.getGoalsHomeTeam();
            int realeAway = fixture.getGoalsAwayTeam();

            if (fixture.getStatusShort().equals("FT")) {
                int points = 0;
                int winner;

                if (betedHome == realHome && betedAway == realeAway) {
                    points += goodScoreBonus;
                    if (betedHome - betedAway == realHome - realeAway) {
                        points += goodDiferenceBonus;
                    }
                    if (realHome > realeAway && betedHome > betedAway) {
                        points += goodWinnerBonus;
                    } else if (realeAway == realHome && betedHome == betedAway) {
                        points += goodWinnerBonus;
                    } else if (realHome < realeAway && betedHome < betedAway) {
                        points += goodWinnerBonus;
                    }
                    bet.setPoints(points);
                }
            }
        }
    }
}



