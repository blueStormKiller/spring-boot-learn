package product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author lrt
 * @description 库存分配线程
 * <p> <功能详细描述> </p>
 * @date 2021/10/18 22:58
 */
@Configuration
@EnableAsync
public class AllocateExecutor {

    private int corePoolSize = 10;
    private int maxPoolSize = 20;
    private int queueCapacity = 300;
    private String namePrefix = "allocate-thread-";

    @Bean(name = "allocateExecutorPool")
    public Executor executor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 配置核心线程数
        executor.setCorePoolSize(corePoolSize);
        // 配置最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        // 配置队列大小
        executor.setQueueCapacity(queueCapacity);
        // 配置线程池中的线程的名称前缀
        executor.setThreadNamePrefix(namePrefix);
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        /**
         AbortPolicy：将抛出RejectedExecutionException
         CallerRunsPolicy：直接在execute方法的调用线程中运行被拒绝的任务。
         DiscardOldestPolicy：放弃最旧的未处理请求，然后重试execute。
         DiscardPolicy：默认情况下它将丢弃被拒绝的任务。
         */
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }

}


