package app.itw.cloud.seata.storage.service;


import app.itw.cloud.seata.storage.entity.StorageTbl;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 描述: 
 * author: Tsion
 * date: 2020-02-24
 */
public interface StorageTblService extends IService<StorageTbl> {

  boolean update(StorageTbl storageTbl);
}
