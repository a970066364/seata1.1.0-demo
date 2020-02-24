package app.itw.cloud.seata.order.service.impl;

import app.itw.cloud.seata.client.StorageTblClient;
import app.itw.cloud.seata.order.dao.OrderTblMapper;
import app.itw.cloud.seata.order.entity.OrderTbl;
import app.itw.cloud.seata.order.service.OrderTblService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 描述: 
 * author: Tsion
 * date: 2020-02-24
 */
@Service
public class OrderTblServiceImpl extends ServiceImpl<OrderTblMapper, OrderTbl> implements
    OrderTblService {


  @Autowired
  private StorageTblClient storageTblClient;

  @Override
  @GlobalTransactional
  public String generateOrder(OrderTbl orderTbl) {
    //保存订单记录
    save(orderTbl);
    System.out.println("生成订单成功，id:"+orderTbl.getId()+",正在请求扣除库存");
    //发起扣除库存请求
    String json = storageTblClient.deduct(orderTbl.getCount());
    return "扣除库存成功,库存状态:"+json;
  }
}
