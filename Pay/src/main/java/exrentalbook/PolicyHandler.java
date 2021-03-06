package exrentalbook;

import exrentalbook.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired PayRepository payRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCanceled_CancelPay(@Payload Canceled canceled){

        if(!canceled.validate()) return;

        System.out.println("\n\n##### listener CancelPay : " + canceled.toJson() + "\n\n");

        // Sample Logic //
        // Pay pay = new Pay();
        // payRepository.save(pay);
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCanceled_CancelPay(@Payload Canceled canceled){

        if(!canceled.validate()) return;

        System.out.println("\n\n##### listener CancelPay : " + canceled.toJson() + "\n\n");

        // Sample Logic //
        // Pay pay = new Pay();
        // payRepository.save(pay);
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
