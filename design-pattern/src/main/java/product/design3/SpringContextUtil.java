package product.design3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author lrt
 * @version V1.0.0
 * @date 2021/8/5 19:11
 * @description : 简述类的作用
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;


    }


    /**
     * 根据bean 的类型返回 bean 的map
     * @param className
     * @param <T>
     * @return
     */
    public <T> Map<String, T> getBeansOfType(@Nullable Class<T> className){
        return  applicationContext.getBeansOfType(className);
    }

}
