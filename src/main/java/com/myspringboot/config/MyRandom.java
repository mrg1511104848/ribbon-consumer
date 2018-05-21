package com.myspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@ConfigurationProperties(prefix = "myrandom")
public class MyRandom {
    private String secret;
    private int number;
    private long bignumber;
    private String uuid;
    private int range10;
    private int rangeStartAndEnd;



    public String getSecret() {
        return secret;
    }

    public int getNumber() {
        return number;
    }

    public long getBignumber() {
        return bignumber;
    }

    public String getUuid() {
        return uuid;
    }

    public int getRange10() {
        return range10;
    }

    public int getRangeStartAndEnd() {
        return rangeStartAndEnd;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setRange10(int range10) {
        this.range10 = range10;
    }

    public void setRangeStartAndEnd(int rangeStartAndEnd) {
        this.rangeStartAndEnd = rangeStartAndEnd;
    }

    @Override
    public String toString() {
        return "MyRandom{" +
                "secret='" + secret + '\'' +
                ", number=" + number +
                ", bignumber=" + bignumber +
                ", uuid='" + uuid + '\'' +
                ", range10=" + range10 +
                ", rangeStartAndEnd=" + rangeStartAndEnd +
                '}';
    }
}
