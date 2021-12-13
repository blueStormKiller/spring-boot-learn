package product.design3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lrt
 * @version V1.0.0
 * @date 2021/8/5 15:26
 * @description : 出库作业细码类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutJobFineCodeModel {

    /**
     * 出库单号
     */
    private String outOrderNo;

    /**
     * 细码编码
     */
    private String fineCode;

    /**
     * 容器编码
     */
    private String containerCode;

    /**
     * 细码作业状态
     * 除了  作业节点为 pick 拣选的时候(下一个作业状态有可能是批次集货，集货) 需要手动指定
     * 其他作业节点  调用 OutFineCodeStatusEnum.getCodeByOutOperationNodeEnum(OutOperationNodeEnum outOperationNodeEnum)
     * 直接获取 细码作业状态
     */
    private String fineCodeJobStatus;


    /**
     * 异常是否处理
     * 0 异常未处理
     * 1 异常中心回传细码处理结果
     */
    private Integer exceptionDispose;

}
