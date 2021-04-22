package exercises.Zad1PF;

import java.util.List;

public interface SerialRepository {
    //listę wszystkich epizodów
    List<Episode> getAllEpisodes(List<Season> seasons);
    //listę wszystkich filmów
    List<Video> getAllVideo( List<Season> seasons);
    //listę wszystkich nazw video
    List<String> getAllVideonames (List<Season> seasons);
    //tylko video z parzystych epizodów i sezonów
    List<Video> getAllVideosWithEvenSeasonAndEvenEpisodes(List<Season> seasons);
    //tylko video typu Preview z nieparzystych epizodów i parzystych sezonów
    List<Video> getAllVideosWithPrewievAndOddEpisodesAndEvenSeasons( List<Season> seasons);
}
