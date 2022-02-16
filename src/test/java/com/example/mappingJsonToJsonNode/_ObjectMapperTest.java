package com.example.mappingJsonToJsonNode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _ObjectMapperTest {

    private static final ObjectMapper objectMapper = new ObjectMapper();


    @Test
    public  void objectMapper_convertJsonToJsonNode() throws JsonProcessingException {
        // Origin
        String json = "{\"name\":\"Esteban\",\"age\":32}";

        JsonNode jsonNode = objectMapper.readTree(json);

        assertThat(jsonNode.get("name").asText(), is("Esteban"));
        assertThat(jsonNode.get("age").asInt(), is(32));
    }
}
