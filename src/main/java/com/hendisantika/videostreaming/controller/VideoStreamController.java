package com.hendisantika.videostreaming.controller;

import com.hendisantika.videostreaming.service.VideoStreamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-video-streaming
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/20/23
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/video")
@RequiredArgsConstructor
public class VideoStreamController {

    private final VideoStreamService videoStreamService;
}
