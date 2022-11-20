package com.producer;

import com.config.SystemConfig;
import com.reader.FileReader;
import com.types.Data;
import com.util.JsonSerializer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.LongSerializer;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class Producer {
	
	public static int count = 0;

    public static void main(String[] args) {

        System.out.println("Initializing Producer...");
        Properties props = new Properties();
        props.put(ProducerConfig.CLIENT_ID_CONFIG, SystemConfig.producerApplicationID);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, SystemConfig.bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        KafkaProducer<Integer, Data> producer = new KafkaProducer<Integer, Data>(props);

        Data[] customers=FileReader.getInstance().getData();

        for(int i = 0; i < customers.length; i++) {

            ProducerRecord<Integer, Data> record=
                    new ProducerRecord<Integer, Data>(SystemConfig.topicName, i,customers[i]);
            try {

                RecordMetadata recordMetadata = producer.send(record).get();
                 count++;
                String message = String.format(count + " sent message to topic:%s partition:%s  offset:%s",
                        recordMetadata.topic(), recordMetadata.partition(), recordMetadata.offset());
                System.out.println(message);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }


    }
}


