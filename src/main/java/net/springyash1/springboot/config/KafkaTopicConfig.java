package net.springyash1.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic yashFirstTopic() {
        return TopicBuilder.name("yashTopic1").build();
    }

    @Bean
    public NewTopic yashFirstTopicJson() {
        return TopicBuilder.name("yashTopic1_json").build();
    }
}
