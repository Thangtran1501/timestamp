package com.example.timestamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class TimestampController {

    @GetMapping("/api/{date}")
    public Response getTimestamp(@PathVariable long date) {
        Response response = new Response();
        SimpleDateFormat sdf = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        Date utc = new Date(date);
        response.setUtc(sdf.format(utc));
        response.setUnix(date);
        return response;
    }
}
