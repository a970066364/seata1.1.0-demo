package app.itw.cloud.seata.storage.service.impl;


import app.itw.cloud.seata.storage.dao.StorageTblMapper;
import app.itw.cloud.seata.storage.entity.StorageTbl;
import app.itw.cloud.seata.storage.service.StorageTblService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

/**
 * 描述: 
 * author: Tsion
 * date: 2020-02-24
 */
@Service
public class StorageTblServiceImpl extends ServiceImpl<StorageTblMapper, StorageTbl> implements
    StorageTblService {

  @Override
  @GlobalTransactional
  public boolean update(StorageTbl storageTbl) {
    //假设异常，让分布式事务回滚
    if (storageTbl.getCount()%2==0){
      int a = 1/0;
    }
    return updateById(storageTbl);
  }
}
