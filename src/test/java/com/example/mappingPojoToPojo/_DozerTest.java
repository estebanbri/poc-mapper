package com.example.mappingPojoToPojo;

import com.example.Form;
import com.example.Form2;
import org.dozer.DozerBeanMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class _DozerTest {

    private DozerBeanMapper dozer = new DozerBeanMapper();

    @Test
    public void dozer_convertFromMapToPOJO() {
        // Origin
        Form form = new Form();
        form.setName("Andres");
        form.setAge(33);

        Form2 form2 = dozer.map(form,Form2.class);

        assertThat(form2.getName(), is("Andres"));
        assertThat(form2.getAge(), is(33));
    }

}
