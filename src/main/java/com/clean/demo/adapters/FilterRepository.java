package com.clean.demo.adapters;

import com.clean.demo.domain.Filter;

public interface FilterRepository {
    void setFilter(Filter filter);

    Filter getFilter();
}
