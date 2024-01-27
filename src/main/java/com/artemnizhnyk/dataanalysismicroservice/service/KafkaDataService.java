package com.artemnizhnyk.dataanalysismicroservice.service;

import com.artemnizhnyk.dataanalysismicroservice.model.Data;

public interface KafkaDataService {

    void handle(Data data);
}
