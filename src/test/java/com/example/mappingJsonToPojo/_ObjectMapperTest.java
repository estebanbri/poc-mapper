package com.example.mappingJsonToPojo;

import com.example.Form;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _ObjectMapperTest {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void objectMapper_convertJsonToPOJO() throws JsonProcessingException {
        // Origin
        String json = "{\"name\":\"Esteban\",\"age\":32}";

        Form form = objectMapper.readValue(json,Form.class);

        assertThat(form.getName(), is("Esteban"));
        assertThat(form.getAge(), is(32));
    }

}
