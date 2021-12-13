package product.design2.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础数据对象
 * <p> <功能详细描述> </p>
 *
 * @author lrt
 * @version 1.0
 * @date 2021/6/10
 */
@Data
public class BaseFacadeDTO implements Serializable {
    private static final long serialVersionUID = -7971924482997452611L;

    /** 创建时间 */
    private Date createTime;
    /** 创建人 */
    private String createBy;
    /** 修改时间 */
    private Date modifyTime;
    /** 修改人 */
    private String modifyBy;
    /** 版本号 */
    private Integer version;
    /** 已删除 */
    private Long isDeleted;

}


