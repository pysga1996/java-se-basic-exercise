package com.codegym.ex1;

public class TennisGame {

    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore;
        if (player1Score==player2Score)
        {
            score = setFirstScore(player1Score);
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            int scoreDifference = player1Score-player2Score;
            if (scoreDifference==1) score ="Advantage player1";
            else if (scoreDifference ==-1) score = "Advantage player2";
            else if (scoreDifference>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1Score;
                else { score+="-"; tempScore = player2Score;}
                score = setSecondScore(score, tempScore);
            }
        }
        return score;
    }

    private static String setSecondScore(String scoreName, int tempScore) {
        switch(tempScore)
        {
            case LOVE:
                scoreName += "Love";
                break;
            case FIFTEEN:
                scoreName += "Fifteen";
                break;
            case THIRTY:
                scoreName += "Thirty";
                break;
            case FORTY:
                scoreName += "Forty";
                break;
        }
        return scoreName;
    }

    private static String setFirstScore(int m_score1) {
        String scoreName;
        switch (m_score1)
        {
            case LOVE:
                scoreName = "Love-All";
                break;
            case FIFTEEN:
                scoreName = "Fifteen-All";
                break;
            case THIRTY:
                scoreName = "Thirty-All";
                break;
            case FORTY:
                scoreName = "Forty-All";
                break;
            default:
                scoreName = "Deuce";
                break;

        }
        return scoreName;
    }
}
