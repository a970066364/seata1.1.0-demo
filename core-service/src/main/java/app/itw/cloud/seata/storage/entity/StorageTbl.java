package app.itw.cloud.seata.storage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 描述: 
 * author: Tsion
 * date: 2020-02-24
 */
@TableName("storage_tbl")
public class StorageTbl implements Serializable {


    private static final long serialVersionUID = 1L;
    /**
     * 
     */
    @TableId(value="id", type= IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String commodityCode;

    /**
     * 
     */
    private Integer count;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getCommodityCode() {
	return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }
    public Integer getCount() {
	return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}