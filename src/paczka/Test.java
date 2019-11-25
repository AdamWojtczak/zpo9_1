package paczka;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

    class Test {
        public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
            MaxSearchAlgorithms obj = new  MaxSearchAlgorithms();
            Class cls = obj.getClass();
            Method[] methods = cls.getDeclaredMethods();
            int[] tablica = { 1,8,5,4,3};
            for (Method method:methods)
            {
                if (method.getName().contains("Scan"))
                {
                    System.out.println( method.invoke(obj,tablica));
                }
            }

        }
    }


