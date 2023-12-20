package com.hendisantika.videostreaming.config;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-video-streaming
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/20/23
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationConstants {
    public static final String VIDEO = "/video";

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String VIDEO_CONTENT = "video/";
    public static final String CONTENT_RANGE = "Content-Range";
    public static final String ACCEPT_RANGES = "Accept-Ranges";
    public static final String BYTES = "bytes";
    public static final int CHUNK_SIZE = 314700;
    public static final int BYTE_RANGE = 1024;

    private ApplicationConstants() {
    }
}
