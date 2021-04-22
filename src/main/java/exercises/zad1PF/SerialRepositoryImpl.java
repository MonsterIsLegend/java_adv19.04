package exercises.zad1PF;

import java.util.List;
import java.util.stream.Collectors;

public class SerialRepositoryImpl implements SerialRepository {
    @Override
    public List<Episode> getAllEpisodes(List<Season> seasons) {
        return seasons.stream()      //stream season
                .flatMap(s -> s.getEpisodes().stream())        //stream <Season> -> Streams<Episode>
                .collect(Collectors.toList());                 //List<Episode>

    }

    @Override
    public List<Video> getAllVideo(List<Season> seasons) {
        return  seasons.stream()      //stream season
                .flatMap(s -> s.getEpisodes().stream())        //stream <Season> -> Streams<Episode>
                .flatMap(e -> e.getVideos().stream() )
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllVideonames(List<Season> seasons) {
        return  getAllVideo(seasons).stream()
                .map(Video::getTitle)
                .collect(Collectors.toList());
    }

    @Override
    public List<Video> getAllVideosWithEvenSeasonAndEvenEpisodes(List<Season> seasons) {
            return  seasons.stream()      //stream season
                    .filter(season -> season.seasonNumber % 2 == 0)
                    .flatMap(s -> s.getEpisodes().stream())        //stream <Season> -> Streams<Episode>
                    .filter(episode -> episode.episodeNumber % 2 == 0)
                    .flatMap(e -> e.getVideos().stream() )
                    .collect(Collectors.toList());
        }


    @Override
    public List<Video> getAllVideosWithPrewievAndOddEpisodesAndEvenSeasons(List<Season> seasons) {
        return  seasons.stream()      //stream season
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(s -> s.getEpisodes().stream())        //stream <Season> -> Streams<Episode>
                .filter(episode -> episode.episodeNumber % 2 == 1)
                .flatMap(e -> e.getVideos().stream() )
                .filter(v -> v.getVideoType().equals(VideoType.PREVIEW))
                .collect(Collectors.toList());
    }
}
