package com.clean.demo.configuration.test;

import com.clean.demo.adapters.ReplicatorAdapter;
import com.clean.demo.aplication.TextProcess;
import com.clean.demo.domain.Filter;
import com.clean.demo.infraestructure.persistence.memory.InMemoryFilter;
import com.clean.demo.infraestructure.persistence.memory.InMemoryReplicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SetLayers {
    @Bean
    public TextProcess textProcess() {
        Filter filter = new Filter("test_text");
        InMemoryFilter memoryFilter = new InMemoryFilter(filter);

        List<ReplicatorAdapter> adapters = new ArrayList<>();
        adapters.add(new InMemoryReplicator());

        return new TextProcess(memoryFilter, adapters);
    }
}
