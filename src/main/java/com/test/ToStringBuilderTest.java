package com.test;


import java.util.ArrayList;
import java.util.List;


import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


public class ToStringBuilderTest {


    public static void main(String[] args) {


        List<TestBean> list = new ArrayList<TestBean>();
        TestBean be = new TestBean();
        be.setBeanName(null);
        list.add(new TestBean());
        for (int i = 0; i < 20; i++) {
            TestBean bean = new TestBean();
            bean.setBeanName("name" + i);
            bean.setNu(i);
            list.add(bean);
        }


        for (TestBean b : list) {


//            String str = ToStringBuilder.reflectionToString(b);
            System.out.println(b.toString());
        }
    }
}


class TestBean {
    private String beanName;
    private int nu;


    public TestBean() {
// TODO Auto-generated constructor stub
    }

    public TestBean(String beanName, int nu) {
        this.beanName = beanName;
        this.nu = nu;
    }


    public String getBeanName() {
        return beanName;
    }


    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }


    public int getNu() {
        return nu;
    }


    public void setNu(int nu) {
        this.nu = nu;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
