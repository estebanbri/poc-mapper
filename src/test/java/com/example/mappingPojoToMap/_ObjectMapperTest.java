package com.example.mappingPojoToMap;

import com.example.Form2;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _ObjectMapperTest {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void ads() {
        // Origin
        Form2 form2 = new Form2();
        form2.setName("Andres");
        form2.setAge(33);

        Map<String, Object> triggerMap = objectMapper.convertValue(form2, new TypeReference<HashMap<String, Object>>() {});

        assertThat(triggerMap.get("name"), is("Andres"));
        assertThat(triggerMap.get("age"), is(33));
    }

}
