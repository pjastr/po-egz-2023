package arrayAlg;

public class Test {

    public static void main(String[] args) {
        VideoGame[] games = new VideoGame[5];
        games[0] = new VideoGame("Halo 5: Guardians", "343 Industries", 9.0f);
        games[1] = new VideoGame("The Legend of Zelda: Breath of the Wild", "Nintendo", 10.0f);
        games[2] = new VideoGame("Horizon Zero Dawn", "Guerrilla Games", 9.5f);
        games[3] = new VideoGame("Mass Effect: Andromeda", "BioWare", 8.0f);
        games[4] = new VideoGame("The Legend of Zelda: Breath of the Wild", "Nintendo", 10.0f);
        System.out.println(Algorithm.findMaxIndex(games));
    }
}
