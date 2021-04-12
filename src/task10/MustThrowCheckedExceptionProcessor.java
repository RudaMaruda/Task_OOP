package task10;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class MustThrowCheckedExceptionProcessor {

    public void check(Product product) throws RuntimeException{
        Class<? extends Product> productClass = product.getClass();

        for (Method method : productClass.getMethods()) {
            MustThrowCheckedException annotation = method.getAnnotation(MustThrowCheckedException.class);

//            if (annotation != null){
//                Class<?>[] exeptionType = method.getExceptionTypes();
//                if (exeptionType.length ==0){
//                    throw new RuntimeException("Method "+ method.getName()+
//                            " from class"+ product +"doesnt throw checked exception!");
//                }
//                final boolean hasUncheckedExeptions = Arrays.stream();
//            }

        }

    }
}
