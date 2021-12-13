package product.design2;

import product.design2.dto.DubboResult;
import product.design2.dto.OperationTypeEnum;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Dubbo服务上下文
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/8/16
 */
@Component
public class FacadeServiceContext implements ApplicationContextAware {
    private static final Map<OperationTypeEnum, FacadeService<?, ?>> facadeServiceCache = new HashMap<>();

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void init() {
        Map<String, FacadeService> map = applicationContext.getBeansOfType(FacadeService.class);
        if (map.isEmpty()) {
            return;
        }
        for (FacadeService service : map.values()) {
            facadeServiceCache.put(service.getOperationType(), service);
        }
    }

    public <R, P> DubboResult<R> execute(OperationTypeEnum operationType, P requestParam) {
        FacadeService service = facadeServiceCache.get(operationType);
        if (null == service) {
            return DubboResult.fail("Dubbo服务未注册");
        }
        return service.execute(requestParam);
    }

}


