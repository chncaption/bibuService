package com.bibu.tool;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public final class QueryTool {
    public static PageRequest buildPageRequest(int pageNum, int pageSize, String sortType, String sortField){
        Sort sort ;
        if("desc".equals(sortType)) {
            sort = Sort.by(Sort.Direction.DESC, sortField);
        } else {
            sort = Sort.by(Sort.Direction.ASC, sortField);
        }
        return PageRequest.of(pageNum, pageSize, sort);
    }
}
