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
    @Autowired InvetoryManagementRepository invetoryManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRented_DecreaseInventory(@Payload Rented rented){

        if(!rented.validate()) return;

        System.out.println("\n\n##### listener DecreaseInventory : " + rented.toJson() + "\n\n");

        // Sample Logic //
        // InvetoryManagement invetoryManagement = new InvetoryManagement();
        // invetoryManagementRepository.save(invetoryManagement);
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRented_ChangeStatus(@Payload Rented rented){

        if(!rented.validate()) return;

        System.out.println("\n\n##### listener ChangeStatus : " + rented.toJson() + "\n\n");

        // Sample Logic //
        // InvetoryManagement invetoryManagement = new InvetoryManagement();
        // invetoryManagementRepository.save(invetoryManagement);
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCanceled_ChangeStatus(@Payload Canceled canceled){

        if(!canceled.validate()) return;

        System.out.println("\n\n##### listener ChangeStatus : " + canceled.toJson() + "\n\n");

        // Sample Logic //
        // InvetoryManagement invetoryManagement = new InvetoryManagement();
        // invetoryManagementRepository.save(invetoryManagement);
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReturned_ChangeStatus(@Payload Returned returned){

        if(!returned.validate()) return;

        System.out.println("\n\n##### listener ChangeStatus : " + returned.toJson() + "\n\n");

        // Sample Logic //
        // InvetoryManagement invetoryManagement = new InvetoryManagement();
        // invetoryManagementRepository.save(invetoryManagement);
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
