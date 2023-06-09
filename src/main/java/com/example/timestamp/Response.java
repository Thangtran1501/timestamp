package com.example.timestamp;

import lombok.Data;

import java.util.Date;

@Data
public class Response {
    public long unix;
    public String utc;
}
