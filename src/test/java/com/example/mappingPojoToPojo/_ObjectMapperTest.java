package com.example.mappingPojoToPojo;

import com.example.Form;
import com.example.Form2;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _ObjectMapperTest {

    private static final com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();

    @Test
    public void objectMapper_FromPojoToPojo() {
        // Origin
        Form2 form2 = new Form2();
        form2.setName("Andres");
        form2.setAge(33);

        Form form = objectMapper.convertValue(form2,Form.class);

        assertThat(form.getName(), is("Andres"));
        assertThat(form.getAge(), is(33));
    }


}
