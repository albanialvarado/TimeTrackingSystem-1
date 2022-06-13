package entities;

import java.sql.Time;

public class Request {

    private int timestampId;
    private Time newTime;
    private String description;
    private String status;
    private String type;

    public Request(int timestampId, Time newTime, String description, String status, String type) {
        this.timestampId = timestampId;
        this.newTime = newTime;
        this.description = description;
        this.status = status;
        this.type = type;
    }

    public int getTimestampId() {
        return timestampId;
    }

    public Time getNewTime() {
        return newTime;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }
}
