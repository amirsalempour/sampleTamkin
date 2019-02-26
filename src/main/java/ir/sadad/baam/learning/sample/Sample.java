package ir.sadad.baam.learning.sample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.invokeClassMethod("ir.sadad.baam.learning.sample.ClassLoaderSample", "getFirstStudentCource");
        sample.invokeClassMethod("ir.sadad.baam.learning.sample.ClassLoaderSample", "getSecondWay");
    }

   private void invokeClassMethod(String classBinName, String methodName) {
        try {
            ClassLoader classLoader = this.getClass().getClassLoader();

            Class<?> aClass = classLoader.loadClass(classBinName);
            Constructor constructor = aClass.getConstructor();
            Object instance = constructor.newInstance();
            Method method = aClass.getMethod(methodName,List.class);
            Object invoke = method.invoke(instance, Arrays.asList("Amir sp", "FGH", "Shiva", "Moha"));
            System.out.println("invoke is:: "+invoke);
        } catch (ClassNotFoundException e) {
            System.out.println("exceprion occured , message is ::" + e.getMessage());
        } catch (Exception e) {
            System.out.println("exceprion occured , message is ::" + e.getMessage());
        }
    }
}
