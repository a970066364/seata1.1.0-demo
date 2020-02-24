package app.itw.cloud.seata.order.service;


import app.itw.cloud.seata.order.entity.OrderTbl;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 描述: 
 * author: Tsion
 * date: 2020-02-24
 */
public interface OrderTblService extends IService<OrderTbl> {

  /**
   * 生成订单
   * @param orderTbl
   * @return
   */
  String generateOrder(OrderTbl orderTbl);
}
