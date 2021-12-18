package com.clean.demo.infraestructure.persistence.memory;

import com.clean.demo.adapters.FilterRepository;
import com.clean.demo.domain.Filter;

public class InMemoryFilter implements FilterRepository {
    private Filter filter;

    public InMemoryFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public Filter getFilter() {
        return this.filter;
    }
}
