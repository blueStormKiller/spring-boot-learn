package product.design3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lrt
 * @version V1.0.0
 * @date 2021/8/5 15:30
 * @description : 出库细码作业状态维护请求模型类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutOperationFineCodeRequestModel {

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 操作人
     */
    private String updateBy;

    /**
     * 操作节点编码
     */
    private OutOperationNodeEnum outOperationNodeEnum;

    /**
     * 细码操作模型类
     */
    private List<OutJobFineCodeModel> outJobFineCodeModelList;
}
