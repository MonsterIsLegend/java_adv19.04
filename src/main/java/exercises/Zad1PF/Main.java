package exercises.Zad1PF;

public class Main {
    public static void main(String[] args) {
    SerialRepository sr = new SerialRepositoryImpl();
        System.out.println("EPISODES");
        sr.getAllEpisodes(SerialData.seasons).forEach(System.out::println);
        System.out.println("VIDEOS");
        sr.getAllVideo(SerialData.seasons).forEach(System.out::println);
        System.out.println("VIDEONAMES");
        sr.getAllVideonames(SerialData.seasons).forEach(System.out::println);
        System.out.println("EVENEPandSE");
        sr.getAllVideosWithEvenSeasonAndEvenEpisodes(SerialData.seasons).forEach(System.out::println);
        System.out.println("PREVIEWandODDEPPandEVENSE");
        sr.getAllVideosWithPrewievAndOddEpisodesAndEvenSeasons(SerialData.seasons).forEach(System.out::println);
    }
}
