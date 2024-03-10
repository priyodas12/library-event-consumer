package io.learn.kafka.libraryeventconsumer.consumer;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LibraryEventConsumer {

  @KafkaListener(topics = "library-event")
  public void consumeLibraryEvent(ConsumerRecord<UUID,String> consumerRecord){
    log.info("Consumed record: {}",consumerRecord);
  }

}
