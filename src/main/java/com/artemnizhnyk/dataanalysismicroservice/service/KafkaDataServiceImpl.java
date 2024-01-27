package com.artemnizhnyk.dataanalysismicroservice.service;

import com.artemnizhnyk.dataanalysismicroservice.model.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class KafkaDataServiceImpl implements KafkaDataService {

    @Override
    public void handle(final Data data) {
        log.info("Data object is received: " + data.toString());
    }
}
