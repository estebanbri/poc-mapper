package com.example.mappingMapToPojo;

import com.example.Form;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _BeanUtilsTest {


    @Test
    public void  beanUtils_convertFromMapToPOJO() throws InvocationTargetException, IllegalAccessException {
        // Origin
        Map<String, Object> formMap = new HashMap<>();
        formMap.put("name", "Esteban");
        formMap.put("age", 32);

        // Dest
        Form formTarget = new Form();

        BeanUtils.copyProperties(formTarget,formMap);

        assertThat(formTarget.getName(), is("Esteban"));
        assertThat(formTarget.getAge(), is(32));
    }

}
