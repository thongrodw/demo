package com.example.demo.controller;

import com.example.demo.model.InsurableEntityResponse;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, InsurableEntityResponse> kafkaProducer;

    @PostMapping(value = "/send")
    public ResponseEntity<String> sendMessage(@RequestBody InsurableEntityResponse message, @RequestParam Integer repetitions) {
        String topic = "dev.itmp-agcs.lcuwwb.ie.insurableentityresponse";
        String key = "handover";
        String headerKey = "is-last-record";

        for (int i = 0; i < repetitions; i++) {
            boolean isLastRecord = (i == repetitions - 1);

            // Create headers
            List<Header> headers = new ArrayList<>();
            headers.add(new RecordHeader(headerKey, String.valueOf(isLastRecord).getBytes(StandardCharsets.UTF_8)));

            // Create a ProducerRecord with headers
            ProducerRecord<String, InsurableEntityResponse> producerRecord = new ProducerRecord<>(topic, null, key, message, headers);

            // Send the message
            kafkaProducer.send(producerRecord);
        }
        System.out.println("Successfully processed "+repetitions+ " locations");
        return ResponseEntity.ok("Successfully sent "+repetitions+ " locations");
    }

}
