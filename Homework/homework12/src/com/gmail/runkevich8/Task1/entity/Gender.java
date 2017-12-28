package com.gmail.runkevich8.Task1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


public enum Gender {
    @JsonProperty("0")   // приходит из файла
            M,
    @JsonProperty("1")
            W

}
