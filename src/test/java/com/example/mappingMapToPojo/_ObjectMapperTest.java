package com.example.mappingMapToPojo;

import com.example.Form;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _ObjectMapperTest {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void objectMapper_convertFromMapToPOJO() {
        // Origin
        Map<String, Object> formMap = new HashMap<>();
        formMap.put("name", "Esteban");
        formMap.put("age", 32);

        Form form = objectMapper.convertValue(formMap,Form.class);

        assertThat(form.getName(), is("Esteban"));
        assertThat(form.getAge(), is(32));
    }



}
