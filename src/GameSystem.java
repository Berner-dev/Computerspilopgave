public class GameSystem {

    private Game[] games;
    private Player[] players;
    private int gameCount;
    private int playerCount;

    // Konstruktør
    public GameSystem() {
        games = new Game[10];
        players = new Player[10];

        gameCount = 0;
        playerCount = 0;
    }

    public void addGame(Game game) {
        if (gameCount < games.length) {
            games[gameCount] = game;
            gameCount++;
        } else {
            System.out.println("Der er ikke plads til flere spil.");
        }
    }

    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        } else {
            System.out.println("Der er ikke plads til flere spillere.");
        }
    }

    public void displayAllGames() {
        for (int i = 0; i < gameCount; i++) {
            games[i].displayDetails();
        }
    }

    public void displayAllPlayers() {
        for (int i = 0; i < playerCount; i++) {
            players[i].displayDetails();
        }
    }

    public Game findGameById(int gameId) {
        for (int i = 0; i < gameCount; i++) {
            if (games[i].getGameId() == gameId) {
                return games[i];
            }
        }

        return null;
    }

    public Player findPlayerById(int playerId) {
        for (int i = 0; i < playerCount; i++) {
            if (players[i].getPlayerId() == playerId) {
                return players[i];
            }
        }

        return null;
    }

    public void updatePlayerScore(int playerId, double newScore) {
        Player player = findPlayerById(playerId);

        if (player != null) {
            player.updateScore(newScore);
            System.out.println("Spillerens score er opdateret.");
        } else {
            System.out.println("Spilleren blev ikke fundet.");
        }
    }

    public Player findTopScoringPlayer() {
        if (playerCount == 0) {
            return null;
        }

        Player topPlayer = players[0];

        for (int i = 1; i < playerCount; i++) {
            if (players[i].getScore() > topPlayer.getScore()) {
                topPlayer = players[i];
            }
        }

        return topPlayer;
    }
}