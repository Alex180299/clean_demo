package com.clean.demo.aplication;

import com.clean.demo.adapters.FilterRepository;
import com.clean.demo.adapters.ReplicatorAdapter;
import com.clean.demo.domain.Filter;
import com.clean.demo.exceptions.NotReplicated;

import java.util.List;

public class TextProcess {
    private final FilterRepository filterRepository;
    private final List<ReplicatorAdapter> replicatorAdapters;

    public TextProcess(FilterRepository filterRepository, List<ReplicatorAdapter> replicatorAdapters) {
        this.filterRepository = filterRepository;
        this.replicatorAdapters = replicatorAdapters;
    }

    public void process(String text) throws NotReplicated {
        Filter filter = filterRepository.getFilter();

        if(filter.isValid(text)) {
            for (ReplicatorAdapter replicatorAdapter : replicatorAdapters) {
                replicatorAdapter.replicate(text);
            }
        } else {
            throw new NotReplicated("Text not replicated: " + text);
        }
    }
}
