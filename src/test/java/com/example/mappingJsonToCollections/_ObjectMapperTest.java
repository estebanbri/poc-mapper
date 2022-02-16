package com.example.mappingJsonToCollections;

import com.example.Form;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _ObjectMapperTest {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void objectMapper_convertJsonToMap() throws JsonProcessingException {
        // Origin
        String json = "{\"name\":\"Esteban\",\"age\":32}";

        Map<String, Object> map = objectMapper.readValue(json, new TypeReference<Map<String,Object>>(){});

        assertThat(map.get("name"), is("Esteban"));
        assertThat(map.get("age"), is(32));
    }

    @Test
    public void asd() throws JsonProcessingException {
        // Origin
        String jsonCarArray =
                "[{\"name\":\"Andres\",\"age\":23}, {\"name\":\"Esteban\",\"age\":32}]";

        List<Form> formList = objectMapper.readValue(jsonCarArray, new TypeReference<List<Form>>(){});

        assertThat(formList.size(), is(2));
        assertThat(formList.get(0).getName(), is("Andres"));
        assertThat(formList.get(0).getAge(), is(23));
        assertThat(formList.get(1).getName(), is("Esteban"));
        assertThat(formList.get(1).getAge(), is(32));
    }

}
