package com.example.mappingPojoToPojo;

import com.example.Form;
import com.example.Form2;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _BeanUtilsTest {


    @Test
    public void beanUtils_FromPojoToPojo() throws InvocationTargetException, IllegalAccessException {
        // Origin
        Form2 form2 = new Form2();
        form2.setName("Andres");
        form2.setAge(33);

        // Dest
        Form formTarget = new  Form();

        BeanUtils.copyProperties(formTarget,form2);

        assertThat(formTarget.getName(), is("Andres"));
        assertThat(formTarget.getAge(), is(33));
    }


}
