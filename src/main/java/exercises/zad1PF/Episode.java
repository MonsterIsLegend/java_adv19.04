package exercises.zad1PF;

import lombok.Data;

import java.util.List;
@Data
public class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;
    public Episode(String episodeName, int episodeNumber,
                   List<Video> videos) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;
    }


}
