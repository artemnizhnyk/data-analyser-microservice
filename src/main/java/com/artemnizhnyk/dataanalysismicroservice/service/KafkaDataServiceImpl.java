package com.artemnizhnyk.dataanalysismicroservice.service;

import com.artemnizhnyk.dataanalysismicroservice.model.Data;
import com.artemnizhnyk.dataanalysismicroservice.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class KafkaDataServiceImpl implements KafkaDataService {

    private final DataRepository dataRepository;

    @Override
    public void handle(final Data data) {
        dataRepository.save(data);
        log.info("Data object {} was saved", data);
    }
}
