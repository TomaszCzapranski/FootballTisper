package com.TMT.model.game;

import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;

import java.util.List;

public class pointCounter {

    int goodScoreBonus;
    int goodDiferenceBonus;
    int goodWinnerBonus;

    public pointCounter(int goodScoreBonus, int goodDiferenceBonus, int goodWinnreBonus) {
        this.goodScoreBonus = goodScoreBonus;
        this.goodDiferenceBonus = goodDiferenceBonus;
        this.goodWinnerBonus = goodWinnreBonus;
    }

    public void CountPoints(Profile profile) {

        List<UserBet> bets = profile.getBets();
        for (UserBet bet :
                bets) {
            Fixture fixture = bet.getFixture();

            int points=0;
            int winner;

            int betedHome = bet.getHomeGoalsBet();
            int betedAway = bet.getAwayGoalsBet();
            int realHome = fixture.getGoalsHomeTeam();
            int realeAway = fixture.getGoalsAwayTeam();

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



