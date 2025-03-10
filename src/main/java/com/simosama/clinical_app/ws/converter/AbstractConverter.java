package com.simosama.clinical_app.ws.converter;

import java.util.List;

public abstract class AbstractConverter<T, DTO> {

    public abstract T toItem(DTO dto);
    public abstract DTO toDto(T t);

    public List<DTO> toDto(List<T> list) {
        List<DTO> result = null;
        if(list!=null) {
            result = list.stream().map(this::toDto).toList();
        }
        return result;
    }

    public List<T> toItem(List<DTO> list){
        List<T> result = null;
        if(list != null){
            result = list.stream().map(this::toItem).toList();
        }
        return result;
    }
}
