package com.prod.event.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventDTO {
    @JsonProperty("id")
    private  int eventId;
    @JsonProperty("name")
    private String eventName;
    @JsonProperty("location")
    private String location;
}
