package com.example.mappingMapToPojo;

import com.example.Form;
import org.dozer.DozerBeanMapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _DozerTest {

    private DozerBeanMapper dozer = new DozerBeanMapper();

    @Test
    public void dozer_convertFromMapToPOJO() {
        // Origin
        Map<String, Object> formMap = new HashMap<>();
        formMap.put("name", "Esteban");
        formMap.put("age", 32);

        Form form = dozer.map(formMap,Form.class);

        assertThat(form.getName(), is("Esteban"));
        assertThat(form.getAge(), is(32));
    }


}
