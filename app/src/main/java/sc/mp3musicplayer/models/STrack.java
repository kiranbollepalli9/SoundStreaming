package sc.mp3musicplayer.models;


import sc.mp3musicplayer.constants.Constants;

/**
 * Search Track (STrack) is the model that represents a track that is getting from a query.
 */
public class STrack implements ITrack{

    private String title;
    private String genre;
    private String duration;
    private String artwork_url;
    private String stream_url;
    private String download_url;

    /**
     *
     * @return
     *     track title.
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     *
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     *
     * @return
     *   Duration in milliseconds.
     */
    public String getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     *   URL to a JPEG image.
     */
    public String getArtwork_url() {
        return artwork_url;
    }

    /**
     *
     * @param artwork_url
     */
    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
    }

    /**
     *
     * @return
     *    link to 128kbs mp3 stream.
     */
    public String getStream_url() {
        return stream_url + Constants.CREDENTIALS;
    }

    /**
     *
     * @param stream_url
     */
    public void setStream_url(String stream_url) {
        this.stream_url = stream_url;
    }


    /**
     *
     * @return
     *   URL to original file.
     */
    public String getDownload_url() {
        return download_url;
    }

    /**
     *
     * @param download_url
     */
    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    @Override
    public String getImage() {
        return getArtwork_url();
    }

    @Override
    public String getUrl() {
        return getStream_url();
    }

    @Override
    public String getJPG(){
        return "/"+getTitle() + Constants.JPG;
    }

    @Override
    public String getMP3(){
        return "/"+getTitle() + Constants.MP3;
    }


}
