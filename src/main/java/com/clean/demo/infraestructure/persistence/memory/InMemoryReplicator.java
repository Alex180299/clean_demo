package com.clean.demo.infraestructure.persistence.memory;

import com.clean.demo.adapters.ReplicatorAdapter;

import java.util.ArrayList;
import java.util.List;

public class InMemoryReplicator implements ReplicatorAdapter {
    private final List<String> replicated;

    public InMemoryReplicator() {
        this.replicated = new ArrayList<>();
    }

    @Override
    public void replicate(String text) {
        replicated.add(text);
    }
}
